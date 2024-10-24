import java.util.List;
import java.util.Scanner;

public class MainPrimeLinear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get all prime numbers up to it: ");
        int n = sc.nextInt();

        List<Integer> primeNumbers = PrimeNumberLinear.getPrimesUpTo(n);
        System.out.println("Prime numbers up to " + n + ": " + primeNumbers);
    }
}
