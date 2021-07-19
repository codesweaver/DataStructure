package repeat;

public class FibonacciCache {

    public static void main(String[] args) {
        int[] cache = new int[11]; // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        System.out.println(fibonacci(3, cache));
        System.out.println(fibonacci(5, cache));
        System.out.println(fibonacci(7, cache));
        System.out.println(fibonacci(10, cache));
    }

    private static int fibonacci(int number, int[] cache) {
        if (number <= 1) {
             return number;
        }

        if (cache[number] != 0) {
            return cache[number];
        }

        return cache[number] = fibonacci(number-1, cache) + fibonacci(number - 2, cache);
    }

}
