package repeat;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(3); // 6
        System.out.println(result);

        result = factorial(5); // 120
        System.out.println(result);
    }

    private static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
