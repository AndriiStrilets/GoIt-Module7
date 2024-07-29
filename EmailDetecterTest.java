package src.main.java.ua.goit.Module7;

public class EmailDetecterTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));

    }
}

class EmailDetector {
    public boolean isPresent(String text) {
        char at = '@';
        int index = text.indexOf(at);
        if(text.contains("@") && text.charAt(index - 1) != ' ' && text.charAt(index - 2) != ' ' && text.charAt(index + 1) != ' ' && text.charAt(index + 2) != ' '){
        return true;

        }
        return false;
    }
}