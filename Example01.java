import java.util.ArrayList;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        String firstFruit = fruits.get(0);
        System.out.println("The first fruit is: " + firstFruit);
    }
}