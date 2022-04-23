package pl.edu.mimuw;

public class Course {
  private final String title;

  private final double ectsamount;

  private final boolean isobligatory;

  private Program program;

  public Course(String title, double ectsamount, boolean isobligatory, Program program) {
    this.title = title;
    this.ectsamount = ectsamount;
    this.isobligatory = isobligatory;
    this.program = program;
  }

  public void changeProgram(Program newprogram) {
    this.program = newprogram;
  }

  @Override

  public String toString() {
    final var sb = new StringBuilder();
    sb.append(title).append(", worth ").append(ectsamount)
      .append(" ECTS, ");
    if (isobligatory) {
      sb.append("is obligatory in program ");
    } else {
      sb.append("isn't obligatory in program ");
    }
    sb.append(program.toString());

    return sb.toString();
  }

}
