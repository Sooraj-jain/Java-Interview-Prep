package Competetive_Coding.Number_Of_Ways_To_Reach;

/**
 * In the StairCase, given stairs of n, one can take either 1 step OR 2 steps from any point.
 * How many ways one can reach the top of staircase of n steps?
 * Ex: if there are 2 steps , either step1+step2 OR directly step 2 => Hence 2 ways
 */
public class NumStepsImp {

    // Recursive function. Define the base case, and recursive case.
    // Runs till problem divided into smaller units meets the base case
    int recursiveSteps(int n) {
        while (n > 0) {
            if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 2;
            } else {
                return recursiveSteps(n - 1) + recursiveSteps(n - 2);
            }
        }
        //for 0 steps u can do nothing that is 1 way
        return 1;
    }

    // without making stack grow, simply store all values in a array
    int loopingWay(int n){
        if (n <= 1) {
            return 1;
        }
        int[] noOfWays = new int[n+1];
        noOfWays[0]=1;
        noOfWays[1]=1;
        for (int i=2; i<=n ; i++) {
            noOfWays[i] = noOfWays[i-1]+noOfWays[i-2];
        }
        return noOfWays[n];
    }

    //without building stack using recursive calls
    //without storing a array for each results
    // store only what is needed that is last 2 values
    int dynamicWay(int n) {
        int n0 = 1, n1 = 1;
        if(n<=1) {
            return 1;
        }

        int sum = 0;
        for (int i=2; i<=n; i++) {
            sum = n0 + n1;
            n0 = n1;
            n1 = sum;
        }
        return sum;
    }

    // User can give use these steps [1,3,5]
    // using this, find the number of ways
    int dynamicSteps(int n, int[] possibleSteps) {
        return 0;
    }
}
