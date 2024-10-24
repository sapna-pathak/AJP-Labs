
import java.util.Scanner;

public class AJPlab1b {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print(("enter Ist number="));
        a = sc.nextInt();
        System.out.print(("enter IInd number="));
        b = sc.nextInt();
        c = a > b ? a : b;
        System.out.println("largest number= " + c);
    }
}
