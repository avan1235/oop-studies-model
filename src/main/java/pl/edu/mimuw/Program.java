package pl.edu.mimuw;

public class Program {
  final private String programName;
  final private int duration;

  public Program(String programName, int duration) {
    this.programName = programName;
    this.duration = duration;
  }

  public Program(Program other) {
    this(other.programName, other.duration);
  }

  public String toString() {
    return "Program " + this.programName + ", duration: " + this.duration + " years";
  }

  public String getName() {
    return this.programName;
  }

  public int getDuration() {
    return this.duration;
  }
}
