package AcceptanceTesting;

import java.util.ArrayList;
import java.util.List;

public class OrderSystem {
    private List<String> orders = new ArrayList<>();

    public boolean placeOrder(String item) {
        if (item.isEmpty()) {
            return false; // Order fails if item is empty
        }
        orders.add(item);
        return true; // Order successful
    }

    public int getTotalOrders() {
        return orders.size();
    }
}
