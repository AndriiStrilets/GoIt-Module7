package src.main.java.ua.goit.Module7;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 3, 2, 89, 54, 4};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
