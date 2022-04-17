package pl.edu.mimuw.usosweb;

public class Program {
    private String field;
    private Integer year;
    public Program(String field, Integer year) {
        this.field = field;
        this.year = year;
    }
    public Integer getYear() {
        return this.year;
    }
    public String getField() {
        return this.field;
    }
    public String toString() {
        var s = new StringBuilder();
        s.append("Field: ").append(this.field).append("\n");
        s.append("Year: ").append(this.year).append("\n");
        return s.toString();
    }
}