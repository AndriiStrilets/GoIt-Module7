package src.main.java.ua.goit.Module7;

import java.util.Arrays;

public class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        System.out.println(counter.count("Level done!"));
        System.out.println(counter.count("No palindromes doc"));
        System.out.println(counter.count("Gyyg Qehheq segaa oh Jyaayj Birrib Uhhuuhhu Libbil Aqagllgaqa"));
    }
}

class PalindromeCounter {
    public int count(String phrase) {

        int counter = 0;
        String[] s = phrase.toLowerCase().split("\\s+"); // зробив з стрінг масив з двома откремими стрінгами

        for (int i = 0; i < s.length; i++) { // проходжуся по масиву

            //System.out.println(s[i].length());
            int lastIndex = s[i].length() - 1; // позначаю останній елемент стрінги
            if (s[i].charAt(0) == s[i].charAt(lastIndex)) { // порівнюю перший елемент з останнім
                counter += 1; // якщо збігаються то додаю 1
            }
            lastIndex--; // не розумію чому не активно ?

        }
        return counter; //повертаю кількість паліндромів в масиві
    }
}
