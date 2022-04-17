package pl.edu.mimuw.usosweb;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected Integer id;
    public Person(String firstName, String lastName, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String toString() {
        var s = new StringBuilder();
        s.append("First name: ").append(this.firstName).append("\n");
        s.append("Last name: ").append(this.lastName).append("\n");
        return s.toString();
    }
}