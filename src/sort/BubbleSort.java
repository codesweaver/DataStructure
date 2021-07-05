package sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 2, 4};
        bubbleSort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
