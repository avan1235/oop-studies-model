package pl.edu.mimuw;

public class PersonFactory {
    private static int index=0;

    /**
     * @return new Student without any programs
     */
    public static Student genNewStudent(String firstName, String lastName){
        index++;
        return new Student(firstName.substring(0, 1)+lastName.substring(0, 1)+Integer.toString(index), firstName, lastName);
    }

    /**
     * @return new Staff without any publications
     */
    public static Staff genNewStaff(String firstName, String lastName, String position){
        index++;
        return new Staff(firstName.substring(0, 1)+lastName.substring(0, 1)+Integer.toString(index), firstName, lastName, position);
    }
}
