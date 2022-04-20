package pl.edu.mimuw;

import java.util.ArrayList;

public class Student extends Osoba {
  protected long indeks;
  protected ArrayList<Kurs> kursy;
  protected Kierunek kierunek;
  protected int rok;

  public Student(Osoba kowalski, long indeks, ArrayList<Kurs> kursy, Kierunek kierunek, int rok) {
    super(kowalski.imie, kowalski.nazwisko, kowalski.wiek);
    this.indeks=indeks;
    this.kursy=kursy;
    this.rok=rok;
    this.kierunek=kierunek;
  }



  public int getRok() {
    return this.rok;
  }



  @Override
  public String przedstaw() {
    return (this.imie + " " + this.nazwisko + " " + this.rok + " rok " + this.kierunek.getNazwa());
  }

  public void zapiszNaKurs(Kurs analiza) {
    analiza.zapiszStudenta(this);
    if (!this.kursy.contains(analiza)) {
      this.kursy.add(analiza);
    }
  }

  public void wypiszZKursu(Kurs analiza) {
    analiza.wypisz(this);
    this.kursy.remove(analiza);
  }

  public void zdajRok() {
    for (int i=0; i<this.kursy.size(); i++) {
      this.kursy.get(i).wypisz(this);
    }
    this.kursy.clear();
    if (this.kierunek.getDlugosc()==this.getRok()) {
      this.rok=0;
      this.kursy=new ArrayList<Kurs>();
    } else {
      this.rok = this.getRok() + 1;
      for (int i=0; i<this.kierunek.przedmioty.get(this.rok-1).size(); i++)
      this.zapiszNaKurs(this.kierunek.przedmioty.get(this.rok-1).get(i));
    }
  }

  public void ocenProwadzacego(float ocena, Pracownik oceniany) {
    oceniany.zintegrujOcene(ocena);
  }
}
