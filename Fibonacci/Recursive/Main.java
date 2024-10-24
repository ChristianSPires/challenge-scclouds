import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number to get the index of it inside Fibonacci: ");
        n = sc.nextInt();

        int resp = FibonacciChecker.getIndexInFibonacci(n);
        System.out.println("fib(" + n + ") = " + resp);
    }
}
