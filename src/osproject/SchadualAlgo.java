/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import javax.swing.JPanel;

/**
 *
 * @author harth
 */
public class SchadualAlgo {

    public static final String proccessT[] = {"first come first serve", "shortest job first", "priority scheduling",
        "round robin"};

    Proccess[] p;
    int quantum, contextSwitch;
    DrawingInstructions drawingInstructions;

    public SchadualAlgo(Proccess[] p) {
        this.p = p;
        drawingInstructions = new DrawingInstructions();

    }

    public void FCFS() {
        Arrays.sort(p, new Comparator<Proccess>() {

            @Override
            public int compare(Proccess t, Proccess t1) {
                if (t.arrival - t1.arrival != 0) {
                    return t.arrival - t1.arrival;
                }
                return t.burest - t.burest;
            }
        });

        int currentTime = p[0].arrival;
        for (int i = 0; i < p.length; i++) {
            p[i].finsh = currentTime + p[i].burest;
            p[i].turnaround = p[i].finsh - p[i].arrival;
            p[i].waiting = p[i].turnaround - p[i].burest;

            drawingInstructions.add(new Instruction(p[i].id, currentTime, p[i].finsh));

            currentTime = p[i].finsh + contextSwitch;
            if (i + 1 < p.length) {
                currentTime = Math.max(currentTime, p[i + 1].arrival);
            }
        }
    }

    public void SJF(boolean isPremitive) {
        PriorityQueue<Proccess> priorityQueue = new PriorityQueue<>();
        int currentTime = Integer.MAX_VALUE;
        Proccess arr[] = new Proccess[p.length];

        for (int i = 0; i < p.length; i++) {
            currentTime = Math.min(currentTime, p[i].arrival);
            arr[i] = p[i];
        }

        Arrays.sort(p);
        Arrays.sort(arr, (Proccess t, Proccess t1) -> {
            int z = t.arrival - t1.arrival;
            if (z != 0) {
                return z;
            }

            return t.burest - t1.burest;
        });

        int pointer = 0;
        while (pointer < arr.length && currentTime >= arr[pointer].arrival) {
            priorityQueue.add(arr[pointer++]);
        }

        if (isPremitive) {
            SJF_premitive(p, arr, priorityQueue, pointer, currentTime);
        } else {
            SJF_nonPremitive(p, arr, priorityQueue, pointer, currentTime);
        }
    }

    private void SJF_nonPremitive(Proccess[] p, Proccess[] arr, PriorityQueue<Proccess> priorityQueue, int pointer, int currentTime) {

        while (pointer < p.length || !priorityQueue.isEmpty()) {
            if (!priorityQueue.isEmpty()) {
                Proccess curP = priorityQueue.poll();
                curP.finsh = currentTime + curP.burest;
                curP.turnaround = curP.finsh - curP.arrival;
                curP.waiting = curP.turnaround - curP.burest;

                drawingInstructions.add(new Instruction(curP.id, currentTime, curP.finsh));
                currentTime = curP.finsh + contextSwitch;
            } else if (pointer < p.length) {
                currentTime = p[pointer].arrival;
            }

            while (pointer < arr.length && currentTime >= arr[pointer].arrival) {
                priorityQueue.add(arr[pointer++]);
            }
        }
    }

    private void SJF_premitive(Proccess[] p, Proccess[] arr, PriorityQueue<Proccess> priorityQueue, int pointer, int currentTime) {

        while (pointer < p.length || !priorityQueue.isEmpty()) {
            if (!priorityQueue.isEmpty()) {
                Proccess curP = priorityQueue.poll();

                int jobTime = curP.remBurst;

                for (int i = pointer; i < arr.length; i++) {

                    if (i < arr.length && arr[i].burest < curP.remBurst - (arr[i].arrival - currentTime)) {
                        jobTime = arr[i].arrival - currentTime;
                        break;
                    }
                }

                drawingInstructions.add(new Instruction(curP.id, currentTime, currentTime + jobTime));

                curP.remBurst -= jobTime;
                currentTime += jobTime;

                if (curP.remBurst != 0) {
                    priorityQueue.add(curP);
                } else {
                    curP.finsh = currentTime;
                    curP.turnaround = curP.finsh - curP.arrival;
                    curP.waiting = curP.turnaround - curP.burest;
                }

                currentTime += contextSwitch;

            } else if (pointer < p.length) {
                currentTime = p[pointer].arrival;
            }

            while (pointer < arr.length && currentTime >= arr[pointer].arrival) {
                priorityQueue.add(arr[pointer++]);
            }
        }
    }

    public void roundRobin() {
        ArrayList<Proccess> process = new ArrayList();
        Collections.addAll(process, p);
        Collections.sort(process, new Comparator<Proccess>() {

            @Override
            public int compare(Proccess t, Proccess t1) {
                int z = t.arrival - t1.arrival;
                if (z != 0) {
                    return z;
                }

                return t.burest - t1.burest;
            }

        });

        int currentTime = process.get(0).arrival, index = 0;
        while (true) {
            Proccess curP = process.get(index);
            int jobTime = Math.min(curP.remBurst, quantum);
            drawingInstructions.add(new Instruction(curP.id, currentTime, currentTime + jobTime));

            currentTime += jobTime;
            curP.remBurst -= jobTime;

            if (curP.remBurst == 0) {
                curP.finsh = currentTime;
                curP.turnaround = curP.finsh - curP.arrival;
                curP.waiting = curP.turnaround - curP.burest;
                process.remove(index);
                p[curP.id] = curP;
            }

            if (process.isEmpty()) {
                break;
            }

            index = (index + 1) % process.size();
            currentTime = Math.max(process.get(index).arrival, currentTime);
        }
    }

    public void priorityScheduling() {
        Arrays.sort(p);
        
        int currentTime = p[0].arrival;
        for (int i = 0; i < p.length; i++) {
            p[i].finsh = currentTime + p[i].burest;
            p[i].turnaround = p[i].finsh - p[i].arrival;
            p[i].waiting = p[i].turnaround - p[i].burest;

            drawingInstructions.add(new Instruction(i, currentTime, p[i].finsh));

            currentTime = p[i].finsh + contextSwitch;
            if (i + 1 < p.length) {
                currentTime = Math.max(currentTime, p[i + 1].arrival);
            }
        }
    }
    
}

class Test {

    public static void main(String[] args) {
        Proccess[] p = new Proccess[5];
        p[0] = new Proccess(0, 0, 7);
        p[1] = new Proccess(1, 2, 3);
        p[2] = new Proccess(2, 2, 5);
        p[3] = new Proccess(3, 4, 1);
        p[4] = new Proccess(4, 10, 4);

        SchadualAlgo scAlgo = new SchadualAlgo(p);
        scAlgo.quantum = 4;
        scAlgo.roundRobin();

        for (int i = 0; i < 5; i++) {
            System.out.println(p[i]);
        }
        for (int i = 0; i < scAlgo.drawingInstructions.count(); i++) {
            System.out.println(scAlgo.drawingInstructions.getInstruction(i));
        }
    }
}
