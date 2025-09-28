package BinaryTree;

public class BinaryTree {
    Node root;//Not set to private for test purposes only

    class Node{//Not set to private for test purposes only
         Node right;
         Node left;
         int value;

        Node(int value){
            this.value = value;
        }
    }

    //Instantiates the Binary tree only with an argument
    BinaryTree(int value){
        root = new Node(value);
        root.right = null;
        root.left = null;
    }

    public boolean inser(int value){
        //This tree doesn't work with repeated Nodes for studies purpose.
        if(root == null || value == root.value) return false;

        Node temp = root;
        Node newNode = new Node(value);
        newNode.left = null;
        newNode.right = null;

        while(true){
            if(value > temp.value){//Left branch
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }else{
                    temp = temp.left;
                }

            }else{//Right branch
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }else{
                    temp = temp.right;
                }
            }
        }
    }

    public Node contains(int value){
        if(root == null) return null;
        Node temp = root;

        while(temp != null){
            if(value == temp.value) return temp;
            if(value > temp.value){//Left branch
                temp = temp.left;
            }else{//Right branch
                temp = temp.right;
            }
        }

        return null;
    }
}
