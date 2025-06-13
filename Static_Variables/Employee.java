import java.io.*;

public class Employee{
    // Salary variable is a private static variable
    private static double salary;

    //DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";
    public static void main(Strin args[]){
        salary = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}

/*NOTE
 * If the variables are accessed from an outside class,
 * the constant should be accessed as Employee.DEPARTMENT
 */