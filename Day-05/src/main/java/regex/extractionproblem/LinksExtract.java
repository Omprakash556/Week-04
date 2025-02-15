package regex.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinksExtract {
    public static void extractLink(String webPage){
        String regex = "\\b(https?://(www\\\\.)?([a-zA-Z0-9.-]+))\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(webPage);
        while (matcher.find()){
            System.out.print(matcher.group()+", ");
        }

    }
    public static void main(String[] args) {
        String input = "Visit https://www.google.com and http://example.org for more info.";
        extractLink(input);
    }
}
