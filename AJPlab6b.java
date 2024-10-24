import java.util.Stack;

public class AJPlab6b {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements in the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the stack
        System.out.println("Stack after adding 10 elements: " + stack);

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        // Display the stack after removing elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}
