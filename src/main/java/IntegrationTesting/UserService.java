package IntegrationTesting;

public class UserService {
    private UserDatabase database;

    public UserService() {
        this.database = new UserDatabase();
    }
    public boolean login(String username, String password) {
        return database.isValidUser(username, password);
    }
}
