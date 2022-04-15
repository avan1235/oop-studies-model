package pl.edu.mimuw.usos;

public class ActiveProgram extends Program{
  private int year;

  public ActiveProgram(String name, int year) {
    super(name);
    this.year = year;
  }

  public ActiveProgram(Program program, int year) {
    super(program);
    this.year = year;
  }

  public ActiveProgram(String name) {
    super(name);
    this.year = 1;
  }

  public ActiveProgram(Program program) {
    super(program);
    this.year = 1;
  }

  public int getYear() {
    return year;
  }

  public void incrementYear() {
    this.year++;
  }

  @Override
  public String toString() {
    var suffix = "";
    if (this.year == 1) {
      suffix = "st";
    }
    else if (this.year == 2) {
      suffix = "nd";
    }
    else if (this.year == 3) {
      suffix = "rd";
    }
    else {
      suffix = "th";
    }
    return this.year + suffix + " year of " + super.toString();
  }
}
