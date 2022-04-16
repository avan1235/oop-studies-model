package pl.edu.mimuw;

import java.util.HashMap;
import java.util.Map;

public class UniversitySystem {
  Map<String, Person> personByName;

  public UniversitySystem() {
    this.personByName = new HashMap<String, Person>();
  }

  public void registerPerson(Person person) {
    personByName.put(person.getName(), person);
  }

  public Person getPersonByName(String name) {
    return personByName.get(name);
  }
}
