package test;

// swap number without using third value
public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Original A= " + a);
        System.out.println("Original B= " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap A= " + a);
        System.out.println("After swap B= " + b);
    }
}
