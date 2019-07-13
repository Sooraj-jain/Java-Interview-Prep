package Data_Structures.BinarySearchTree;

/**
 * Class to understand Binary search tree operations with an example
 */
public class NodeMain {

    public static void main(String[] args) {
        Node node = new Node(5);

        //node.insert(5);
        node.insert(4);
        node.insert(15);
        node.insert(8);

        System.out.println("contains 8? "+ node.contains(8));

        System.out.println("-----PreOrder----");
        node.preOrder();
        System.out.println("-----InOrder----"); // Gets values in Sorted Order
        node.printInOrder();
        System.out.println("-----Post Order----");
        node.postOrder();

    }
}
