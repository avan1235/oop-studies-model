package pl.edu.mimuw;

import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Osoba Jan = new Osoba("Jan", "Szot", 21);
    Osoba Jerzy = new Osoba("Jerzy", "Urban", 69);
    Osoba Karol = new Osoba("Karol", "Wojtyua", 2137);
    Osoba Marek = new Osoba("Marek", "Grechuta", 55);
    Kurs Analiza = new Kurs("O obrotach ciau niebieskich", "Analiza", new ArrayList<Pracownik>());
    Kurs Geometria = new Kurs("Wokół obrotów", "Geometria", new ArrayList<Pracownik>());
    Kurs SocjologiaPlci = new Kurs("Szklany sufit i Sufrażystki XXI wieku", "Socjologia Płci", new ArrayList<Pracownik>());
    Kurs Badminton = new Kurs("Krótka piłka, znaczy lotka", "Badminton", new ArrayList<Pracownik>());
    Kurs Wpi = new Kurs("Ciekawe czy zdasz", "Wstęp do programowania - podejście imperatywne", new ArrayList<Pracownik>());
    Kurs Pmat = new Kurs("zbiory i ich krewni", "Podstawy matematyki", new ArrayList<Pracownik>());
    ArrayList<Kurs> pierwszyRok = new ArrayList<Kurs>();
    pierwszyRok.add(Analiza);
    pierwszyRok.add(Geometria);
    ArrayList<Kurs> drugiRok = new ArrayList<Kurs>();
    drugiRok.add(SocjologiaPlci);
    drugiRok.add(Badminton);
    ArrayList<Kurs> trzeciRok = new ArrayList<Kurs>();
    trzeciRok.add(Wpi);
    trzeciRok.add(Pmat);
    ArrayList<ArrayList<Kurs>> kursyMeblarskie = new ArrayList<ArrayList<Kurs>>();
    kursyMeblarskie.add(pierwszyRok);
    kursyMeblarskie.add(drugiRok);
    kursyMeblarskie.add(trzeciRok);
    Kierunek meblarstwo = new Kierunek("Meblarstwo", 3, kursyMeblarskie);
    Student Janek = Jan.zaciagnijSieVS(meblarstwo);
    Pracownik PanJerzy = Jerzy.zostanPracownikiemUczelni(new ArrayList<String>());
    ArrayList<String> DzielaKarola = new ArrayList<String>();
    DzielaKarola.add("Barka");
    ArrayList<String> DzielaMarka = new ArrayList<String>();
    DzielaKarola.add("Jakieś piosenki chyba");
    Pracownik PanKarol = Karol.zostanPracownikiemUczelni(DzielaKarola);
    Pracownik PanMarek = Marek.zostanPracownikiemUczelni(DzielaMarka);
    PanJerzy.prowadz(Pmat);
    PanJerzy.prowadz(Analiza);
    PanKarol.prowadz(Badminton);
    PanKarol.prowadz(Geometria);
    PanMarek.prowadz(SocjologiaPlci);
    PanMarek.prowadz(Wpi);
    System.out.println(Analiza.info());
    Janek.zdajRok();
    System.out.println(Badminton.info());
    Janek.zdajRok();
    System.out.println(Wpi.info());


    // TODO: play with your students and staff members and show how
    //  they describe themselves
  }
}
