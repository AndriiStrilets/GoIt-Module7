package src.main.java.ua.goit.Module7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
class DigitText {
    public boolean detect(String text) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher(text);
        boolean find = m.find();
        if (find) {
            return false;
        } else {
            return true;
        }
    }
}