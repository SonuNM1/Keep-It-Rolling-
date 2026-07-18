;

public class RotateElementKPosition {
    public static void main(String[] args) {

        // rotate all the elements of array k position to the right

        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 2;

        for (int r = 1; r <= k; r++) {

            int temp = arr[arr.length - 1];
            
            for (int i = arr.length - 1; i > 0; i++) {
                arr[i] = arr[i - 1];
            }
            
            arr[0] = temp;
        }

        System.out.println("result");
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}


// brute force - doing 'rotate by once' for k times directly 