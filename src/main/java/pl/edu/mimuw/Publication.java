package pl.edu.mimuw;

public class Publication {
  private final String title;
  private final String subject;

  public Publication(String title, String subject) {
    this.title = title;
    this.subject = subject;
  }

  public String getSubject() {
    return subject;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append(this.getTitle()).append(" subject: ").append(this.getSubject());
    return sb.toString();
  }
}
