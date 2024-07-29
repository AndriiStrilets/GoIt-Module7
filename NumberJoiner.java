package src.main.java.ua.goit.Module7;

public class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);

        }
        return sb.toString();
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        System.out.println(new NumberJoiner().join(new int[]{10, 20, 30}));
    }
}