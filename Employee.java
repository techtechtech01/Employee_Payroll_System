abstract public class Employee{
  private String name;
  private int id;
  private String department;
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public String getDepartment(){
    return department;
  }
  abstract public double calculateSalary();
  Employee(String name, int id, String department){
    this.name=name;
    this.id=id;
    this.department=department;
  }
  @Override
  public String toString(){
    return "Employee[name="+name+", id="+id+", department="+department+", salary="+calculateSalary()+"]";
  }
}
