package src.main.java.ua.goit.Module7;

public class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));

    }
}

class WaterCounter {
    public double count(String text) {
        double textLength = text.length();
        double spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        return spaceCount / textLength;
    }
}