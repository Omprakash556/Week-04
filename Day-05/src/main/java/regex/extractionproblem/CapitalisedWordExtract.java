package regex.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalisedWordExtract {
    public static void capitalisedWordExtraction(String input){
        String regex = "(?!The)(?!An)[A-Z][a-zA-Z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        capitalisedWordExtraction(input);
    }
}
