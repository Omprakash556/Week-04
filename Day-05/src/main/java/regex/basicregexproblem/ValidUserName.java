package regex.basicregexproblem;


public class ValidUserName {

    public static String validateUsername(String username) {
        if (username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$")) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        System.out.println(validateUsername("user_123"));
        System.out.println(validateUsername("123user"));
        System.out.println(validateUsername("us"));
    }
}

