package src.main.java.ua.goit.Module7;

import java.util.Arrays;

public class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();
        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));
        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
        System.out.println(freqCounter.countFreq("faorluqofun uktoza etjobunu jele daxokasycu mem etjobunu " +
                "vaogydsevai juevip etjobunu gerecesue arc", "etjobunu"));
    }
}
class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float c = 0f;
        float numbersOfWords = phrase.split("\\s").length; // finds numbers of words inside if the String
        //System.out.println(numbersOfWords);

//        String regex = ",";
        String[] g = phrase.split("\\s+"); // split String with comma and convert to Array

        for (int i = 0; i < g.length; i++) {
            if (g[i].toLowerCase().contentEquals(word.toLowerCase())) {
                c += 1;
            }
        }
        return c/numbersOfWords;
    }
}




