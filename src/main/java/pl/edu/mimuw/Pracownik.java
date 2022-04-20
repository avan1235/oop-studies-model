package pl.edu.mimuw;

import java.util.ArrayList;

public class Pracownik extends Osoba{
  protected ArrayList<Kurs> prowadzone;
  protected float ocenaNaFandomie;
  protected int iloscOcen;
  protected ArrayList<String> publikacje;
  protected final long indeks;
  public Pracownik(Osoba kowalski, ArrayList<Kurs> prowadzone, float ocenaNaFandomie, int iloscOcen, ArrayList<String> publikacje) {
    super(kowalski.imie, kowalski.nazwisko, kowalski.wiek);
    this.ocenaNaFandomie=ocenaNaFandomie;
    this.prowadzone=prowadzone;
    this.publikacje=publikacje;
    this.indeks=PersonFactory.getNewIndeks();
  }

  @Override
  public String przedstaw() {
    return (this.imie + " " + this.nazwisko + " " + this.ocenaNaFandomie);
  }


  public void prowadz(Kurs analiza) {
    analiza.prowadzacy.add(this);
    this.prowadzone.add(analiza);
  }

  public void zintegrujOcene(float ocena) {
    if (this.iloscOcen==0) {
      this.iloscOcen=1;
      this.ocenaNaFandomie=ocena;
    } else {
      float pomocnik;
      pomocnik = this.ocenaNaFandomie * this.iloscOcen + ocena;
      this.iloscOcen += 1;
      pomocnik = pomocnik / this.iloscOcen;
      this.ocenaNaFandomie = pomocnik;
    }
  }
}
