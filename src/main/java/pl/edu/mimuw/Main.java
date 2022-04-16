package pl.edu.mimuw;

import static pl.edu.mimuw.PersonFactory.createStudent;
import static pl.edu.mimuw.PersonFactory.createStaffMember;

public class Main {

  public static void main(String[] args) {

    var PO = new Program("MIM", "PO", 1);
    var IPP = new Program("MIM", "IPP", 1);
    var physics = new Program("FUW", "physics", 1);
    var ogun = new Program("WPIA", "humanity against AI", 1);
    var swimming = new Program("WF", "swimming", 1);


    var USOS = new USHP("USOS");
    var studentJan = createStudent("Jan", "Kowalski", USOS);
    studentJan.addProgram(PO);
    studentJan.addProgram(swimming);
    studentJan.incrementYear("PO");
    studentJan.incrementYear("WPI");

    var studentKarol = createStudent("Karol", "Perła", USOS);
    studentKarol.addProgram(ogun);
    studentKarol.addProgram(swimming);
    studentKarol.incrementYear("humanity against AI");

    var professor1 = createStaffMember("Andrzej", "Nowak", USOS);
    var cialaNiebieskie = new Publication("O obrotach cial niebieskich");
    professor1.addPublication(cialaNiebieskie);
    var usageOfPmat = new Publication("Is PMAT really needed in life?");
    professor1.addPublication(usageOfPmat);

    var professor2 = createStaffMember("Cristiano", "Ronaldo", USOS);
    var best = new Publication("Whatever!");
    professor2.addPublication(best);

    var professor3 = createStaffMember("Marcin", "Najman", USOS);
    var physical = new Publication("Black holes");
    professor3.addPublication(physical);

    System.out.println(USOS.toString());
  }
}
