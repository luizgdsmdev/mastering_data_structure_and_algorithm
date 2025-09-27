package BinaryTree;

public class BinaryTree {
    private Node root;

    class Node{
        private Node left;
        private Node rigth;
        private int value;

        Node(int value){
            this.value = value;
        }
    }

    BinaryTree(int value){
        root = new Node(value);
        root.left = null;
        root.rigth = null;
    }



}
