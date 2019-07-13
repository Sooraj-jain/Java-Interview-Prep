package Algorithms.BinarySearch;

/**
 * Time complexity is O(log n)
 * Everytime, scan length decreases to half of original size
 *
 * Two methods of doing this
 * A) Recursively B) Iteratively
 */
public class BinarySeacrh {

    private static boolean searchRecursively(int[] items, int itemToFind, int min, int max) {

        if (min > max) {
            return false;
        }

        int mid = min + (max-min)/2;
        if (items[mid] == itemToFind) {
            return true;
        }

        if (itemToFind < items[mid] ) {
            max = mid -1;
        } else
            { min = mid +1; }

        return searchRecursively(items, itemToFind, min, max);
    }

    private static boolean searchIteratively(int[] items, int itemToSearch, int min, int max) {

        while (min <= max) {
            int mid = min + (max-min)/2;

            if (items[mid] == itemToSearch) {
                return true;
            }

            if (itemToSearch < items[mid]) {
                max = mid-1;
            } else {
                min = mid +1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        final int[] sortedArray = new int[] {10, 12, 13, 14, 19, 21, 25, 26};
        final int itemToSearch = 75;

        System.out.println("searchRecursively Item found ? "+searchRecursively(sortedArray, itemToSearch, 0, sortedArray.length - 1));
        System.out.println("searchIteratively Item found ? "+searchIteratively(sortedArray, itemToSearch, 0, sortedArray.length - 1));
    }
}
