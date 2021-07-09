package study;

class LinkedList {
    Node header;

    public LinkedList() {
        header = new Node(-1);
        header.next = null;
    }

    public void append(int data) {
        Node node = new Node(data);
        node.next = null;

        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void delete(int data) {
        Node current = header;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    public void retrieve() {
        Node current = header;
        while (current.next != null) {
            current = current.next;
            System.out.println(current.data);
        }
    }

    class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }
}

public class SingleLinkedListApp {
    public static void main(String[] args) {
        LinkedList arr = new LinkedList();
        arr.append(1);
        arr.append(2);
        arr.append(3);
        arr.append(4);
        arr.append(5);
        arr.retrieve();
        arr.delete(4);
        arr.retrieve();
    }
}
