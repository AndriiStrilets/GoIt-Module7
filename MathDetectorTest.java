package src.main.java.ua.goit.Module7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathDetectorTest {
    public static void main(String[] args) {
        System.out.println(new MathDetector().isMath("a+3=4"));
        System.out.println(new MathDetector().isMath("1992 is great year"));
        System.out.println(new MathDetector().isMath("3*|=4"));

    }
}

class MathDetector {
    public boolean isMath(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                counter++;
            }
        }
        if ((text.contains("+") || text.contains("-") || text.contains("*") || text.contains("/")) && text.contains("=") && counter > 1) {
            return true;
        } else {
            return false;
        }
    }
}