package pl.edu.mimuw.usos;

public class Publication {

  private final String title;
  private int yearsOld;

  public Publication(String title, int yearsOld) {
    this.title = title;
    this.yearsOld = yearsOld;
  }

  public Publication(String title) {
    this(title, 0);
  }

  public Publication(Publication other) {
    this(other.title, other.yearsOld);
  }

  public void incrementYear() {
    this.yearsOld++;
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder("\t\t");

    sb.append(title).append(" (").append(yearsOld).append(" year");
    if (yearsOld != 1) {
      sb.append("s");
    }
    sb.append(" old)");

    return sb.toString();
  }
}
