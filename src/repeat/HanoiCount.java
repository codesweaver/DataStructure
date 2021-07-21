package repeat;

public class HanoiCount {
    public static void main(String[] args) {
        int[] cache = new int[11];
        System.out.println(hanoi(1, cache));
        System.out.println(hanoi(2, cache));
        System.out.println(hanoi(3, cache));
        System.out.println(hanoi(4, cache));
        System.out.println(hanoi(5, cache));
        System.out.println(hanoi(6, cache));
        System.out.println(hanoi(7, cache));
    }

    private static int hanoi(int number, int[] cache) {
        if (number <= 1) {
            return number;
        }

        if (cache[number] != 0) {
            return cache[number];
        }

        return cache[number] = (hanoi(number-1, cache) * 3) - (hanoi(number-2, cache) * 2);
    }
}
