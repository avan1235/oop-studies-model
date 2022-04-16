package pl.edu.mimuw;

public class Other extends Employee{
  private String jobType;
  public Other(){}
  public Other(String name, String pesel, String EmployeeID, String jobType)
  {
    super(name,pesel,EmployeeID);
    this.jobType=jobType;
  }

  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  //add quit method?

  //toString
}
