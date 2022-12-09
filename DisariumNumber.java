//A number is said to be the Disarium number when the sum of its digit raised to the power
// of their respective positions becomes equal to the number itself.
// For example, 175 is a Disarium number as follows:
// 11+ 72 + 53 = 1+ 49 + 125 = 175

package test;

import java.util.*;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int userInput = scanner.nextInt();
        Map<String, Integer> integerMap = new HashMap<>();
        String stringUserInput = String.valueOf(userInput);
        int counter = 1;
        for (int i = 0; i < stringUserInput.length(); i++) {
            integerMap.put(stringUserInput.substring(i, i + 1), counter);
            counter += 1;
        }
        int temp = 0;
        for (Map.Entry<String, Integer> set : integerMap.entrySet()) {
            temp = temp + power(Integer.parseInt(set.getKey()), set.getValue());
        }
        if (temp == userInput) {
            System.out.println("This is a disarium number");
        } else {
            System.out.println("This is not a disarium number");
        }
    }

    public static int power(int number, int power) {
        if (power == 1) {
            return 1;
        }
        if (power == 0) {
            return 1;
        } else {
            int temp = number;
            for (int i = 2; i <= power; i++) {
                temp = temp * number;
            }
            return temp;
        }
    }
}
