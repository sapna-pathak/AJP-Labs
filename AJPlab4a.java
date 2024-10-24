public class AJPlab4a {

    public static void main(String[] args) {
    int[] num = {0, 1, 2, 3, 4}; // array of 5 elements
    try {
    // ArrayIndexOutOfBoundsException
    System.out.println("Accessing element at index 6: " + num[6]);
    } catch (ArrayIndexOutOfBoundsException e) {
    // Catching the exception and printing a message
    System.out.println("Caught an ArrayIndexOutOfBoundsException: \n" + e.getMessage());
    }
    
    }
    
    }