package models;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
        }

        if (root.get_key() < key) {
            root.set_left(key);
        }
        else {
            root.set_right(key);
        }
    }

    public boolean search(int key) {
        return search_rec(root, key);
    }

    private boolean search_rec(Node root, int key) {
        if (root == null) return false;

        if (root.get_key() == key) return true;

        if (root.get_key() < key) return search_rec(root.get_left(), key);

        return search_rec(root.get_right(), key);
    }
}
