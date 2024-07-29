package src.main.java.ua.goit.Module7;

import java.util.Comparator;
import java.util.HashSet;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class WordCombineTest {
    public static void main(String[] args) {
        //true
//        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
//        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
//        System.out.println(new WordCombine().canCombine("War", "Piece"));

        System.out.println(new WordCombine().canCombine("qawzc", "ZAA"));
    }
}

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
String targetSource = sourceWord.toLowerCase();
        char[] targetChars = targetWord.toLowerCase().toCharArray();
        for (char targetChar : targetChars) {
            // Comparator<String> caseInsensitiveOrder = CASE_INSENSITIVE_ORDER;
            return targetSource.contains(targetChar + "");
        }
        return false;
    }
}

