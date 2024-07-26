package src.main.java.ua.goit.Module7;

import java.util.Comparator;
import java.util.HashSet;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class WordCombineTest {
    public static void main(String[] args) {
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {

        char[] targetChars = targetWord.toCharArray();
        for (char targetChar : targetChars) {
            // Comparator<String> caseInsensitiveOrder = CASE_INSENSITIVE_ORDER;
            return sourceWord.contains(targetChar + "");
        }
        return false;
    }
}

