public class Natural {
    public static void main(String[] args) {
        int sum=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter value of n=");
        // int n= sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     sum+=i;
        // }
        // System.out.println("sum of "+n +" natural numbers="+ sum);
        // System.out.println("even numbers upto hunndred");
        // for(int i=1;i<=100;i++){
        //    if(i%2==0)
        //    System.out.print(" " +i);
        // }
        // System.out.println("\n");
        // System.out.println("odd numbers upto hunndred");
        // for(int i=1;i<=100;i++){
        //    if(i%2!=0)
        //    System.out.print(" " +i);
        // }
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
                sum=sum+i;
                System.out.println(sum);
            }
        }

    }
}
