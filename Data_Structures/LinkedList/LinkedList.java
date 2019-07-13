package Data_Structures.LinkedList;

/**
 * Singly linked list
 */
public class LinkedList {

    public Node head;

    public void append(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        head.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if(head == null) {
            return;
        }
        if(head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void print(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        return;
    }

}
