package annotation.advancedlevel.customserialization;

public class Main {
    public static void main(String[] args) {
        // Create an instance of User
        User user = new User("John Doe", 30, "john.doe@example.com");

        // Convert the User object to a JSON string
        String jsonString = JsonSerializer.toJson(user);

        // Print the generated JSON string
        System.out.println(jsonString);
    }
}
