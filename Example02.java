import java.util.ArrayList;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer firstNumbers = numbers.get(0);
        System.out.println("The first numbers is: " + firstNumbers);
    }
}