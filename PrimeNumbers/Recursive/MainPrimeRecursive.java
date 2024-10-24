import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPrimeRecursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get all prime numbers up to it: ");
        int n = sc.nextInt();

        List<Integer> primeNumbers = PrimeNumberRecursive.getPrimesUpTo(n, 2, new ArrayList<>());
        System.out.println("Prime numbers up to " + n + ": " + primeNumbers);
    }
}
