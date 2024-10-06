import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Define a list of strings
        List<String> fruits = new ArrayList<>();
        
        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Print each element in the list
        System.out.println("\nList elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Accessing elements using index
        System.out.println("First fruit in the list: " + fruits.get(0));
    }
}
