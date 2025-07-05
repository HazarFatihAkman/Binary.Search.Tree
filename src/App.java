import models.BinarySearchTree;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 7, 5, 1, 8, 3, 6, 0, 9, 4, 2 };
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        for (int e : arr) {
            binarySearchTree.insert(e);
        }

        System.out.println(binarySearchTree.search(10) ? "10 is found." : "10 is not found.");
        System.out.println(binarySearchTree.search(2) ? "2 is found." : "2 is not found.");
    }
}
