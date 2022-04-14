package pl.edu.mimuw;

public class Main {
  public static void main(String[] args) {
    Faculty mim = new Faculty();
    Subject pmat = new Subject("PM", "Podstawy Matematyki", "Raj dla duszy", 5.0);
    Subject md = new Subject("MD", "Matematyka Dyskretna", "Przedmiot", 7.5);
    Subject po = new Subject("PO", "Programowanie Obiektowe", "Przedmiot", 7);
    Program inf12 = new Program("Informatyka 2 semestr 1 roku", "INF");

    inf12.addSubjects(new Subject[]{md, po});
    inf12.addRequirements(new Subject[]{pmat});

    Person marian = PersonFactory.makePerson("Marian Helikopter");
    System.out.println(marian);

    StaffMember krzysztof = PersonFactory.makeStaffMember("Krzysztof Piekarnik");
    Publication piekarniki = krzysztof.startNewPaper("On Role of Ovens in Multiple-Phase Quantum Interferometry Studies");

    StaffMember miroslaw = PersonFactory.makeStaffMember("Mirosław Dąb", new Subject[]{md});

    krzysztof.collaborate(piekarniki, miroslaw);

    StaffMember krystian = PersonFactory.makeStaffMember("Krystian Bijekcja", new Subject[]{pmat});
    krystian.startNewPaper("On Beauty of Foundations of Mathematics", "Here we introduce PMAT.");

    Student franek = PersonFactory.makeStudent("Franciszek Leniwy");
    franek.applyForProgram(inf12);

    Student turbofranek = PersonFactory.makeStudent("Franciszek Ambitny");
    turbofranek.applyForProgram(inf12);

    Program inf11 = new Program("Informatyka 1 semestr 1 roku", "INF");
    inf11.addSubject(pmat);

    turbofranek.applyForProgram(inf11);
    turbofranek.finishProgram();
    turbofranek.applyForProgram(inf12);
    turbofranek.finishProgram();

    System.out.println(mim);

    StaffMember jakub = PersonFactory.makeStaffMember("Jakub Zapomniany");

    System.out.println(Faculty.getPersonInfoById("STAFF4"));
  }
}
