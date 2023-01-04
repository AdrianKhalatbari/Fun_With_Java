package test;

//Write a Java Program to find whether a string or number is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        String output = "";
        for (int i = (chars.length) - 1; i >= 0; i--) {
            output = output + chars[i];
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your input:");
        String input = scanner.nextLine();
        String reverse = reverse(input);
        if (input.equals(reverse)) {
            System.out.println("This input is palindrome!");
        } else System.out.println("This input is not palindrome!");
    }
}
