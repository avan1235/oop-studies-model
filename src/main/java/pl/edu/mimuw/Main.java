package pl.edu.mimuw;

import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    var system = new UniversitySystem();

    var moravyecki = new Employee("Mateusz Morawiecki");
    system.registerPerson(moravyecki);
    assert (system.getPersonByName("Mateusz Morawiecki") == moravyecki);

    var papyezh = new Student("Karol Wojtyła");
    system.registerPerson(papyezh);
    assert (system.getPersonByName("Karol Wojtyła") == papyezh);

    var ekonomya = new Course("Ekonomya", moravyecki, new HashSet<Student>());
    ekonomya.addStudent(papyezh);

    var podcastMoravyetskyego = new Publication("Oficjalny Podcast Mateusza Morawieckiego", moravyecki);


    System.out.print(papyezh);
  }
}
