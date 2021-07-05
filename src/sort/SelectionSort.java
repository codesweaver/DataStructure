package sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 2, 4};
        selectionSort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            swap(numbers, i, getMinIndex(numbers, i));
        }
    }

    private static void swap(int[] numbers, int i, int idx) {
        int tmp = numbers[idx];
        numbers[idx] = numbers[i];
        numbers[i] = tmp;
    }

    private static int getMinIndex(int[] numbers, int i) {
        for (int j = i+1; j < numbers.length; j++) {
            if (numbers[i] > numbers[j]) {
                i = j;
            }
        }
        return i;
    }
}
