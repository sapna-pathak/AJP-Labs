// import java.util.Scanner;
// public class Array {
//   public static void main(String[] args) {
//     int sum=0,n,i;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter length=");
//     n=sc.nextInt();
//     int a[]=new int [n];
//     System.out.println("enter array elements");
//     for(i=0;i<n;i++)
//     {
//         a[i]=sc.nextInt();
//     }
//     for(i=n-1;i>=0;i--)
//     {
//         System.out.print(a[i]+" ");
//     }
//   }  
// }
import java.util.Scanner;
public class Array {
  public static void main(String[] args) {
    int n,i,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length=");
    n=sc.nextInt();
    int a[]=new int [n];
    System.out.println("enter array elements");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        if(a[i]%2==0)
        {
        count++;
        }
        System.out.println(count);
        int b[]=new int[count];
        // if(a[i]%2==0)
        // {
        // for(int j=0;j<count;j++){
        //     System.out.print(b[j]+" ");
        // }
        // }   
        }
    }
    // System.out.println(count);
    // int b[]=new int[count];

    // for(i=0;i<count;i++)
    // {
    //     if(a[i]%2==0)
    //     {
    //         b[i]=a[i];
    //         System.out.print(b[i]+" ");
    //     }
    // }
    
  }  
