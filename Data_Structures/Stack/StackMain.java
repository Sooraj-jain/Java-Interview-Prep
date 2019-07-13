package Data_Structures.Stack;

/**
 * Class to perform different operations on Stack
 */
public class StackMain {

    private static Stack stack = new Stack();

    public static void main(String[] args) throws Exception {
        System.out.println(stack.isStackEmpty());
        stack.push(10);
        stack.push(11);
        stack.push(12);

        System.out.println("Printing Stack ");
        stack.printElementInStack();

        System.out.println("Peek operation "+ stack.peek());
        System.out.println();

        stack.printElementInStack();
        System.out.println("pop : "+ stack.pop());
        System.out.println("Top = "+stack.peek());

        System.out.println("pop : "+ stack.pop());
        System.out.println("Top = "+stack.peek());
        System.out.println("Printing Stack ");
        stack.printElementInStack();

        System.out.println("pop : "+ stack.pop());
        System.out.println("is stack empty? "+ stack.isStackEmpty());
    }
}
