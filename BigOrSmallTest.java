package src.main.java.ua.goit.Module7;

public class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {
    public String calculate(String text) {
        int big = 0;
        int small = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                big = big + 1;
            } else if (Character.isLowerCase(text.charAt(i))) {
                small = small + 1;
            }
        }
        if (small > big) {
            return "Small";
        } else if (small < big) {
            return "Big";
        } else {
            return "Same";
        }
    }
}
