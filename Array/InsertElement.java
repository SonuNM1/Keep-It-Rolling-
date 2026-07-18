

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        
        // insert element at specific position

        int[] arr = {10, 20, 30, 40, 50} ; 

        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the position");
        int position = sc.nextInt() ; 
        System.out.println("Enter the element");
        int element = sc.nextInt() ; 

        int[] result = new int[arr.length + 1] ; 

        for(int i = 0 ; i <= arr.length ; i++){
            if(i < position){
                result[i] = arr[i] ; 
            } else if( i == position){
                result[i] = element ; 
            } else {
                result[i] = arr[i-1] ; 
            }
        }

        for(int el: result){
            System.out.print(el + " ");
        }

    }
}