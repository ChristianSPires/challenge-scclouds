import java.util.ArrayList;
import java.util.List;

public final class PrimeNumberChecker {

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> getPrimesUpTo(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Must be greater than 1.");
        }

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

}
