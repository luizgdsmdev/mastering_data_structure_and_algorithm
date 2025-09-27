package BinaryTree;

public class Main {

    public static void main(String[] args){
        BinaryTree myBinaryTree = new BinaryTree(10);
        myBinaryTree.inser(10);
        myBinaryTree.inser(7);
        myBinaryTree.inser(-7);

        System.out.println(myBinaryTree.root.right.value);

    }
}
