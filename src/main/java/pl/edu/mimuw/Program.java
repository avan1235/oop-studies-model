package pl.edu.mimuw;

public class Program {
    private final String faculty;
    private final String major;
    
    public Program(String faculty, String major) {
        this.faculty = faculty;
        this.major = major;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return major + " at " + faculty;
    }
}
