package study;

public class FibonacciMemoization {
    public static void main(String[] args) {
        int[] cache = new int[10];
        int result = fibonacci(8, cache);
        int result2 = fibonacciShort(8);
        System.out.println(result);
        System.out.println(result2);
    }

    private static int fibonacci(int number, int[] cache) {
        if (number <= 1) {
            return number;
        }

        if (cache[number] != 0) {
            return cache[number];
        }

        int result = fibonacci(number-2, cache) + fibonacci(number - 1, cache);
        cache[number] = result;

        return result;
    }

    public static int fibonacciShort(int number) {
        int prev2 = 1;
        int prev1 = 1;
        for (int i=2; i<number; i++) {
            int tmp = prev2;
            prev2 = prev1;
            prev1 = prev1 + tmp;
        }
        return prev1;
    }
}
