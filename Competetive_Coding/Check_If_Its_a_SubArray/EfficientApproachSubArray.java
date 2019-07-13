package Competetive_Coding.Check_If_Its_a_SubArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Most efficient approach to find if B is subset of A
 */
public class EfficientApproachSubArray {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] arrayA = scanner.nextLine().split(" ");
        String[] arrayB = scanner.nextLine().split(" ");

        List<Integer> a = new ArrayList<>();
        int aSize = arrayA.length;
        int bSize = arrayB.length;

        if (isSubArray(arrayA, arrayB, aSize, bSize)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isSubArray(String[] arrayA, String[] arrayB, int aSize, int bSize) {

        int i = 0, j = 0;
        while(i< aSize && j< bSize) {

            if (arrayA[i].equals(arrayB[j])) {

                j++; i=0;
                if (j == bSize) {
                return true;
                }

            } else {
                i++;
            }
        }

        return false;
    }
}
