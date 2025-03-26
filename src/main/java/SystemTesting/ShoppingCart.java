package SystemTesting;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> prices = new ArrayList<>();

    public void addItem(double price) {
        prices.add(price);
    }

    public double getTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}