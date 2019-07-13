package What_Is_the_output;

import java.lang.reflect.Array;

/**
 * "Java manipulates objects 'by reference,' but it passes object references to methods 'by value.'"
 *
 * Output
 *
 * ********* Initial Values *************
 container1.A = 1
 container1.B = 2
 container2.A = 10
 container2.B = 20
 ********* Swap worked on References *************
 container1.A = 0
 container1.B = 0
 container1.A = 100
 container1.B = 200
 ***********After Tricky()***********
 container1.A = 100
 container1.B = 200
 container2.A = 0
 container2.B = 0

 */
public class JavaCallByValue {

    public static void tricky(Container c1, Container c2)
    {
        c1.A = 100;
        c1.B = 200;

        c2.A = 0;
        c2.B = 0;

        Container temp = new Container();

        temp = c1;
        c1 = c2 ;
        c2 = temp;

        System.out.println("********* Swap worked on References *************");
        System.out.println("container1.A = "+ c1.A);
        System.out.println("container1.B = "+ c1.B);

        System.out.println("container1.A = "+ c2.A);
        System.out.println("container1.B = "+ c2.B);

    }
    public static void main(String [] args)
    {

        final Container container1 = new Container();
        container1.A = 1;
        container1.B = 2;

        final Container container2 = new Container();
        container2.A = 10;
        container2.B = 20;

        System.out.println("********* Initial Values *************");
        System.out.println("container1.A = "+ container1.A);
        System.out.println("container1.B = "+ container1.B);

        System.out.println("container2.A = "+ container2.A);
        System.out.println("container2.B = "+ container2.B);

        tricky(container1, container2);

        System.out.println("***********After Tricky()***********");

        System.out.println("container1.A = "+ container1.A);
        System.out.println("container1.B = "+ container1.B);

        System.out.println("container2.A = "+ container2.A);
        System.out.println("container2.B = "+ container2.B);
    }
}
