package example;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(tailFactorial(5, 1));
        System.out.println(forFactorial(5, 1));
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num-1);
    }

    public static int tailFactorial(int num, int fac) {
        if (num <= 1){
            return fac;
        }
        return tailFactorial(num - 1, num * fac);
    }

    public static int forFactorial(int num, int fact) {
        for (int i = num; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }
}
