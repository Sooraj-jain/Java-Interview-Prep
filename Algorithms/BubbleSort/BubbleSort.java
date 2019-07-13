package Algorithms.BubbleSort;

/**
 * This is the best sorting algorithm (Just because its the easiest to learn :P)
 * In actual computation, this is the worst sorting algorithm in most cases
 * Resulting in Time complexity of O(n square)
 */
public class BubbleSort {

    private static int[] performSort(int[] items) {

        int lastUnsortedIndex = items.length-1;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            // Last time when lastUnsortedIndex=0,
            // it wont enter for loop hence isSorted remains true
            // and exits on while condition
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (items[i] > items[i + 1]) {
                    swapItems(items, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsortedIndex--;
        }

        return items;
    }

    private static void swapItems(int[] items, int a, int b) {
       int temp = items[a];
       items[a] = items[b];
       items[b] = temp;
    }

    public static void main(String[] args) {
        int[] itemsToSort = new int[] {35, 30, 25, 20, 15, 10};
        int[] sortedList = performSort(itemsToSort);

        for (int item: sortedList) {
            System.out.println(item);
        }
    }
}
