import java.util.ArrayList;
import java.util.List;

public class Example05 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        // Enhanced For Loop (For-Each)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}