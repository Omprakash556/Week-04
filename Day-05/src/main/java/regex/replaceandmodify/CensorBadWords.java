package regex.replaceandmodify;


import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static String  censorWords(String sentence, List<String> badWords){
        String regex = "\\b(" +String.join("|",badWords) +")\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        return matcher.replaceAll("****");
    }
    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("Stupid", "damn");
        System.out.println(censorWords(sentence, badWords));
    }
}
