public final class FibonacciLinear {

    public static int getIndexInFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Must be greater than 0");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1, temp = 1;

        for(int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
