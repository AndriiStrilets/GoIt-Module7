package src.main.java.ua.goit.Module7;

public class ATM {
    public int countBanknotes(int sum) {

        int result = 0;
        int numberToAdd = 0;
        int counter = 0;
        int[] numbers = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
        int i = numbers.length;

        while (i > 0) {
            i--;
            while (sum - numbers[i] > -1) {

                numberToAdd = numbers[i];
                result += numberToAdd;
                counter++;
                sum = sum - numberToAdd;
            }
        }

        return counter;
    }
}

class Banknote {
    public static void main(String[] args) {
        ATM bank = new ATM();
        System.out.println(bank.countBanknotes(8));
    }
}



