package pl.edu.mimuw.usos;

import java.util.HashMap;
import java.util.Map;

public class SystemUsos {

  private final Map<String, Person> people;

  public SystemUsos(Map<String, Person> people) {
    this.people = new HashMap<>(people);
  }

  public SystemUsos() {
    this(new HashMap<>());
  }

  /**
   * Adds a person to the system.
   */
  public void addPerson(Person person) {
    people.put(String.valueOf(person.getIndex()), person);
  }

  /**
   * In this instance we want the map to be mutable, to let us increment the year.
   *
   * @return a map of people in the system, indexed by their id.
   */
  public Map<String, Person> getPeople() {
    return people;
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder("People in the system (ordered by their id):\n");

    for (var key : people.keySet()) {
      sb.append("\t").append(key).append(". ").append(people.get(key).toString());
    }

    return sb.toString();
  }
}
