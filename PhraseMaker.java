package src.main.java.ua.goit.Module7;

public class PhraseMaker {
    public String join(String[] words) {
        StringBuilder phrase = new StringBuilder();
        for (String word : words) {
            if (word.length() > 3) {
                phrase.append(word.toLowerCase()).append(" ");
            } else {
                phrase.append(word.toUpperCase()).append(" ");
            }
        }
        return phrase.toString().trim();
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "greate", "thing"};
        System.out.println(new PhraseMaker().join(words));
    }
}