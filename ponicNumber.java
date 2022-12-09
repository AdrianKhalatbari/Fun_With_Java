//The pronic number is a product of two consecutive integers of the form: n(n+1).
//
//        For example:
//        6 = 2(2+1)= n(n+1),
//        72 =8(8+1) = n(n+1)
//
//        Some pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56 etc.
//
//        In this program, we need to print all pronic numbers between 1 and userInput
//        and check a number(That is pronic or not)
package test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ponicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int userInput = scanner.nextInt();
        List<Integer> ponicList = ponic(userInput);
        boolean flag = false;
        for (int i : ponicList) {
            if (i == userInput) {
                flag = true;
                break;
            }
        }
        System.out.println(ponicList);
        if (flag) {
            System.out.println("This number is Ponic");
        } else {
            System.out.println("This number is not Ponic");
        }

    }

    public static List<Integer> ponic(int number) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            int temp = i * (i + 1);
            if (temp <= number) {
                integerList.add(temp);
            }
        }
        return integerList;
    }
}
