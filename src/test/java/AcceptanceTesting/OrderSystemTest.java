package AcceptanceTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderSystemTest {

    @Test
    public void testSuccessfulOrder() {
        OrderSystem orderSystem = new OrderSystem();
        assertTrue(orderSystem.placeOrder("Laptop"), "Order should be placed successfully!");
        assertEquals(1, orderSystem.getTotalOrders(), "Total orders should be 1");
    }

    @Test
    public void testEmptyOrderFails() {
        OrderSystem orderSystem = new OrderSystem();
        assertFalse(orderSystem.placeOrder(""), "Empty order should NOT be placed!");
    }
}
