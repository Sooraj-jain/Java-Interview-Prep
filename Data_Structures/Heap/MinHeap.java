package Data_Structures.Heap;

import java.util.Arrays;

/**
 * Implementation of MinHeap where data at root is always less than its children
 * Children are inserted from left to right.
 * Min Heap is a Binary tree
 */
public class MinHeap {

    // Lets take actual size from 0, and assign initial capacity as 10
    // (will increase on need basis using ensureExtraCapacity)
    int capacity = 10;
    int size = 0;
    int[] items = new int[capacity];

    // Implementation of ArrayList using array (Dynamic array)
    void ensureExtraCapacity() {
        if(size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    void swap(int indexOne, int indexTwo) {

        System.out.println("Swap is called");
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    // Adding to heap will add to last element
    void add(int data) {
        ensureExtraCapacity();
        items[size] = data;
        size++;
        heapifyUp();
    }

    // Lookup the first element + remove the same
    int poll() {
        if (size == 0) {
            throw new IllegalStateException("Size is zero");
        }

        int peek = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return peek;
    }

    // Just to lookup the first element
    int peek() {
        if (size == 0) {
            throw new IllegalStateException("Size is zero");
        }
        return items[0];
    }


    // When new element is added using add(), we add at the last position. Then we need to bubble/compare
    // it to all the way to the top ro the root element to Ensure MinHeap property is restored
    void heapifyUp() {
        System.out.println("Heapify UP is called");
        int lastIndex = size-1;
        System.out.println("lastIndex "+lastIndex);
        while (hasParent(lastIndex) && getParent(lastIndex)> items[lastIndex]) {
            swap(getParentIndex(lastIndex), lastIndex);
            lastIndex = getParentIndex(lastIndex);
        }
    }

    // When peek() is called, we remove first element and put last element at top.
    // After this, we need to bubble/compare data all the way from root to last element to ensure
    // that the min Heap property is restored
    void heapifyDown() {
        int rootIndex = 0;

        // If Left child is not there, obviosuly right child wont be there in Heap
        while (hasLeftChild(rootIndex)) {
            int smallerChildIndex = getLeftChildIndex(rootIndex);

            if(hasRightChild(rootIndex) && getRightChild(rootIndex) < smallerChildIndex) {
                smallerChildIndex = getRightChild(rootIndex);
            }

            if (items[rootIndex] < items[smallerChildIndex]) {
                break;
            }

            if (items[rootIndex] > items[smallerChildIndex]){
                swap(items[rootIndex], items[smallerChildIndex]);
                rootIndex = smallerChildIndex;
            }
        }
    }

    // Helper Methods
    int getLeftChildIndex(int index) { return (index * 2 + 1 ); }
    int getRightChildIndex(int index) { return (index * 2 + 2); }
    int getParentIndex(int childIndex) { return (childIndex-1) / 2; }

    int getLeftChild(int index) { return items[getLeftChildIndex(index)]; }
    int getRightChild(int index) { return items[getRightChildIndex(index)]; }
    int getParent(int index) { return items[getParentIndex(index)]; }

    boolean hasLeftChild(int index) { return (items[getLeftChildIndex(index)] < capacity) ? true : false; }
    boolean hasRightChild(int index) { return (getRightChildIndex(index)<capacity) ? true : false; }
    boolean hasParent(int index) { return  (getParentIndex(index) >= 0) ? true: false ; }
}