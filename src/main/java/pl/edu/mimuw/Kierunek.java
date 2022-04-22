package pl.edu.mimuw;

import java.util.ArrayList;

public class Kierunek {
  protected final String nazwa;
  protected final int dlugosc;
  protected ArrayList<ArrayList<Kurs>> przedmioty;

  public Kierunek(String nazwa, int dlugosc, ArrayList<ArrayList<Kurs>> przedmioty) {
    this.przedmioty=przedmioty;
    this.dlugosc=dlugosc;
    this.nazwa=nazwa;
  }

  public String getNazwa() {
    return this.nazwa;
  }

  public int getDlugosc() {
    return this.dlugosc;
  }

  public void pierwszak(Osoba kowalski) {
    Student studenciak = new Student(kowalski, PersonFactory.getNewIndeks(), this.przedmioty.get(0), this, 1);
    for (int i=0; i<this.przedmioty.get(0).size(); i++) {
      this.przedmioty.get(0).get(i).zapiszStudenta(studenciak);
    }
  }
  public Student pierwszakVS(Osoba kowalski) {
    Student studenciak = new Student(kowalski, PersonFactory.getNewIndeks(), this.przedmioty.get(0), this, 1);
    for (int i=0; i<this.przedmioty.get(0).size(); i++) {
      this.przedmioty.get(0).get(i).zapiszStudenta(studenciak);
    }
    return studenciak;
  }


}
