public class partTimeEmployee extends Employee{
  private double ratePerHour;
  private int hoursWorked;
  public double getRatePerHour(){
    return ratePerHour;
  }
  public int getHoursWorked(){
    return hoursWorked;
  }

  public double calculateSalary(){
    return ratePerHour*hoursWorked;
  }
  partTimeEmployee(String name, int id, String department, double ratePerHour, int hoursWorked){
    super(name, id, department);
    this.ratePerHour=ratePerHour;
    this.hoursWorked=hoursWorked;
  }
}
