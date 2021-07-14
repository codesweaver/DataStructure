package study;

class Node {
    private final int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class TreeApp {
    public static void main(String[] args) {
        Node root = new Node(50);
        add(root, 10);
        add(root, 53);
        add(root, 25);
        add(root, 33);
        add(root, 75);

        System.out.println(get(root, 33));
        delete(root, 33);
        System.out.println(get(root, 33));
        add(root, 33);
        System.out.println(get(root, 33));

        traversalInOrder(root);
    }

    public static Node add(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.getData()) {
            node.setLeft(add(node.getLeft(), data));
        } else {
            node.setRight(add(node.getRight(), data));
        }

        return node;
    }

    public static void traversalInOrder(Node node) {
        if (node == null) {
            return ;
        }

        traversalInOrder(node.getLeft());
        System.out.println(node.getData());
        traversalInOrder(node.getRight());
    }

    public static Node get(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (node.getData() == data) {
            return node;
        }

        if (data < node.getData()) {
            return get(node.getLeft(), data);
        }
        return get(node.getRight(), data);
    }

    public static Node delete(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (node.getData() == data) {
            return null;
        }

        if (data < node.getData()) {
            node.setLeft(delete(node.getLeft(), data));
        } else {
            node.setRight(delete(node.getRight(), data));
        }
        return null;
    }
}
