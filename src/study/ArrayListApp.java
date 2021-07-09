package study;

class ArrayList {
    private Object[] data;
    private int size;
    private int index;

    public ArrayList() {
        this.size = 1;
        this.data = new Object[this.size];
        this.index = 0;
    }

    public void add(Object obj) {
        if (this.index == this.size) {
            doubling();
        }
        this.data[this.index++] = obj;
    }

    public Object get(int index) {
        if (notValidIndex(index)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.data[index];
    }

    public void remove(int index) {
        if (notValidIndex(index)) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i=index; i<this.data.length - 1; i++) {
            this.data[index] = this.data[index+1];
        }

        this.index--;
    }

    private boolean notValidIndex(int index) {
        return index > this.index - 1 || index < 0;
    }

    private void doubling() {
        this.size *= 2;

        Object[] newData = new Object[this.size];
        System.arraycopy(this.data, 0, newData, 0, data.length);

        this.data = newData;
    }
}

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("0");
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        System.out.println(arr.get(5));
        arr.remove(5);
        System.out.println(arr.get(5));
    }
}
