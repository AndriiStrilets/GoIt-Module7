package src.main.java.ua.goit.Module7;

import java.util.Arrays;

public class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
//        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
//        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}

class ShortWordCounter {
    public int count(String phrase, int minLength) {

        String[] string = phrase.split("\\s+");
int result = 0;
        for (String s : string) {
            if (s.length() <= minLength) {
                result += 1;
            }
        }
        return result;
    }
}
