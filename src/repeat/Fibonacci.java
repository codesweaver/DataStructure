package repeat;

public class Fibonacci {

    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21
        int result = fibonacci(5); // 5
        System.out.println(result);
        result = fibonacci(7); // 13
        System.out.println(result);
    }

    private static int fibonacci(int number) {
        if (number <= 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
