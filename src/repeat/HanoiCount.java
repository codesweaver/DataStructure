package repeat;

public class HanoiCount {
    public static void main(String[] args) {
        System.out.println(hanoi(1));
        System.out.println(hanoi(2));
        System.out.println(hanoi(3));
        System.out.println(hanoi(4));
        System.out.println(hanoi(5));
        System.out.println(hanoi(6));
        System.out.println(hanoi(7));
    }

    private static int hanoi(int number) {
        if (number <= 1) {
            return number;
        }
        return (hanoi(number-1) * 3) - (hanoi(number-2) * 2);
    }
}
