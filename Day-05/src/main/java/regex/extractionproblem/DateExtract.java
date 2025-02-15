package regex.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtract {
    public static void extractDate(String sentence){
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()){
            System.out.print(matcher.group()+", ");
        }
    }
    public static void main(String[] args) {
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        extractDate(input);
    }
}
