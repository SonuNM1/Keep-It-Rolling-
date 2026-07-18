;

public class SortColors {
    public static void main(String[] args) {
     
        // Given an array nums containing only 0, 1, and 2, sort the array in-place without using any built-in sorting algorithm. - also called the Dutch National Flag Problem

        int[] arr = {0,2,0,1,2,1,0,2};

        int zero=0, one=0, two=0 ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                zero++ ; 
            } else if(arr[i] == 1){
                one++ ; 
            } else {
                two++ ; 
            }
        }

        // rewrite array 

        int index = 0 ; 

        while(zero > 0){
            arr[index] = 0 ;
            index++ ; 
            zero-- ; 
        }
        while(one > 0){
            arr[index] = 1; 
            index++ ; 
            one-- ; 
        }
        while(two > 0){
            arr[index] = 2 ; 
            index++ ; 
            two-- ; 
        }

        for(int element: arr){
            System.out.print(element +  " ");
        }
    }
}
