import java.util.Scanner;

public class MainLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get the index of it inside Fibonacci: ");
        int n = sc.nextInt();

        int resp = FibonacciRecursive.getIndexInFibonacci(n);
        System.out.println("fib(" + n + ") = " + resp);
    }
}
