package models;

public class Node {
    private int key;
    private Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }

    public int get_key() {
        return key;
    }

    public void set_left(int key) {
        left = new Node(key);
    }

    public void set_right(int key) {
        right = new Node(key);
    }

    public Node get_left() {
        return left;
    }

    public Node get_right() {
        return right;
    }
}
