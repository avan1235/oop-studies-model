package pl.edu.mimuw.usosweb;

import java.util.HashSet;
import java.util.Set;
public class Student extends Person {
    private Program currentProgram;
    private Set<Course> attendedCourses;

    public Student(String firstName, String lastName, Integer id, Program program) {
        super(firstName, lastName, id);
        this.attendedCourses = new HashSet<Course>();
        this.currentProgram = program;
    }
    public Student(String firstName, String lastName, Integer id) {
        super(firstName, lastName, id);
        this.attendedCourses = new HashSet<Course>();
    }
    //Adds Course to list in Student
    public void addCourseToList(Course c) {
        attendedCourses.add(c);
    }
    //Adds Course to list in Student and Student to list of attenders in Course
    public void assignCourse(Course c) {
        c.addAttender(this);
    }
    //Removes Course from list in Student
    public void removeCourseFromList(Course c) {
        attendedCourses.remove(c);
    }
    //Removes Course from list in Student and Student from list in Course
    public void resignFromCourse(Course c) {
        c.removeAttender(this);
    }
    public void assignProgram(Program p) {
        this.currentProgram = p;
    }
    public Set<Course> getAttendedCourses() {
        return this.attendedCourses;
    }
    public Program getProgram() {
        return this.currentProgram;
    }
    @Override
    public String toString() {
        var s = new StringBuilder();
        s.append("Student:\n");
        s.append("First name: ").append(this.firstName).append("\n");
        s.append("Last name: ").append(this.lastName).append("\n");
        if(this.currentProgram != null)
        s.append("Current program: ").append("\n").append(this.currentProgram.toString());
        s.append("Attended Courses: ");
        for(Course c: this.attendedCourses) {
            s.append(c.getName());
        }

        return s.toString();
    }
}