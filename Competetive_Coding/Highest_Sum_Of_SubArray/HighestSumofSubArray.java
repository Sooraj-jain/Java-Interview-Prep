package Competetive_Coding.Highest_Sum_Of_SubArray;

/**
 * Compare each number with each other in loop.
 * 2 loops = N^2
 */
public class HighestSumofSubArray {

    public static void main(String[] args) {

        int[] fullArray = new int[]{-2, 1, 2, 6, -3, 10, 4, -1};
        int n = fullArray.length;

        int maxSumTillNow = 0, sum = 0;
        for (int i=0; i<n; i++) {
            int j = i;
            while (j < n) {

                if ((sum + fullArray[j]) > sum) {
                    sum = sum + fullArray[j];
                    j++;
                } else { break; }
            }
            if (sum > maxSumTillNow){
                maxSumTillNow = sum;
            }
            sum = 0;
        }
        System.out.println(maxSumTillNow);
    }
}
