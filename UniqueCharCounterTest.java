package src.main.java.ua.goit.Module7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter {
    public int count(String phrase) {
        int charCounter = 0;
        char[] phrase1 = phrase.toCharArray();
        Set<Character> set = new HashSet<>();
        //System.out.println(phrase1);
        for (int i = 0; i < phrase1.length; i++) {

            if (set.add(phrase1[i])) {
                charCounter += 1;

            }
        }
        return charCounter;
    }
}


