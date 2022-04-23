package pl.edu.mimuw.usos.Faculty;

import java.util.ArrayList;
import java.util.List;

public class Program {
  private final String name;
  private final Integer leaderIndex;
  private final List<Integer> employees;
  private final List<Integer> participants;

  public Program(String name, Integer leaderIndex) {
    this.name = name;
    this.leaderIndex = leaderIndex;
    employees = new ArrayList<Integer>();
    participants = new ArrayList<Integer>();
  }

  public String getName() {
    return this.name;
  }

  public Integer getLeaderIndex() {
    return this.leaderIndex;
  }

  public ArrayList<Integer> getParticipantsIds() {
    return new ArrayList<Integer>(this.participants);
  }

  public ArrayList<Integer> getEmployeesIds() {
    return new ArrayList<Integer>(this.employees);
  }

  public void addParticipant(Integer participantId) {
    participants.add(participantId);
  }

  public void addEmployees(Integer employeesId) {
    employees.add(employeesId);
  }

  @Override
  public String toString() {
    return "program name: " + this.name;
  }
}
