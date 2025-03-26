package IntegrationTesting;

public class UserDatabase {
    public boolean isValidUser(String username, String
            password) {
        return username.equals("admin") &&
                password.equals("password123");
    }
}
