package repeat;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 2, 4, 5, 6, 1, 7, 9, 8, 3};
        bubbleSort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < (numbers.length - 1 - i); j++) {
                if (numbers[j] > numbers[j+1]) {
                    int tmp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
    }
}
