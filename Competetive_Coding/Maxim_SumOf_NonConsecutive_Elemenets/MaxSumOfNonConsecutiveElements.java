package Competetive_Coding.Maxim_SumOf_NonConsecutive_Elemenets;

/**
 * Created by sj042124 on 03/07/19.
 */
public class MaxSumOfNonConsecutiveElements {

    static int[] a = new int[] {-1, -2, 3, 14, 1, 1};
    public static void main(String[] args) {

        int sum = findMaxSum(a);
        System.out.println(sum);
    }

    static int findMaxSum(int[] a) {
        int[] dp = new int[] {a[0], a[1]};
        for(int i = 2; i < a.length; i++)
        {
            int temp = dp[1];
            dp[1] = dp[0] + a[i];
            dp[0] = Math.max(dp[0], temp);

        }
        int answer = Math.max(dp[0], dp[1]);
        return answer;
    }

}
