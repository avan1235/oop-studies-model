package pl.edu.mimuw.usos;

import java.util.HashMap;
import java.util.Map;

public class SystemUsos {

  private final Map<String, Person> people;

  public SystemUsos(Map<String, Person> people) {
    this.people = people;
  }

  public SystemUsos() {
    this(new HashMap<>());
  }

  public void addPerson(Person person) {
    people.put(String.valueOf(person.getIndex()), person);
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder("People in the system:\n");

    for (var key : people.keySet()) {
      sb.append("\t").append(Integer.parseInt(key) + 1).append(". ").append(people.get(key).toString());
    }

    return sb.toString();
  }
}
