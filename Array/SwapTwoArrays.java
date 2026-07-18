;
public class SwapTwoArrays {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3} ; 
        int[] arr2 = {4,5,6} ; 

        if(arr1.length != arr2.length){
            System.out.println("Both arrays should be of equal length");
            return ; 
        }

        for(int i=0 ; i < arr1.length ; i++){
            int temp = arr1[i] ; 
            arr1[i] = arr2[i] ; 
            arr2[i] = temp ; 
        }

        System.out.print("Array 1: ");

        for(int num: arr1){
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Array 2: ");

        for(int num: arr2){
            System.out.print(num + " ");
        }

    }
}
