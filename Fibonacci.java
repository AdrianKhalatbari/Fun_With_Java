package test;

import java.util.*;

public class Fibonacci {

    public static List<Integer> FindFibonacci() {
        List<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(0);
        listFibonacci.add(1);
        int nextValue = 1;
        while (nextValue <= 140) {
            listFibonacci.add(nextValue);
            nextValue = listFibonacci.get(listFibonacci.size() - 1) + listFibonacci.get(listFibonacci.size() - 2);
        }
        return listFibonacci;
    }

    public static int FindFibonacciRecursion(int startNumber) {
        if (startNumber <= 1) {
            return startNumber;
        }
        return FindFibonacciRecursion(startNumber - 1) + FindFibonacciRecursion(startNumber - 2);
    }

    public static void main(String[] args) {
        // call FindFibonacci method
        System.out.println(FindFibonacci());
        System.out.println("The Fibonacci Recursion is " + FindFibonacciRecursion(10));
        
    }
}
