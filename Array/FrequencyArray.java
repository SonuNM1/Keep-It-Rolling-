// count the frequency of every element in the array 

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 4 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // creating new array

        int[] frequency = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        // print frequency

        System.out.println("Frequency array: ");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}
