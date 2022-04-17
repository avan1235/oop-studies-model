package pl.edu.mimuw.usosweb;

public class Publication {  
    private final String title;
    private final Person author;
    public Publication(Person author, String title) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }
    public Person getAuthor() {
        return this.author;
    }
    public String toString() {
        var s = new StringBuilder();
        s.append("Publication:\n");
        s.append("Title: ").append(this.title).append("\n");
        s.append("Author: ").append(this.author.firstName + " ").append(this.author.lastName).append("\n");
        return s.toString();
    }
}