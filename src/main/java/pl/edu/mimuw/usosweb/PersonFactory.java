package pl.edu.mimuw.usosweb;
import java.util.HashMap;
public class PersonFactory {
    private static int id = 0;
    private static HashMap<Integer, Person> peopleMap = new HashMap<Integer, Person>();
    public static Student createStudent(String firstName, String lastName) {
        var s = new Student(firstName, lastName, id);
        peopleMap.put(id, s);
        id++;
        return s;
    }
    public static StaffMember creatStaffMember(String firstName, String lastName) {
        var s = new StaffMember(firstName, lastName, id);
        peopleMap.put(id, s);
        id++;
        return s;
    }
    public static Person getPersonById(Integer id) {
        return peopleMap.get(id);
    }
    public static HashMap<Integer, Person> getPeopleMap() {
        return peopleMap;
    }
    public static String peopleToString() {
        var s = new StringBuilder();
        s.append("People:\n");
        var set = peopleMap.entrySet();
        for(HashMap.Entry<Integer, Person> x: set) {
            s.append("Id:").append(x.getKey() + " ");
            s.append("Name: ").append(x.getValue().getFirstName() + " ").append(x.getValue().getLastName()).append("\n");
        }
        return s.toString();
    }

}