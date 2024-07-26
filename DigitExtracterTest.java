package src.main.java.ua.goit.Module7;

import java.util.Arrays;

public class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");
        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {
    public static int[] extract(String text) {

String extractedString = "";
        for(int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
              extractedString += text.charAt(i);
            }
        }
String[] extractedStrings = extractedString.split("");

        char[] a = extractedString.toCharArray();
        int[] result = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            result[i] = Character.getNumericValue(a[i]);
        }
        return result;
    }
}