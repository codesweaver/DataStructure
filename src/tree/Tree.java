package tree;

class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public static Node add(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = add(node.left, data);
        } else {
            node.right = add(node.right, data);
        }
        return node;
    }

    public static int getMaxNodeValue(Node node, Node prevNode) {
        if (node == null) {
            int data = prevNode.data;
            prevNode = null;
            return data;
        }
        if (node.right != null) {
            return getMaxNodeValue(node.right, node);
        }

        int data = node.data;
        node = null;
        return data;
    }

    public static int getMinNodeValue(Node node, Node prevNode) {
        if (node == null) {
            int data = prevNode.data;
            prevNode = null;
            return data;
        }
        if (node.left != null) {
            return getMinNodeValue(node.left, node);
        }
        int data = node.data;
        node = null;
        return data;
    }

    public static Node delete(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (node.data == data) {
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left != null) {
                node.data = getMaxNodeValue(node.left, node);
                return node;
            }
            if (node.right != null) {
                node.data = getMinNodeValue(node.right, node);
                return node;
            }
        }

        if (data < node.data) {
            node.left = delete(node.left, data);
        } else {
            node.right = delete(node.right, data);
        }
        return node;
    }

    public static void travelInOrder(Node node) {
        if (node == null) {
            return;
        }

        travelInOrder(node.left);
        System.out.println(node.data);
        travelInOrder(node.right);
    }
}

public class Tree {
    public static void main(String[] args) {
        Node root = new Node(5);
        Node.add(root, 3);
        Node.add(root, 4);
        Node.add(root, 6);
        Node.add(root, 8);

        Node.delete(root,3);
//        Node.delete(root, 4);
//        Node.delete(root, 8);

        Node.travelInOrder(root);
    }
}
