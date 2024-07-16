package src.main.java.ua.goit.Module7;

public class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter {
    public int count(String phrase) {
        int result = 0;
        for(char i : phrase.toCharArray()) {
//if(i == ',' | i == '.' | i == '!' | i == ':' | i == ';') {
//    result += 1;
//}
            switch (i) {
                case ',', '.', '!', ':', ';' -> result += 1;
            }
        }
return result;
    }
}