package What_Is_the_output;

import java.util.ArrayList;

/**
 * Swap String
 */
public class StringArray {

    static int a = 2;

    public static void main(String[] args) {

        a = 5;
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("AAA");
        l1.add("BBB");

        //addSomeMoreStrings(l1);
        Helper helper = new Helper();

        modifyPrimitive(a);
        //System.out.println("a value = " + a); // Prints 5

        changeA();
        //System.out.println("a value = " + a); // Prints 200

        //System.out.println("a value = "+ changeAndReturnA(a)); // Prints 300

        helper.modifyOriginalObject(l1);
        System.out.println(l1);

        for (String output: l1) {
            //System.out.println("Final l1 value: "+output);
        }

    }

    static void addSomeMoreStrings(ArrayList<String> l2) {
        //System.out.println(l2);

        //l2.add("CCC");

        for (String output: l2) {
           // System.out.println("First l2 value: "+output);
        }

        l2 = new ArrayList<String>();
        l2.add("DDD");

        for (String output: l2) {
            //System.out.println("Second l2 value: "+output);
        }
    }

    static void changeA(){
        a=200;
    }

    static int changeAndReturnA(int b){
        return 300;
    }


    static void modifyPrimitive(int b) {
        b = 100;
    }
}

