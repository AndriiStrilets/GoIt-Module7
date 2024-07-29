package src.main.java.ua.goit.Module7;
import java.util.Arrays;

public class NameParser {
    public String parse(String[] names) {

        StringBuilder sb = new StringBuilder();
        int indexOfSpace = 0;
        String result = "";
        for (int i = 0; i < names.length; i++) {
            indexOfSpace = names[i].indexOf(" ");
            sb.append(names[i].subSequence(0, indexOfSpace));
            sb.append(", ");
            result = sb.toString().trim();
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
