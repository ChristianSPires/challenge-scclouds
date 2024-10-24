public final class FibonacciChecker {
    public static int getIndexInFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Must be greater than 0");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return getIndexInFibonacci(n - 1) + getIndexInFibonacci(n - 2);
    }
}
