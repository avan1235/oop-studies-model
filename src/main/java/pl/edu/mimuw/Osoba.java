package pl.edu.mimuw;

import java.util.ArrayList;

public class Osoba {
  protected String imie;
  protected String nazwisko;
  protected int wiek;

  public Osoba(String imie, String nazwisko, int wiek) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
  }

  public void urodziny() {
    this.wiek++;
  }
  public String przedstaw() {
    return (this.imie + " " + this.nazwisko);
  }

  public void zaciagnnijSie(Kierunek meblarstwo) {
    meblarstwo.pierwszak(this);
  }
  public Student zaciagnijSieVS(Kierunek meblarstwo) {
    return meblarstwo.pierwszakVS(this);
  }

  public Pracownik zostanPracownikiemUczelni(ArrayList<String> publikacje) {
    return new Pracownik(this, new ArrayList<>(), 0, 0, publikacje);
  }
}
