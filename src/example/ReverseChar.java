package example;

public class ReverseChar {

    public static void main(String[] args) {
        char[] arr = "Hello".toCharArray();
        reverseChar(arr);
        for (char c : arr) {
            System.out.print(c);
        }
    }

    private static void reverseChar(char[] arr) {
        char tmp;
        int targetIndex;
        int loopCount = arr.length / 2;

        for (int i = 0; i < loopCount; i++) {
            targetIndex = (arr.length - 1) - i;

            tmp = arr[i];
            arr[i] = arr[targetIndex];
            arr[targetIndex] = tmp;
        }
    }


}
