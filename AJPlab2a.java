
import java.util.Scanner;

public class AJPlab2a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number=");
        int m = sc.nextInt();
        int r, i, sum = 0, n = m, s = 1;
        while (n != 0) {
            r = n % 10;
            for (i = 1; i <= r; i++) {
                s = s * i;
            }
            sum = sum + s;
            s = 1;
            n = n / 10;
        }
        if (m == sum) {
            System.out.println("given number is strong number");
        } else {
            System.out.println("given number is not strong number");
        }
    }
}
