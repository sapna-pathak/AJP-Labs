import java.util.ArrayList;

public class AJPlab5b {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);

        // Calculate the sum of even numbers
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add to sum
            }
        }

        // Display the result
        System.out.println("Sum of even numbers: " + sum);
    }
}
