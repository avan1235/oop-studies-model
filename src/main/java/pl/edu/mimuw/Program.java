package pl.edu.mimuw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
  private final String name;
  private final String id;
  private final Set<Subject> prerequisites; // To take this program a student must pass these subjects first
  private final Set<Subject> subjects; // Subjects that make up this program
  private double totalECTS = 0;

  public Program(String name, String area, Set<Subject> prerequisites, Set<Subject> subjects) {
    this.name = name;
    this.id = Faculty.assignProgramID(area);
    this.prerequisites = prerequisites;
    this.subjects = subjects;
    for (var subject : subjects)
      totalECTS += subject.getSubjectECTS();
    Faculty.registerProgram(this);
  }

  public Program(String name, String area) {
    this(name, area, new HashSet<>(), new HashSet<>());
  }

  public void addSubjects(Subject[] subjects) {
    this.subjects.addAll(Arrays.asList(subjects));
    for (var subject : subjects)
      totalECTS += subject.getSubjectECTS();
  }

  public void addSubject(Subject subject) {
    this.subjects.add(subject);
    totalECTS += subject.getSubjectECTS();
  }

  public String getName() {
    return name;
  }

  public void addRequirements(Subject[] requirements) {
    this.prerequisites.addAll(Arrays.asList(requirements));
  }

  public Set<Subject> getPrerequisites() {
    return Set.copyOf(this.prerequisites);
  }

  public Set<Subject> getSubjects() {
    return Set.copyOf(this.subjects);
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append(this.name).append(", ").append(this.id).append("\n-- Subjects --\n");
    for (var subject : this.subjects)
      res.append(" * ").append(subject.toString()).append("\n");
    res.append("-- Prerequisites --\n");
    for (var requirement : this.prerequisites)
      res.append(" * ").append(requirement.toString()).append("\n");
    res.append("Total ECTS: ").append(totalECTS);
    return res.toString();
  }
}
