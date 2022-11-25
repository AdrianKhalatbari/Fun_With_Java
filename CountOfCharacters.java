package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfCharacters {
    public static void main(String[] args) {
        System.out.println("Please enter your input");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> output = new HashMap<>();
        char[] charsOfInput = input.toCharArray();
        for (char ch : charsOfInput) {
            if (output.containsKey(ch)) {
                int counter = output.get(ch);
                counter += 1;
                output.put(ch, counter);
            } else {
                output.put(ch, 1);
            }
        }
        System.out.println(output);
    }
}
