package example;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int[] nums = {20, 25, 26, 29, 33, 1, 3, 5, 6, 10, 11, 19}; // 12개
        int i = binarySearch(nums, 0, nums.length - 1, 26);
        System.out.println(i);
    }

    private static int binarySearch(int[] nums, int l, int r, int value) {
        if (l > r) {
            return -1;
        }

        int mid = Math.floorDiv(l+r, 2);
        if (nums[mid] == value){
            return mid;
        }

        if (nums[l] <= nums[mid]) {
            if (value >= nums[l] && value <= nums[mid]) {
                return binarySearch(nums, l, mid-1, value);
            }
            return binarySearch(nums, mid+1, r, value);
        }

        if (value >= nums[mid] && value <= nums[r]) {
            return binarySearch(nums, mid+1, r, value);
        }
        return binarySearch(nums, l, mid-1, value);
    }
}
