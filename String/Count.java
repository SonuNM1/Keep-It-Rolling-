package String;

import java.util.Scanner;

// take a string input and count all the space characters, uppercase, lowercase, numeric, special characters, in the string 

public class Count {

    public static void countOfAll(char[] ch) {

        int spaceCount = 0, upperCount = 0, lowerCount = 0, numericCount = 0, specialCount = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                spaceCount++;
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                upperCount++;
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                lowerCount++;
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                numericCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Space Count = " + spaceCount);
        System.out.println("Uppercase Count = " + upperCount);
        System.out.println("Lowercase Count = " + lowerCount);
        System.out.println("Numeric Count = " + numericCount);
        System.out.println("Special Character Count = " + specialCount);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        countOfAll(ch);

    }
}
