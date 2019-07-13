package Data_Structures.LinkedList;

/**
 * Created by sj042124 on 30/05/19.
 */
public class TraverseLinkedList {


    public static void main(String[] args) {
        Node N1 = new Node(1);
        Node N2 = new Node(2);
        Node N3 = new Node(3);

        N1.next = N2;
        N2.next = N3;

        print(N1);
    }

    static void print(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println("Data = "+current.data+" address"+ current);
            current = current.next;
        }
        return;
    }
}
