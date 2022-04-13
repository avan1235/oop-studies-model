package pl.edu.mimuw;

import java.util.Date;

public class Program {
  public final Date[] lessons;
  public final Employee lecturer;
  public final int ETCS;

  public Program(Date[] lessons, Employee lecturer, int etcs) {
    this.lessons = lessons;
    this.lecturer = lecturer;
    ETCS = etcs;
  }
}
