package pl.edu.mimuw;

public class Publication {
  private final String title;
  public Publication(String title){
    this.title = title;
  }
  public String getTitle(){
    return this.title;
  }
  public String toString(){
    //var sb = new StringBuilder ();
    //sb.append("The publication is called ");
    //sb.append(this.getTitle());
    //return sb.toString();
    return this.title +"\n";
  }
}
