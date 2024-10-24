import java.util.HashSet;

public class AJPlab6a {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Cherry");

        // Print the original HashSet
        System.out.println("Original HashSet: " + hashSet);

        // Element to append
        String elementToAdd = "Mango";

        // Append the specified element to the end of the HashSet
        hashSet.add(elementToAdd);

        // Print the updated HashSet
        System.out.println("Updated HashSet after appending " + elementToAdd + ": " + hashSet);
    }
}
