package Data_Structures.LinkedList;

/**
 * Created by sj042124 on 29/05/19.
 */
public class Node {

    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;

        Node current = this;
        System.out.println("Creating node with value = "+ data +" and address"+ current);
    }
}
