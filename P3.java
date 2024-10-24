
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    private void getInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter Employee Age: ");
        age = scanner.nextInt();
        
        System.out.print("Enter Employee Salary: ");
        salary = scanner.nextDouble();
    }

    public void showInput() {
        getInput();

        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
public class P3{
    public static void main(String[] args) {
        
        Employee e=new Employee();
        e.showInput();
    }
}
