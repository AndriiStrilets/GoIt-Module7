package src.main.java.ua.goit.Module7;

public class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));
        String longPhrase = "feleiqixhaniveqlutyt";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator {
    public String create(String text) {
        if (text.length() <= 15) {
            return text;
        } else if (text.charAt(15) == ' ') {
            return text.substring(0, 15);

        } else {
            return text.substring(0, 15) + "...";
        }
    }
}

