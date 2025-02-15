package regex.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtraction {
    public static void emailExtraction(String emailText){
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailText);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        String input = "Contact us at support@example.com and info@company.org";
        emailExtraction(input);
    }
}
