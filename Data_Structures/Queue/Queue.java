package Data_Structures.Queue;

import Data_Structures.LinkedList.LinkedList;
import Data_Structures.LinkedList.Node;

/**
 * Queue implementation using Singly Linked List
 */
public class Queue {

    Node head, tail;
    int data;

    // EnQueue is to add data to Queue at the tail
    void enQueue(int data) {
        Node node = new Node(data);
        if(tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    //Dequeue is to remove data from Queue from head
    int deQueue() throws Exception {
        if(head != null) {
            data = head.data;
            head = head.next;
            return data;
        } else {
            throw new Exception("Can't Dequeue. Head is null");
        }
    }

    boolean isQueueEmpty() {
        return head == null;
    }

    void printQueue() {
        LinkedList l = new LinkedList();
        l.head = head;
        l.print(head);
    }
}
