package pl.edu.mimuw;

public abstract class Person {
  protected final  String name;
  protected final String last_name;
  protected final String birthNumber;
  protected final int index;

  protected Person(String name, String last_name, String birthNumber, int index) {
    this.name = name;
    this.last_name = last_name;
    this.birthNumber = birthNumber;
    this.index = index;
  }

  @Override
  public String toString(){
    return "Im " + name + ' ' + last_name + ", my birth number is " + birthNumber + " and my index is " + index;
  }
}
