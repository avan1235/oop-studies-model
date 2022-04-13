package pl.edu.mimuw;

public abstract class Person{
    private int number;
    private String firstName;
    private String lastName;

    public Person(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}