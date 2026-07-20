import java.util.PriorityQueue;

public class KthLargestElement{
    public static void main(String[] args) {
        
        int[] arr = {5, 4, 6, 7, 1, 2, 8} ; 
        int k = 3 ; 

        PriorityQueue<Integer> pq = new PriorityQueue<>() ; // min heap 

        for(int i= 0 ; i < k ; i++){
            pq.add(arr[i]) ; 
        }

        for(int i=k ; i < arr.length ; i++){
            if(arr[i] > pq.peek()){
                pq.poll() ; 
                pq.add(arr[i]) ; 
            }
        }

        System.out.println("Kth largest element: " + pq.peek());

    }
}

/*
1. Create a min heap 
2. Traverse and insert the elements from array in the min heap till k elements 
3. Traverse the remaining elements 
4. If the current element is greater than the root of the min heap 

    - Remove the root
    - Insert the current element 

5. After processing all elements, the roots of the Min heap is the kth largest element 
*/