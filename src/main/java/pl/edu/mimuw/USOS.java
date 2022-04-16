package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.Objects;

public class USOS {
  private ArrayList<Person> people;

  public USOS() {
  }

  public USOS(ArrayList<Person> people) {
    this.people = people;
  }

  public void addPerson(Person person) {
    this.people.add(person);
  }

  public Person getPerson(int index) {
    return this.people.get(index);
  }

  public boolean personInUSOS(String pesel) {
    for (var person : people) {
      if (Objects.equals(person.pesel, pesel)) return true;
    }
    return false;
  }

  public void removePerson(String pesel) {
    people.removeIf(person -> Objects.equals(pesel, person.pesel));
    System.out.println("Student with PESEL " + pesel + " removed.");
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append("\nUSOS:\n");
    for (var person : people) {
      sb.append(person).append("\nNext person: ");
    }
    sb.append("End of list.");
    return sb.toString();
  }
}
