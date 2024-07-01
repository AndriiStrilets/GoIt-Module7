package src.main.java.ua.goit.Module7;

import java.util.Arrays;

public class TestClass {
    private final String firstName;
    private final String lastName;
    private final String[] lessons;

    public TestClass(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.lessons = new String[]{"Math", "Physics", "Biology"};
    }

    private TestClass setFirstName(String firstName) {
        return new TestClass(firstName, lastName);
    }
    public TestClass setLastName(String lastName) {
        return new TestClass(firstName, lastName);
    }
    public String getFirstName(){
        return firstName;
    }
//    public String getLastName() {
//        return lastName;
//    }
    public String[] getLessons() {
        return Arrays.copyOf(lessons, lessons.length);
    }
}
