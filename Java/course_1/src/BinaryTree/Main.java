package BinaryTree;

public class Main {

    public static void main(String[] args){
        BinaryTree myBinaryTree = new BinaryTree(2);
        myBinaryTree.inser(1);
        myBinaryTree.inser(3);

        System.out.println(myBinaryTree.root.value);
        System.out.println(myBinaryTree.root.left.value);
        System.out.println(myBinaryTree.root.right.value);

    }
}
