package test;

import java.util.Scanner;

public class PyramidCharacters {
    public static String space(double i) {
        String output = "";
        if (i < 1) {
            return "";
        }
        for (int j = 1; j <= i; j++) {
            output = output + (" ");
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        while (i != input + 1) {
            for (int a = input - i; a > 0; a--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
            i++;
        }
        scanner.close();
    }
}
