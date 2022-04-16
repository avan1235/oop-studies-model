package pl.edu.mimuw.usos;

import java.util.HashMap;
import java.util.Map;

public class SystemUsos {

  private final Map<Integer, Person> people;

  public SystemUsos(Map<Integer, Person> people) {
    this.people = new HashMap<>(people);
  }

  public SystemUsos() {
    this(new HashMap<>());
  }

  /**
   * Adds a person to the system.
   */
  public void addPerson(Person person) {
    people.put(person.getIndex(), person);
  }

  /**
   * In this instance we want the map to be mutable, to let us increment the year.
   *
   * @return a map of people in the system, indexed by their id.
   */
  public Map<Integer, Person> getPeople() {
    return people;
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder("People in the system (ordered by their id):\n");

    // As key is an Integer, we don't need to worry about converting it to a String. It will be done automatically.
    for (var key : people.keySet()) {
      sb.append("\t").append(key).append(". ").append(people.get(key).toString());
    }

    return sb.toString();
  }
}
