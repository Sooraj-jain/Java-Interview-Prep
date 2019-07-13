package Data_Structures.Queue;

/**
 * Class to check capabilities of a Queue object
 */
public class QueueMain {

    static Queue queue = new Queue();

    public static void main(String[] args) throws Exception {
        System.out.println(queue.isQueueEmpty());

        queue.enQueue(10);
        queue.enQueue(11);

        System.out.println("isEmpty "+queue.isQueueEmpty());
        queue.printQueue();

        queue.deQueue();
        queue.printQueue();

        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);
        System.out.println("---");
        queue.printQueue();
        queue.deQueue();
        System.out.println("---");
        queue.printQueue();

        //Not sure if this is allowed/provided in actual Queue to view value at Tail
        System.out.println("Tail is "+ queue.tail.data);
        System.out.println("Head is "+ queue.head.data);

    }
}
