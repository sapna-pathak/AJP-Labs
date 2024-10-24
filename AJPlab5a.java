import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AJPlab5a {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Display the original list
        System.out.println("Original List: " + stringList);

        // Reverse the list
        Collections.reverse(stringList);

        // Display the reversed list
        System.out.println("Reversed List: " + stringList);
    }
}
