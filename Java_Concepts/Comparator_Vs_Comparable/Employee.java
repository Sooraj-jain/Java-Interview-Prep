package Java_Concepts.Comparator_Vs_Comparable;

/**
 * POJO class for Employee
 */
public class Employee implements Comparable<Employee>{

    private String name;
    private int experience;
    private int salary;

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int experience, int salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     */
    @Override
    public int compareTo(Employee e2) {

        if(this.experience == e2.experience) { return 0;}

        if(this.experience < e2.experience) {
            return -10;
        }

        else {
            return 20;
        }


    }
}
