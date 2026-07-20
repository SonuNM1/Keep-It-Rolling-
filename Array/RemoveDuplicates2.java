// remove duplicates from the sorted array 

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3} ; 

        int[] result = new int[arr.length] ; 

        int index = 0 ; 
        result[index] = arr[0] ;
        index++ ; 

        for(int i=1 ; i < arr.length-1 ; i++){
            if(arr[i] != arr[i+1]){
                result[index] = arr[i] ;
                index++ ;  
            }
        }

        result[index] = arr[arr.length-1] ; 
        index++ ; 

        System.out.println("After removing duplicate elements: ");

        for(int element: result){
            System.out.print(element + " ");
        }

    }
}
