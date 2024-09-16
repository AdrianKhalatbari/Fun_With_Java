//A number is said to be the Disarium number when the sum of its digit raised to the power
// of their respective positions becomes equal to the number itself.
// For example, 175 is a Disarium number as follows:
// 1^1+ 7^2 + 5^3 = 1+ 49 + 125 = 175

package test;

import java.util.*;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int userInput = scanner.nextInt();
        char[] characters = String.valueOf(userInput).toCharArray();
        Double sum = 0.0;
        for (int i = 0; i < characters.length; i++) {
            sum = sum + Math.pow(Double.parseDouble(String.valueOf(characters[i])), (i + 1));
        }
        if (sum.intValue() == userInput) {
            System.out.println("This is a disarium number");
        } else {
            System.out.println("This is not a disarium number");
        }
        scanner.close();
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
