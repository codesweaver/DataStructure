package repeat;

import java.util.NoSuchElementException;

class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    public void append(T data) {
        Node<T> node = new Node<>(data);
        if (first == null) {
            first = node;
        }

        if (last != null) {
            last.next = node;
        }

        last = node;
    }

    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        T data = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }

        return data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.append(10);
        q.append(20);
        q.append(30);
        q.append(40);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
