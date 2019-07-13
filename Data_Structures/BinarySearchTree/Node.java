package Data_Structures.BinarySearchTree;

/**
 * Implementing Binary Search Tree (Elements are in sorted Order)
 */
public class Node {

    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    // If value is less compare & Insert on Left else on right
    public void insert(int value) {

        if (value < data) {
            if (left == null) {
                left  = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data ) {
            return true;
        }
        if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    // Root, left, right ==> Top Down Approach
    // print head, visit left , visit right
    public void preOrder() {
        //Print root
        System.out.println(data);

        //visit left
        if (left != null) {
            left.preOrder();
        }

        //Visit Right
        if (right != null) {
            right.preOrder();
        }
    }

    //L,Root,Right ==> Bottom up approach from LEFT
    //Visits left, print root data, visit right
    public void printInOrder(){
        //LEFT
        if (left != null) {
            left.printInOrder();
        }

        //ROOT
        System.out.println(data);

        //RIGHT
        if (right!=null) {
            right.printInOrder();
        }
    }

    //Left, Right, Root ==> Bottom Up from Right
    //Visit left first, then right, then root
    public void postOrder() {

        //Left
        if (left != null) {
            left.postOrder();
        }

        //Right
        if (right != null) {
            right.postOrder();
        }

        //Root
        System.out.println(data);
    }
}
