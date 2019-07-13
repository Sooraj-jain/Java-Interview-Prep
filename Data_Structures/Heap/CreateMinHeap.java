package Data_Structures.Heap;

/**
 * Created by sj042124 on 17/06/19.
 */
public class CreateMinHeap {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        minHeap.add(10);
        minHeap.add(11);
        minHeap.add(13);
        minHeap.add(12);
        minHeap.add(15);
        minHeap.add(9);

        System.out.println("root element: "+ minHeap.peek());
    }
}
