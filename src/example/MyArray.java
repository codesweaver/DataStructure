package example;

public class MyArray {

    private final int[] arr;
    private int currentIndex;

    public MyArray(int size) {
        this.arr = new int[size];
        this.currentIndex = 0;
    }

    public void put(int value) {
        chkValidIndex(this.currentIndex);
        this.arr[this.currentIndex++] = value;
    }

    public void put(int index, int value) {
        chkValidIndex(index);

        if (index > this.currentIndex) {
            index = this.currentIndex;
        }

        for (int i = index; i < this.currentIndex; i++) {
            this.arr[i+1] = this.arr[i];
        }

        this.arr[index] = value;
        this.currentIndex++;
    }

    public int get(int index) {
        chkValidIndex(index);
        return this.arr[index];
    }

    public void delete(int index) {
        chkValidIndex(index);
        for (int i = index+1; i<this.currentIndex; i++) {
            arr[i-1] = arr[i];
        }
        arr[--this.currentIndex] = 0;
    }

    private void chkValidIndex(int index) {
        if (index > this.arr.length) {
            throw new IndexOutOfBoundsException("index는 배열의 크기를 넘을 수 없습니다");
        }
    }
}
