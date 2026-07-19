// a leader is an element that is greater than all the elements to its right. The last element is always a leader since there are no elements in the right

public class Leader {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 2, 3, 1} ; 

        int max = arr[arr.length-1] ; 

        System.out.println("Leader elements: ");
        System.out.print(max + " ");

        for(int i= arr.length-2 ; i >= 0; i--){
            if(arr[i] > max){
                System.out.print(arr[i] + " ");
                max = arr[i] ; 
            }
        }

    }
}
