/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author harth
 */
public class DrawingInstructions {
    private ArrayList<Instruction> instructions;

    public DrawingInstructions() {
        instructions = new ArrayList();
    }
    
    public void add(Instruction ins){
        instructions.add(ins);
    }
    
    public Instruction getInstruction(int index){
        return instructions.get(index);
    }
    
    public int count(){
        return instructions.size();
    }
    
    public void sortOnId(){
        Collections.sort(this.instructions);
    }
}

class Instruction implements Comparable<Instruction>{
    public int processId, from, to;
    
    public Instruction(int processId, int from, int to) {
        this.processId = processId;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format("P%d\t\tfrom : %d\t\tTo : %d\n", processId, from!=to?from:0, from!=to?to:0);
    }

    @Override
    public int compareTo(Instruction t) {
        return this.processId - t.processId;
    }
    
    
}




