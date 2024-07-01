package src.main.java.ua.goit.Module7;

import java.util.Arrays;

public class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}

  class Phrase {
      private String[] words;


      public Phrase(String[] words) {
          this.words = words.clone();
      }

      public String toString() {
          String result = " ";

    return String.join(" " ,words);
    }
}
