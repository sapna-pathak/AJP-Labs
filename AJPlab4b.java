public class AJPlab4b {

	public static void main(String[] args) {
	
		int[] num = new int[100];

        // Filling the array from 1 to 100
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1; // Assigning values 1 to 100
        }

        // Printing the elements of the array
        System.out.println("Array elements from 1 to 100:");
        for (int i=0;i<=num.length-1;i++) {
            System.out.print(num[i] + "\t");
        }


	}
}
