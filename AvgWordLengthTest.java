package src.main.java.ua.goit.Module7;

public class AvgWordLengthTest {
    public static void main(String[] args) {
        System.out.println(new AvgWordLength().count("Launch Rocket"));
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
class AvgWordLength {
 public double count(String phrase) {
     int wordsQuantity = 0;
     int spacesQuantity = 0;
     int phraseLength = phrase.length();
     double result = 0;
     for (int i = 0; i < phrase.length(); i++) {
         if (phrase.charAt(i) == ' ') {
             spacesQuantity += 1;
         }
     }
     wordsQuantity = spacesQuantity + 1;
     result = (double) (phraseLength - spacesQuantity) / wordsQuantity;
     return result;
 }
}
