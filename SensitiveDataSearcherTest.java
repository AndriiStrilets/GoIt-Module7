package src.main.java.ua.goit.Module7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello email"));
        System.out.println(searcher.isSensitiveDataPresent("Hello key"));
        System.out.println(searcher.isSensitiveDataPresent("Hello login"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        Pattern pattern = Pattern.compile("pass|key|login|email", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phrase);
        boolean result = matcher.find();
        return result;
    }
}


