package pl.edu.mimuw;

public abstract class Person{
    /**
     * number is derived from first letters of firstName and lastName as well as index indicating order of creation
     * firstName/lastName are non-empty
     */
    protected final String number;
    protected final String firstName;
    protected final String lastName;

    public Person(String number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public abstract String toString();

    public abstract Person createCopy();

    /**
     * empty methods for use in USOS class when iterating over <String, Person> map
     */
    public void addPublication(Publication publication){};

    public void addProgram(Program program){};
}