package pl.edu.mimuw.usosweb;
import java.util.Set;
import java.util.HashSet;
public class StaffMember extends Person {
    private Set<Publication> publications;
    private Set<Course> coordinatedCourses;
    public StaffMember(String firstName, String lastName, Integer id) {
        super(firstName, lastName, id);
        publications = new HashSet<Publication>();
        coordinatedCourses = new HashSet<Course>();
    }
    public Set<Course> getCoordinatedCourses() {
        return this.coordinatedCourses;
    }
    public Set<Publication> getPublications() {
        return this.publications;
    }
    public void addPublication(Publication p) {
        this.publications.add(p);
    }
    public void addPublication(String title) {
        this.publications.add(new Publication(this, title));
    }
    @Override
    public String toString() {
        var s = new StringBuilder();
        s.append("Student:\n");
        s.append("First name: ").append(this.firstName).append("\n");
        s.append("Last name: ").append(this.lastName).append("\n");
        s.append("Coordinated Courses: \n");
        for(Course c: this.coordinatedCourses) {
            s.append(c.getName());
        }
        s.append("Publications:\n ");
        for(Publication c: this.publications) {
            s.append(c.toString());
        }
        s.append("\n");
        return s.toString();
    }
}