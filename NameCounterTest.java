package src.main.java.ua.goit.Module7;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
        //4
        System.out.println(new NameCounter().count("Hogeu Iz Ma AVV Ixxas"));
    }
}

class NameCounter {
    public int count(String text) {
        int counter = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (Character.isUpperCase(words[i].charAt(0)) && Character.isLowerCase(words[i].charAt(1))) {
                counter += 1;
            }
        }
        return counter;
    }
}







