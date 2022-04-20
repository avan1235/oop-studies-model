package pl.edu.mimuw;

public class PersonFactory {
  private static long najwiekszyIndeks;

  public PersonFactory() {
    PersonFactory.najwiekszyIndeks=0;
  }

  protected static long getNewIndeks() {
    PersonFactory.najwiekszyIndeks++;
    return PersonFactory.najwiekszyIndeks;
  }

}
