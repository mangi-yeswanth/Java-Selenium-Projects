package Project;
import java.io.IOException;
import java.util.List;

public class IntegrationTest {
    public static void main(String[] args) throws IOException {
        // Setup
        String testFilePath = "test_users.txt";
        UserRepository repo = new UserRepository(testFilePath);
        repo.clear(); // make sure file is empty before testing

        UserService service = new UserService(repo);

        // Test
        service.registerUser("1", "ABC");
        service.registerUser("2", "DEF");

        List<User> users = service.getAllUsers();

        assert users.size() == 2 : "Expected 2 users";
        assert users.get(0).getName().equals("ABC") : "First user should be ABC";
        assert users.get(1).getName().equals("DEF") : "Second user should be DEF";

        System.out.println("Integration test passed!");

        // Clean up
        repo.clear();
    }
}