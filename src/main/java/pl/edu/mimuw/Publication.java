package pl.edu.mimuw;

public class Publication {

  private final String title;
  private final String topic;

  public Publication(String title, String topic) {
    this.title = title;
    this.topic = topic;
  }

  @Override
  public String toString() {
    return title + " in: " + topic;
  }
  
}
