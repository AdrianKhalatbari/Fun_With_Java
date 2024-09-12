import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int input) {
        int half = input / 2;
        boolean flag = true;
        for (int i = 2; i <= half; i++) {
            if (input % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (checkPrime(input)){
            System.out.println("This is prime number");
        }else System.out.println("This isn't prime number");
        scanner.close();
    }
}
