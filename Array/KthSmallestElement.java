import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {

        int[] arr = {5, 4, 6, 7, 1, 2, 8} ; 
        int k = 3 ; 
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()) ; // max heap 

        for(int i= 0 ; i < k ; i++){
            maxHeap.add(arr[i]) ; 
        }

        for(int i=k ; i < arr.length ; i++){
            if(arr[i] < maxHeap.peek()){
                maxHeap.poll() ; 
                maxHeap.add(arr[i]) ; 
            }
        }

        System.out.println("Kth smallest element: " + maxHeap.peek());

    }
}

/*
1. Create a Max Heap.

2. Insert the first k elements of the array into the Max Heap.

3. Traverse the remaining elements.

   - If the current element is smaller than the root of the Max Heap:
       • Remove the root.
       • Insert the current element.

4. After processing all the elements, the root of the Max Heap is the kth smallest element.
*/