package test;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("lease enter your number");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int output = 1;
        for (int i = 1; i <= inputNumber; i++) {
            output = output * i;
        }
        System.out.println(output);
    }
}
