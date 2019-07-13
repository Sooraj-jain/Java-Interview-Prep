package Competetive_Coding.Number_Of_Ways_To_Reach;

/**
 * Created by sj042124 on 03/06/19.
 */
public class NumSteps {

    public static void main(String[] args) {
        int n = 10;
        NumStepsImp steps = new NumStepsImp();
        System.out.println("no of ways = "+steps.recursiveSteps(n));
        System.out.println("Looping no of ways = "+steps.loopingWay(n));
        System.out.println("Dynamic prog no of ways = "+steps.dynamicWay(n));
    }
}
