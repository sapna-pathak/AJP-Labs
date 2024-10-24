
public class P1 {
    public static void main(String[] args) {
        int a[]={3,6,0,1,2};
        try{
            a[5]=a[0]/a[2];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("end of the code");
        }
        
    }
 
}
