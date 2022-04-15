package pl.edu.mimuw.usos;

import java.util.ArrayList;

public class Faculty {
  private final String name;
  private final String address;
  private final ArrayList<Program> availablePrograms;

  public Faculty(String name, String address) {
    this.name = name;
    this.address = address;
    this.availablePrograms = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void newProgram(Program program) {
    this.availablePrograms.add(program);
  }

  public ArrayList<Program> getAvailablePrograms() {
    return new ArrayList<>(availablePrograms);
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append(this.name).append(" faculty.\n");
    sb.append("There are ").append(this.availablePrograms.size()).append(" programs available.\n");
    for (var program: this.availablePrograms) {
      sb.append(program).append("\n");
    }
    return sb.toString();
  }
}
