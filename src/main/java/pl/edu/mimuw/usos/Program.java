package pl.edu.mimuw.usos;

public class Program {
  protected final String name;

  public Program(String name) {
    this.name = name;
  }

  public Program(Program program) {
    this.name = program.getName();
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return this.name + " program";
  }
}
