import java.util.List;

public final class PrimeNumberRecursive {

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> getPrimesUpTo(int n, int current, List<Integer> primes) {
        if (n < 2) {
            throw new IllegalArgumentException("Must be greater than 1.");
        }

        if(current > n) {
            return primes;
        }

        if(isPrime(current)) {
            primes.add(current);
        }

        return getPrimesUpTo(n, current + 1, primes);
    }
}
