package sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 6, 7, 7, 9, 8}; // 10개
        quickSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void quickSort(int[] nums) {
        quickSortRecursive(nums, 0, nums.length-1);
    }

    private static void quickSortRecursive(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int fixPosition = partition(nums, left, right);

        quickSortRecursive(nums, left, fixPosition-1);
        quickSortRecursive(nums, fixPosition+1, right);
    }

    private static int partition(int[] nums, int left, int right) {
        for (int i = left; i < right; i++) {
            if (nums[i] < nums[right]) {
                swap(nums, left, i);
                left++;
            }
        }
        swap(nums, left, right);
        return left;
    }

    private static void swap(int[] nums, int left, int i) {
        int tmp = nums[left];
        nums[left] = nums[i];
        nums[i] = tmp;
    }


}
