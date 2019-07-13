package Data_Structures.Stack;

import Data_Structures.LinkedList.LinkedList;
import Data_Structures.LinkedList.Node;

/**
 * implementation of Stack using Singly Linked list
 */
public class Stack {

    Node top;

    // Push is to add data to the Stack on Head (LIFO)
    void push(int data) {
        Node node = new Node(data);
        if (top == null) {
            System.out.println("Top is null");
            top = node;
        }
        else {
            node.next = top;
            top = node;
        }
    }

    // Peek is to view the data on top of the Stack without removing it
    int peek() throws Exception {
        if (top !=null) {
            return top.data;
        } else {
            throw new Exception("top is null");
        }
    }

    // Pop is to remove data from Stack from top (LIFO)
    int pop() throws Exception {
        if (top != null) {
            int data = top.data;
            top = top.next;
            return data;
        } else {
            throw new Exception("Top is null. Stack underflow");
        }
    }

    boolean isStackEmpty() {
        return (top == null);
    }

    void printElementInStack() {
        LinkedList l = new LinkedList();
        l.head= top;
        l.print(top);
    }
}
