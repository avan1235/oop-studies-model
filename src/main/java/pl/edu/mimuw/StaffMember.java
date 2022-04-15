package pl.edu.mimuw;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StaffMember extends Person {
  private final Set<Publication> publications;
  private final Set<Subject> subjectsTaught;

  public StaffMember(String name, String id, Subject[] subjectsTaught) {
    super(name, id);
    this.publications = new HashSet<>();
    this.subjectsTaught = new HashSet<>();

    if (subjectsTaught != null)
      this.subjectsTaught.addAll(List.of(subjectsTaught));
  }

  public StaffMember(String name, String id, Subject subjectTaught) {
    this(name, id, new Subject[]{subjectTaught});
  }

  public Publication startNewPaper(String title, String publicationAbstract) {
    Publication publication = new Publication(title, publicationAbstract, new StaffMember[]{this});
    this.publications.add(publication);

    return publication;
  }

  public Publication startNewPaper(String title) {
    Publication publication = new Publication(title, new StaffMember[]{this});
    this.authorPaper(publication);

    return publication;
  }

  public void teachNewSubject(Subject subject) {
    this.subjectsTaught.add(subject);
  }

  public void collaborate(Publication publication, StaffMember collaborator) {
    publication.addAuthors(collaborator);
    collaborator.authorPaper(publication);
  }

  public void authorPaper(Publication publication) {
    this.publications.add(publication);
  }

  @Override
  public String getOccupation() {
    StringBuilder res = new StringBuilder("a researcher");
    if (!subjectsTaught.isEmpty()) res.append(" and tutor");
    return res.toString();
  }

  @Override
  public String getStatus() {
    StringBuilder res = new StringBuilder();

    if (!subjectsTaught.isEmpty()) {
      res.append("teach following subjects:");
      for (var subject : subjectsTaught)
        res.append("\n * ").append(subject);
    } else
      res.append("do research");

    if (!publications.isEmpty()) {
      res.append("\nI authored/co-authored following papers:");
      for (var paper : publications)
        res.append("\n * ").append(paper);
    }
    return res.toString();
  }
}
