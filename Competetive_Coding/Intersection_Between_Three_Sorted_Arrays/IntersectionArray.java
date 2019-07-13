package Competetive_Coding.Intersection_Between_Three_Sorted_Arrays;

/**
 * Given 3 integer Arrays A[], B[], C[],
 * Find the intersection among all 3 arrays. (Common numbers present in all 3 including repeated Nums)
 * Output the intersecting Array[] 
 */
public class IntersectionArray {

    static int[] findIntersection(int[] A, int[] B, int[] C) {

        int aSize = A.length;
        int bSize = B.length;
        int cSize = C.length;
        int min = 0;

        if (aSize < bSize) {
            min = aSize;
        } else if (bSize < cSize) {
            min = bSize;
        } else {
            min = cSize;
        }

        int[] intersection = new int[min];

        int x = 0 , y = 0 , z = 0;
        int size=0;

        while (x < aSize && y < bSize && z < cSize) {

            if (A[x] == B[y] && B[y] == C[z]) {
                intersection[size] = A[x];
                size++;
            } else if (A[x] < B[y]) {
                x++;
            } else if (B[y] == C[z]) {
                y++;
            } else {
                z++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {

        int[] A = new int[] {10, 13, 20, 30, 40};
        int[] B = new int[] {12, 13, 15, 16};
        int[] C = new int[] {11, 13, 15, 17};

        int[] intersection = findIntersection(A, B, C);

        for (int i: intersection) {
            System.out.println(i);
        }
    }
}
