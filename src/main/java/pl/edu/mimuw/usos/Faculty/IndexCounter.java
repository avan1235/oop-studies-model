package pl.edu.mimuw.usos.Faculty;

public class IndexCounter {
  private static Integer indexCounter = 0;

  public Integer increment(){
    indexCounter++;
    return indexCounter-1;
  }
}
