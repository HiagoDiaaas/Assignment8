package prob1;

import java.util.Arrays;

class Person {
    private String lastName;
    private String firstName;
    private int age;

    // Constructor
    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public String getLast() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
    }
}

