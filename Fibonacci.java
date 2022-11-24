package test;

import java.util.*;

public class Fibonacci {

    public static List<Integer> fibonacci(int startNumber) {
        List<Integer> listFibonacci = new ArrayList<>();
        for (int i = 0; i <= startNumber; i++) {
            if (i == 0) {
                listFibonacci.add(0);
            } else if (i == 1 || i == 2) {
                listFibonacci.add(1);
            } else {
                int input = (listFibonacci.get(i - 1)) + (listFibonacci.get(i - 2));
                listFibonacci.add(input);
            }
        }
        return listFibonacci;
    }

    public static int fibonacciRecursion(int startNumber) {
        if (startNumber <= 1) {
            return startNumber;
        }
        return fibonacciRecursion(startNumber - 1) + fibonacciRecursion(startNumber - 2);
    }

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        System.out.println("The Fibonacci is: " + fibonacci(startNumber));
        List<Integer> fibonacciRecursionList = new ArrayList<>();
        while (startNumber >= 0) {
            fibonacciRecursionList.add(fibonacciRecursion(startNumber));
            Collections.sort(fibonacciRecursionList);
            startNumber -= 1;
        }
        System.out.println("The Fibonacci Recursion is " + fibonacciRecursionList);
    }
}
