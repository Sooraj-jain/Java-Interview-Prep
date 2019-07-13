package Competetive_Coding.Perfect_Continous_SquareRoots;

/**
 * Program to find maximum continuous perfect squareroots of a number in the Range A, B [inclusive of both]
 * Ex: N=10 M=20 ==> 16 = 4*4 , 4=2*2
 * There are 2 immediate squarroots for 16. So answer is 2. There are no other perfect sqrroots between 10 & 20
 */
public class SqrRoots {

    public static int solution(int A, int B) {
        int countOfMaxSqrRoots = 0;

        while (A <= B) {

            int aRoot = (int) (Math.ceil(Math.sqrt(A)));
            int bRoot = (int) (Math.floor(Math.sqrt(B)));

            if (aRoot == A && bRoot == B) {
                break;
            }

            A = aRoot;
            B = bRoot;

            if (A <= B) {
                countOfMaxSqrRoots++;
            }
        }
        return countOfMaxSqrRoots;
    }

    public static void main(String[] args) {
        System.out.println(solution(10,20));
    }
}
