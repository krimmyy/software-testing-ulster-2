package SystemTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    public void testCartTotal() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(10.50);
        cart.addItem(5.25);
        cart.addItem(20.00);
        assertEquals(35.75, cart.getTotal(), 0.01, "Total should be 35.75");
    }
}
