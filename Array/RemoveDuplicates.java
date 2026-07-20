// remove duplicates from the unsorted array 

import java.util.HashSet;

public class RemoveDuplicates {
    public static void usingHashSet(int[] arr){

        HashSet<Integer> unique = new HashSet<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            int element = arr[i] ; 
            if(!unique.contains(element)){
                unique.add(element) ; 
            }
        }

        System.out.println("After removing elements using HashSet: ");
        for(int element: arr){
            System.out.print(element + " ");
        }

    }

    public static void inPlace(int[] arr){
        int index = 0 ; 

        for(int i=0 ; i < arr.length-1 ; i++){
            if(arr[i] != arr[i+1]){
                arr[index] = arr[i] ; 
                index++ ; 
            }
        }

        arr[index] = arr[arr.length-1] ; 
        index++ ; 

        System.out.println("After removing duplicates - in place: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 7, 9, 8} ;

        inPlace(arr);
        usingHashSet(arr);
    }
}
