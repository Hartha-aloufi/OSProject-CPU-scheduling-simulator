/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

 public class Proccess implements Comparable<Proccess>{
        public int arrival, burest, finsh, turnaround, waiting, priority, id, remBurst;
     
        public Proccess(int id, int arrival, int burest) {
            this.id = id;
            this.arrival = arrival;
            this.burest = burest;
            remBurst = burest;
        }
        
        public Proccess(){}

    @Override
    public int compareTo(Proccess t) {
        int x = this.priority - t.priority;
        if(x != 0)
            return x;
        return this.burest - t.burest;
    }

    @Override
    public String toString() {
        return String.format("ID : %d\t\t Arrival : %d\t\tBurst : %d\t\tFinsh : %d\t\tTuraround : %d\t\tWaiting : %s\n",this.id, this.arrival, this.burest, this.finsh, this.turnaround, this.waiting);
    }
        
        
    }
    