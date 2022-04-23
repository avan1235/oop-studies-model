package pl.edu.mimuw;

public class Main {

  public static void main(String[] args) {
    StaffMember staff = PersonFactory.createStaffMember("A", "B", 14, 10, 1976);

    Program matI = new Program("Faculty of MIM", "Matematyka", 1);
    Course PMAT = new Course("Introduction to Mathematics", 3.23, true, matI);
    Publication logic = new Publication(staff, "Logic in Mathematics");

    staff.addCourse(PMAT);
    staff.addPublication(logic);
    System.out.print(staff);

    Program psychII = new Program("Faculty of Psychology", "Psychology", 2);

    Student student = PersonFactory.createStudent("Jan", "Nowak", 24, 11, 2001);

    student.addProgram(matI);
    student.addProgram(psychII);
    System.out.print(student);


    Course combi = new Course("Introduction to Combinatorics", 3.14, true, matI);
    staff.removeCourse(PMAT);
    staff.addCourse(combi);

    System.out.print(staff);
  }
}
