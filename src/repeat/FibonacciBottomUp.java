package repeat;

public class FibonacciBottomUp {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(fibonacciNoArr(7));
    }

    private static int fibonacci(int number) {
        int[] cache = new int[number+1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i <= number; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[number];
    }

    private static int fibonacciNoArr(int number) {
        int prev = 1;
        int next = 1;
        for (int i = 2; i < number; i++) {
            next = next + prev;
            prev = next - prev;
        }
        return next;
    }
}
