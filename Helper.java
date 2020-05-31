public class Helper{
  private int id;
  private String name;
  private String branch;
  
  // values can be initialized either by a constructor or setter methods
  // For demo we initialize values using setter methods only
  // When using constructor(s) setter methods can be eliminated

/*
  public Helper (int id, String name, String branch) {
    this.id = id;
    this.name = name;
    this.branch = branch;
  }
*/

  public void setId (int id) {
    this.id = id;
  }
  
  public int getId () {
    return id;
  }

  public void setName (String name) {
    this.name = name;
  }
  
  public String getName () {
    return name;
  }
  
  public void setBranch (String branch) {
    this.branch = branch;
  }
  
  public String getBranch () {
    return branch;
  }
}