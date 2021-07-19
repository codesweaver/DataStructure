package repeat;

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 3, 2, 8, 7, 7, 9, 6}; // 10개
        quickSort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void quickSort(int[] numbers) {
        quickSortRecursive(numbers, 0, numbers.length-1);
    }

    private static void quickSortRecursive(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }

        int fixPosition = partition(numbers, left, right);

        quickSortRecursive(numbers, 0, fixPosition-1);
        quickSortRecursive(numbers, fixPosition+1, right);
    }

    private static int partition(int[] numbers, int left, int right) {
        for (int i = left; i < right; i++) {
            if (numbers[i] < numbers[right]) {
                swap(numbers, left, i);
                left++;
            }

        }
        swap(numbers, left, right);
        return left;
    }

    private static void swap(int[] numbers, int i, int k) {
        int tmp = numbers[k];
        numbers[k] = numbers[i];
        numbers[i] = tmp;
    }
}
