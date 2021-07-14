package repeat;

public class Hanoi {

    public static void main(String[] args) {
        hanoi("S", "M", "L", 3);
    }

    private static void hanoi(String s, String m, String l, int number) {
        if (number == 1) {
            System.out.printf("%d :: %s -> %s\n", number, s, l);
            return;
        }
        hanoi(s, l, m, number-1);
        System.out.printf("%d :: %s -> %s\n", number, s, l);
        hanoi(m, s, l, number-1);
    }
}
