package pl.edu.mimuw;

import java.util.ArrayList;

public class Kurs {
  protected String opis;
  protected String nazwa;
  protected ArrayList<Student> zapisani;
  protected ArrayList<Pracownik> prowadzacy;

  public Kurs(String opis, String nazwa, ArrayList<Pracownik> prowadzacy) {
    this.nazwa=nazwa;
    this.opis=opis;
    this.zapisani=new ArrayList<Student>();
    this.prowadzacy=prowadzacy;
  }


  public String info() {
    String wynik = "";
    wynik+=this.nazwa+ " - " + this.getOpis() + "\nStudenci:\n";
    for (int i=0; i<this.zapisani.size(); i++) {
      wynik+=this.zapisani.get(i).przedstaw() + "\n";
    }
    wynik+="Prowadzący:\n";
    for (int i=0; i<this.prowadzacy.size(); i++) {
      wynik+=this.prowadzacy.get(i).przedstaw() + "\n";
    }
    return wynik;
  }

  public String getOpis() {
    return this.opis.substring(0);
  }

  public void zapiszStudenta(Student kowalski) {
    if (this.zapisani.contains(kowalski)) {
      System.out.println("Proszę sobie nie śmieszkować, przecież już jesteś na tym kursie");
    } else {
      this.zapisani.add(kowalski);
    }
  }

  public void wypisz(Student kowalski) {
    if (this.zapisani.contains(kowalski)) {
      this.zapisani.remove(kowalski);
    } else {
      System.out.println("Proszę sobie nie śmieszkować, przecież cb nie ma na tym kursie");
    }
  }
}
