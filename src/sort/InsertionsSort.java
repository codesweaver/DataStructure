package sort;

public class InsertionsSort {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 2, 4};
        insertionSort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void insertionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j-1] > numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tmp;
                }
            }
        }
    }
}
