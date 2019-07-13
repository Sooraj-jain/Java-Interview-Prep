package Competetive_Coding.Check_If_Its_a_SubArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Code to check if an array B is a sub-Array of Array A.
 * Ex: {aaa, bbb, ccc} {aaa, aaa, aaa} -- returns true & false by 2 methods
 */
public class SubArray {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] arrayA = scanner.nextLine().split(" ");
        String[] arrayB = scanner.nextLine().split(" ");

        Set<String> superSet = new HashSet<String>();
        List<String> superSetList = new ArrayList<>();

        boolean flag;
        boolean flagD;
        if (arrayB.length<= arrayA.length) {

            for (String A: arrayA) {
                superSet.add(A);
                superSetList.add(A);
            }

            flag = isSubArray(superSet, arrayB);
            flagD = isSubArrayWithDup(superSetList, arrayB);
        } else {
            for (String B: arrayB) {
                superSet.add(B);
                superSetList.add(B);
            }
            flag = isSubArray(superSet, arrayA);
            flagD = isSubArrayWithDup(superSetList, arrayA);
        }

        System.out.println("Is subset? : "+flag);
        System.out.println("Is subset considering duplicates? :"+flagD);
    }

    public static boolean isSubArray(Set<String> mainSet, String[] subset) {
        for (String B: subset) {
            if(!mainSet.contains(B)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSubArrayWithDup(List<String> mainList, String[] subset) {
        for( String B: subset) {
            if(mainList.contains(B)) {
                mainList.remove(B);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
