import java.util.ArrayList;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(13.543);
        prices.add(14.543);
        prices.add(15.543);
        Double firstPrices = prices.get(0);
        System.out.println("The first prices is: " + firstPrices);
    }
}