package Heap;

import java.util.PriorityQueue;

public class Implementation {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ; // min-heap
        
        // inserting elements 

        minHeap.add(10) ; 
        minHeap.add(50) ; 
        minHeap.add(30) ; 
        minHeap.add(40) ; 

        System.out.println("Min heap: " + minHeap);
 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>() ; // max-heap 


    }
}
