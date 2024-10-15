public class fullTimeEmployee extends Employee{
  public double totalSalary;

  public double calculateSalary(){
    return totalSalary;
  }
  fullTimeEmployee(String name, int id, String department, double totalSalary){
    super(name, id, department);
    this.totalSalary=totalSalary;
  }
}
