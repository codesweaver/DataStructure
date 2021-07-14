package repeat;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 9, 4, 5, 6, 1, 7, 2, 8, 3};
        selectionSort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            swap(numbers, i, getMinIndex(numbers, i));
        }
    }

    private static void swap(int[] numbers, int i, int index) {
        int tmp = numbers[index];
        numbers[index] = numbers[i];
        numbers[i] = tmp;
    }

    private static int getMinIndex(int[] numbers, int i) {
        int result = i;
        for (int j = i+1; j < numbers.length; j++) {
            if (numbers[j] < numbers[result]) {
                result = j;
            }
        }
        return result;
    }
}
