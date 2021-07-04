package example;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num-2) + fibonacci(num - 1);
    }
}
