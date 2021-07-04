package example;

public class Binary {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int i = binarySearch(nums, 0, nums.length-1, 2);
        System.out.println(i);
    }

    public static int binarySearch(int[] nums, int l, int r, int value) {
        int halfIndex = Math.floorDiv(r + l, 2);

        System.out.printf("%d %d %d\n", l, r, halfIndex);

        if (nums[halfIndex] == value) {
            return halfIndex;
        }

        if (l > r) {
            return -1;
        }

        if (value < nums[halfIndex]) {
            r = halfIndex - 1;
        } else {
            l = halfIndex + 1;
        }

        return binarySearch(nums, l, r, value);
    }
}
