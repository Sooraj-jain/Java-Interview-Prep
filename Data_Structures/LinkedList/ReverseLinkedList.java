package Data_Structures.LinkedList;

/**
 * Created by sj042124 on 30/05/19.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        Node N1 = new Node(10);
        Node N2 = new Node(20);
        Node N3 = new Node(30);

        N1.next = N2;
        N2.next = N3;

        //Before Reversing
        TraverseLinkedList.print(N1);

        Node reversedHead = reverseTheLinkedList(N1);
        //After reversing
        TraverseLinkedList.print(reversedHead);

        //Append a Node just for Fun ;)
        LinkedList ll = new LinkedList();
        ll.head = reversedHead;
        ll.append(50);
        TraverseLinkedList.print(reversedHead);
    }

    private static Node reverseTheLinkedList(Node head) {
        Node current = head, prev = null, next, temp;

        while(current!=null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
        return head;
    }
}
