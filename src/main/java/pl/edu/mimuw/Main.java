package pl.edu.mimuw;

import pl.edu.mimuw.USOS.*;

public class Main {

  public static void main(String[] args) {
    Student FF = new Student("Florian", "Ficek", 21, "Wadowice", "Informatyka", 1, 'Z');

    USOS usos = new USOS();

    usos.addStudent(FF);

    System.out.println("##############################");
    System.out.println(usos.getStudent(400000));

    Academic PU = new Academic("Pawel", "Urzyczyn", "prof. dr hab.", "");
    Academic PS = new Academic("Pawel", "Strzelecki", "prof. dr hab.", "Warszawa");
    Academic MK = new Academic("Marcin", "Kubica", "dr", "");
    Academic PB = new Academic("Pawel", "Bechler", "dr", "");

    usos.addAcademic(PU);
    usos.addAcademic(PS);
    usos.addAcademic(MK);
    usos.addAcademic(PB);

    Publication first = new Publication("Kanapki z chlebem", PS);
    Publication second = new Publication("Papiez Polak", PS);

    usos.getAcademic(2).addPublication(first);
    usos.getAcademic(2).addPublication(second);

    Subject PM = new Subject("Podstawy Matematyki", 3, PU);
    Subject AMI = new Subject("Analiza Matematyczna I", 3, PS);
    Subject WPF = new Subject("Wstep do Programowania", 4, MK);
    Subject GAL = new Subject("Geometria z Algebra Liniowa", 3, PB);

    usos.getStudent(400000).addSubject(PM);
    usos.getStudent(400000).addSubject(AMI);
    usos.getStudent(400000).addSubject(WPF);
    usos.getStudent(400000).addSubject(GAL);

    usos.getStudent(400000).changeSemestr();

    System.out.println("##############################");

    System.out.println(usos.getStudent(400000));

    Academic JB = new Academic("Janusz", "Jablonowski", "dr", "");
    Academic MP = new Academic("Marcin", "Peczarski", "dr hab.", "");
    Academic AM = new Academic("Adam", "Malinowski", "dr", "");

    Subject PO = new Subject("Programowanie Obiektowe", JB);
    Subject AMII = new Subject("Analiza Matematyczna II", PS);
    Subject IPP = new Subject("Indywidualny Projekt Programistyczny", MP);
    Subject MD = new Subject("Matematyka Dyskretna", AM);

    PO.setGrade(3);
    AMII.setGrade(4);
    IPP.setGrade(3);
    MD.setGrade(2);

    usos.getStudent(400000).addSubject(PO);
    usos.getStudent(400000).addSubject(AMII);
    usos.getStudent(400000).addSubject(IPP);
    usos.getStudent(400000).addSubject(MD);

    usos.getStudent(400000).increaseAge();
    usos.getStudent(400000).increaseYear();

    System.out.println("##############################");

    System.out.println(usos.getStudent(400000));
  }
}

