package IntegrationTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserServiceTest {
    @Test
    public void testValidLogin() {
        UserService userService = new UserService();
        assertTrue(userService.login("admin", "password123"),
                "Valid login test failed!");
    }

    @Test
    public void testInvalidLogin() {
        UserService userService = new UserService();
        assertFalse(userService.login("user",
                "wrongpassword"), "Invalid login test failed!");
    }
}