package src.main.java.ua.goit.Module7;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       String reversed = reverseStringWithNewObject("Hello World");
        System.out.println(reversed);
        String reversed1 = reversedStringWithotAdditionalMemoryUsage("Hello World");
        System.out.println(reversed1);
        String builderReversed = stringBuilderReversed("Hello John");
        System.out.println(builderReversed);
    }

    private static String stringBuilderReversed(String input) {
        StringBuilder reversed = new StringBuilder(input);
        String result = reversed.append(input).reverse().toString();
        return result;
    }

    private static String reversedStringWithotAdditionalMemoryUsage(String input) {
        char[] chars = input.toCharArray();
        int begin = 0;
        int end = chars.length - 1;
        char temp;
        while (begin < end) {
            temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin ++;
            end --;
        }
        return new String(chars);
    }

    private static String reverseStringWithNewObject(String input) {
        char[] inputChars = input.toCharArray();
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = inputChars[input.length() - i - 1];
        }
        return new String(result);
    }
}


