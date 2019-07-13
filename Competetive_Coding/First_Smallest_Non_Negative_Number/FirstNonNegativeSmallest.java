package Competetive_Coding.First_Smallest_Non_Negative_Number;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Find the smallest positive integer that does not occur in a given sequence.
 */
public class FirstNonNegativeSmallest {

    public static void main(String[] args) {

        int[] randomNums = new int[] {-1,0,1,2,3, 5,6,7};
        int smallest = solution(randomNums);
        System.out.println("Smallest is = "+smallest);
    }

    public static int solution(int[] A) {

        Set<Integer> treeSet = new TreeSet<>();

        for(int a: A) {
            treeSet.add(a);
        }
        ArrayList<Integer> sorted = new ArrayList<>();

        for(Integer a: treeSet) {
            if(a > 0) {
                sorted.add(a);
            }
        }

        int size = sorted.size();

        if(size == 0) { return 1; }

        else if(sorted.get(0)!=1) {
            return 1;
        } else {
            for (int i = 1; i < size; i++) {
                if ((sorted.get(i) - sorted.get(i - 1)) != 1) {
                    return sorted.get(i - 1) + 1;
                }
            }
        }

        return sorted.get(size-1)+1;
    }
}
