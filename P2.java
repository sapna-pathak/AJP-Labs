import java.util.Scanner;
public class P2 {
    public static void fun(int age){
        if(age<18){
            throw new ArithmeticException();
         }
         else
         {
          System.out.println("you can vote");
         }
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age=");
        int age=sc.nextInt();
        try{
            fun(age);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
   
    }
}
