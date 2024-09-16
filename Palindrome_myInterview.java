package test;
//          1- Get a number from the user.
//          Find and print the reverse of a number in Java
//          Check palindrome or not in Java


import java.util.Scanner;

public class Palindrome_myInterview {
    public static int reverse(int inputNumber) {
        String strInput = String.valueOf(inputNumber);
        String strOutput = "";
        for (int i = 1; i <= strInput.length(); i++) {
            strOutput = strInput.substring(i - 1, i) + strOutput;
        }
        return Integer.valueOf(strOutput);
    }
    public static void main(String[] args) {
        System.out.println("Please enter your number:1");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int reverseNumber = reverse(inputNumber);
        short counter = 1;
        while (true) {
            if (inputNumber == reverseNumber) {
                System.out.println(reverseNumber + " is palindrome and we tried " + String.valueOf(counter) + " times");
                break;
            } else {
                inputNumber = inputNumber + reverseNumber;
                reverseNumber = reverse(inputNumber);
                counter += 1;
            }
        }
        scanner.close();
    }
}
