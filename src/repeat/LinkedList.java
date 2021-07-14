package repeat;

class Node<T> {
    private final T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void append(T data) {
        Node<T> node = this;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(data);
    }

    public void delete(T data) {
        Node<T> node = this;
        while (node.next != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
            }
            node = node.next;
        }
    }

    public void retrieve() {
        Node<T> node = this;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(10);
        head.append(5);
        head.append(7);
        head.append(15);
        head.append(4);
        head.retrieve();

        System.out.println("==========");
        head.delete(15);
        head.retrieve();
    }
}
