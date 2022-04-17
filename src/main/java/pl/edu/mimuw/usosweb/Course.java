package pl.edu.mimuw.usosweb;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private Set<Student> attenders;
    private StaffMember coordinator;
    private String name;
    public Course(String name, StaffMember coordinator) {
        this.name = name;
        this.coordinator = coordinator;
        this.attenders = new HashSet<Student>();
    }
    public Set<Student> getAttenders() {
        return attenders;
    }
    public StaffMember getCoordinator() {
        return coordinator;
    }
    public String getName() {
        return this.name;
    }
    public void addAttender(Student newAttender) {
        this.attenders.add(newAttender);
        newAttender.addCourseToList(this);
    }   
    public void removeAttender(Student attender) {
        this.attenders.remove(attender);
        attender.removeCourseFromList(this);
    }
    public String toString() {
        var s = new StringBuilder();
        s.append("Course:\n").append(this.name).append("\n");
        s.append("Coordinator: ").append(this.coordinator.getFirstName()+" ").append(this.coordinator.getLastName());
        s.append("\n Attenders: \n");
        for(Student c: this.attenders) {
            s.append(c.getFirstName()+" ").append(c.getLastName()).append("\n");
        }
        return s.toString();
    }
}