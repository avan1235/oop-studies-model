package pl.edu.mimuw;
import java.util.HashMap;
import java.util.Map;

public class USOS {
    private Map<String, Person> users;

    USOS(){
        users = new HashMap<String, Person>();
    }

    public Person findUser(String number){
        var per = users.get(number);
        if(per!=null){
            return per.createCopy();
        }
        else{
            System.out.println("Wrong identification number: " + number);
            return null;
        }
    }

    public String addStudent(String firstName, String lastName){
        if((firstName == "") || (lastName == "")){
            System.out.println("Names must be non-empty");
            return null;
        }
        var st = PersonFactory.genNewStudent(firstName, lastName);
        users.put(st.getNumber(), st);
        return st.getNumber();
    }

    public String addStaff(String firstName, String lastName, String position){
        if((firstName == "") || (lastName == "")){
            System.out.println("Names must be non-empty");
            return null;
        }
        var st = PersonFactory.genNewStaff(firstName, lastName, position);
        users.put(st.getNumber(), st);
        return st.getNumber();
    }

    public void addPublicationToStaff(String number, Publication publication){
        var st = users.get(number);
        if(st == null){
            System.out.println("Wrong identification number: " + number);
        }
        else{
            st.addPublication(publication);
        }
    }

    public void addProgramToStudent(String number, Program program){
        var st = users.get(number);
        if(st == null){
            System.out.println("Wrong identification number: " + number);
        }
        else{
            st.addProgram(program);
        }
    }

    public void addProgramToEveryStudent(Program program){
        users.forEach((u,v) -> this.addProgramToStudent(u,program));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Users:\n");
        users.forEach((u,v) -> sb.append(v.toString()).append("\n"));
        return sb.toString();
    }
}
