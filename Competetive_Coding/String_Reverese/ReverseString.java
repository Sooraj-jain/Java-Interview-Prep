package Competetive_Coding.String_Reverese;

/**
 * Created by sj042124 on 13/06/19.
 */
public class ReverseString {

    public static void main(String[] args) {

        String a = "Hello";
        System.out.println(a);
        System.out.println("length is = "+ a.length());

        System.out.println("using API = "+ usingAPI(a));
        System.out.println("using recursion = "+ usingStackOrRecursion(a));
        System.out.println("usingLoop = "+ usingLoop(a));
    }

    public static String usingAPI(String a) {
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString();
    }

    // Implementation using Stack and Recursion. Burden on memory
    public static String usingStackOrRecursion(String a) {

        if (a.length() == 1) {
            return a;
        }
        String rev = usingStackOrRecursion(a.substring(1)) + a.charAt(0);
        return rev;
    }

    // Most efficient bcz No burden on stack and no extra storage needed as we are overriding on same rev value
    public static String usingLoop(String a) {
        String rev = "";
        for (int i = a.length()-1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        return rev;
    }
}
