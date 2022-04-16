package pl.edu.mimuw;

public class Subject {
  private String name, USOScode;
  private double ECTS;
  private int lectureHours, classHours, labHours;
  private Educator coordinator;

  public Subject() {
  }

  public Subject(String name, String USOScode) {
    this.name = name;
    this.USOScode = USOScode;
  }

  public Subject(String name, String USOScode, double ECTS, int lectureHours, int classHours, int labHours) {
    this(name, USOScode);
    this.lectureHours = lectureHours;
    this.classHours = classHours;
    this.labHours = labHours;
  }

  public Subject(String name, String USOScode, double ECTS, int lectureHours, int classHours, int labHours, Educator coordinator) {
    this(name, USOScode, ECTS, lectureHours, classHours, labHours);
    this.coordinator = coordinator;
  }

  public Educator getCoordinator() {
    return coordinator;
  }

  public String getName() {
    return name;
  }

  public String getUSOScode() {
    return USOScode;
  }

  public double getECTS() {
    return ECTS;
  }

  public int getLectureHours() {
    return lectureHours;
  }

  public int getClassHours() {
    return classHours;
  }

  public int getLabHours() {
    return labHours;
  }

  public void setCoordinator(Educator coordinator) {
    this.coordinator = coordinator;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUSOScode(String USOScode) {
    this.USOScode = USOScode;
  }

  public void setECTS(double ECTS) {
    this.ECTS = ECTS;
  }

  public void setLectureHours(int lectureHours) {
    this.lectureHours = lectureHours;
  }

  public void setClassHours(int classHours) {
    this.classHours = classHours;
  }

  public void setLabHours(int labHours) {
    this.labHours = labHours;
  }

  public String toString(boolean detailed) {
    var sb = new StringBuilder();
    sb.append(this.getName())
      .append(", USOS code: ")
      .append(this.getUSOScode());
    if (detailed) {
      sb.append(", ECTS count: ")
        .append(this.getECTS())
        .append(", Lecture hours: ")
        .append((this.getLectureHours()))
        .append(", Class hours: ")
        .append(this.getClassHours())
        .append(", Lab hours: ")
        .append(this.getLabHours())
        .append(", Coordinated by: ")
        .append(this.getCoordinator().toString());
    }
    sb.append(";");
    return sb.toString();
  }
}
