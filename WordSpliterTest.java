package src.main.java.ua.goit.Module7;

import java.util.Arrays;

public class WordSpliterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();
        String[] words = wordSplitter.split("Hello       world");
        System.out.println(Arrays.toString(words));
    }
}
class WordSplitter {
    public String[] split(String phrase) {
        String[] str = new String[] {phrase.toLowerCase().replaceAll("\\s+", ", ")};
        return str;
    }
}