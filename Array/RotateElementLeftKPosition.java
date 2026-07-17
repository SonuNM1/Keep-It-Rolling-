package Array;

import java.util.Scanner;

public class RotateElementLeftKPosition {
    public static void main(String[] args) {

        // rotate all the elements of array by k position to its left

        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k value: ");
        int k = sc.nextInt();

        if (k < 0 || k > arr.length) {
            System.out.println("Enter the valid value");
            return;
        }

        for (int r = 1; r <= k; r++) {
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = temp;
        }

        System.out.println("Result: ");

        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}

// brute force - "rotate left by once" repeat k times
