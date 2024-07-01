package src.main.java.ua.goit.Module7;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String firstName = "Andrii";
        byte[] bytes = firstName.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        String parseName = new String(bytes);
        System.out.println("parseName = " + parseName);
        String hello = "Hello";
        byte[] helloArray = hello.getBytes();
        System.out.println(Arrays.toString(helloArray));

    }
}
