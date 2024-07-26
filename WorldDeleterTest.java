package src.main.java.ua.goit.Module7;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class WorldDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();
        //Hello
        System.out.println(wordDeleter.remove("Hello Java friend", new String[] {"Java"}));

        //zyryzai matajilyh
        System.out.println(wordDeleter.remove("zyryzai yhypno potou zawofu matajilyh egces", new String[] {"egces zawofu matajilyh yhypno"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));

        System.out.println(wordDeleter.remove("objiqono taizdop zawofu", new String[] {"zawofu"}));
    }
}
// my code
//class WordDeleter {
//    public String remove(String phrase, String[] words) {
//        String s = String.join(" ", words);
//        String[] a = s.split(" ");
//        String[] newPhrase = phrase.split("\\s+");
//
//        String out = "";
//        for (int j = 0; j < newPhrase.length; j++) {
//            for (int i = 0; i < a.length; i++) {
//                if (newPhrase[j].contentEquals(a[i])) {
//                    newPhrase[j] = " ";
//                    out = String.join(" ", newPhrase).trim().replaceAll("\\s+", " ");
//                }
//            }
//        }
//        return out;
//    }
//}
// mentor code
class WordDeleter {
public static String remove(String phrase, String[] words) {
    StringBuilder result = new StringBuilder();

    matchWordLoop: // name of loop to specify break
    for (String phraseWord : phrase.split(" ")) {
        for (String word : words) {
            if (word.equals(phraseWord)) {
                continue matchWordLoop;
            }
        }
        result.append(phraseWord).append(" ");
    }

    return result.toString().trim();
}
}

//class WordDeleter {
//    public String remove(String phrase, String[] words) {
//
//        String newWords = String.join(",", words);
//
//        String[] newWordsArray = newWords.split(",");
//        String[] newPhrase = phrase.split("\\s");
//
//        String result = "";
//
//        for (String part : newPhrase) {
//
//            for (String word : newWordsArray) {
//                if (!part.equals(word)) {
//                result = (result + " " + part).trim();
//                }
//            }
//        }
//
//        return result;
//    }
//}

//class WordDeleter {
//    public StringBuilder remove(String phrase, String[] words) {
//        String[] newPhrase = phrase.split("\\s+");
//        StringBuilder result = new StringBuilder();
//        for (String part : newPhrase) {
//            if (!Objects.equals(part, words[0])) {
//                result.append(part).append(" ");
//            }
//        }
//        return result;
//    }
//}

//class WordDeleter {
//    public String remove(String phrase, String[] words) {
//        String[] phraseWords = phrase.split(" ");
//StringBuilder builder = new StringBuilder();
//for (String part : phraseWords) {
//    if(!part.equals(phrase)) {
//
//    }
//}
//    }
//    }

