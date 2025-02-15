package regex.advancedregexproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String regex = "^4[0-9]{15}|^5[0-9]{15}";

        Pattern pattern = Pattern.compile(regex);

        String input = "49989999999999999";
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Visa credit card");

        }else {
            System.out.println("invalid card");
        }
    }
}

