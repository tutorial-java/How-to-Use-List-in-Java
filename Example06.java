import java.util.ArrayList;
import java.util.List;

public class Example06 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        // Using Lambda (Java 8+)
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}