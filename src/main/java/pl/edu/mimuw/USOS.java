package pl.edu.mimuw;

import java.util.HashMap;
import java.util.Map;

public class USOS {
  private final HashMap<Integer, Person> users;
  USOS(){
    users = new HashMap<>();
  }

  public Person getUser(int index) throws NoSuchFieldException {
    if(!users.containsKey(index)) throw new NoSuchFieldException("User not found");
    return users.get(index);
  }

  public Map<Integer, Person> getUsers(){
    return new HashMap<>(users);
  }

  public void addUser(Person p) {
    users.put(p.index, p);
  }

  @Override
  public String toString(){
    StringBuilder sb =  new StringBuilder("USOS system, containing users:");
    for(var p : users.values()) {
      sb.append('\n');
      sb.append(p);
    }
    return sb.toString();
  }
}
