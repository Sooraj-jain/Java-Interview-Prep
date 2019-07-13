package Competetive_Coding.Subject_and_Students_Credit_Pairs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a list of Students and Subjects along with credits of each, a student can select only those subjects whose credits are less than equal to his/her credits.
 * Return the number of pairs of students and subjects.
 * Ex: Subjects:{3,4,1,2} students:{5,3}
 * So there can be 7 pairs
 */
public class CreditPairs {

    public static void main(String[] args) {

        int[] subCreds = new int[]{3, 4, 1, 2};
        int[] stutCres = new int[]{5, 3};

        System.out.println("No of pairs = " + findNumOfPairs(subCreds, stutCres));
    }

    static int findNumOfPairs(int[] subCreds, int[] studCreds) {

        List<Integer> credList = new ArrayList<>();
        for (int subCred : subCreds) {
            credList.add(subCred);
        }

        Collections.sort(credList);

        for (Integer i : credList) {
            System.out.println(i);
        }

        int length = studCreds.length;

        int index = 0, count = 0;

        while (index < length) {
            for (Integer cred : credList) {

                if (cred > studCreds[index]) {
                    break;
                }
                count++;
            }
            index++;
        }
        return count;
    }
}
