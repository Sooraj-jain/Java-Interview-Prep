package Java_Concepts.Comparator_Vs_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class to illustrate the use Sorting an object based on some attributes.
 * Option 1) Implement the POJO calss with Comparable<POJO> Interface and override compareTo()
 * Option 2) If the source code of POJO cant be changed, then implement a Comparator<POJO> and override compare()
 * Both Interfaces are from java.util
 *
 * All Wrapper classes like Integer, String etc implement comparable
 *
 * In compareTo() and compare(), return 0 if object attributes are equal
 * Return Negative (-1 or any negative num) if this.value (or o1.value) < o2.value
 * Else Return Positive (+33 or any positive)
 */
public class ComparatorVsComparable {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        Employee E1 = new Employee("A", 5, 150);
        Employee E2 = new Employee("B", 2, 600);
        Employee E3 = new Employee("C", 10, 30);

        employees.add(E1);
        employees.add(E2);
        employees.add(E3);

        //Can run this becasue Employee class implements Comparable<Employee>
        Collections.sort(employees);

        for (Employee e1: employees) {
            System.out.println(e1.toString());
        }

        //I want to sort based on some other condition like Salary
        // But the compareTo method in Employee class, orders based on experience

        // Define a Comparator<Employee> and
        // Implement compare method of Comparator

        Comparator<Employee> comparator = new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {

                if(e1.getSalary() == e2.getSalary()) {
                    return 0;
                }

                if(e1.getSalary() < e2.getSalary()) {
                    return -11;
                }

                else {
                    return 22;
                }
            }
        };

        Collections.sort(employees, comparator);

        // OR
        employees.sort(comparator);

        System.out.println("------Using Comparator and compare() method--------");
        for (Employee e1: employees) {
            System.out.println(e1.toString());
        }
    }
}
