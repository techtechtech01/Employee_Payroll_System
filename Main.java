public class Main{

  public static void main(String[] args){
    payRoll payroll=new payRoll();
    partTimeEmployee partTimeEmployee1=new partTimeEmployee("John1", 1, "Manager", 10, 20);
   // partTimeEmployee partTimeEmployee2=new partTimeEmployee("Jane", 12, "Sales", 10, 20);
    fullTimeEmployee fullTimeEmployee1=new fullTimeEmployee("John2", 2, "Sales", 1000);
    //fullTimeEmployee fullTimeEmployee2=new fullTimeEmployee("Jane", 22, "Sales", 1000);
    System.out.println("===Adding Employee===");
    System.out.println();
      payroll.addEmployee(partTimeEmployee1);
    //payroll.addEmployee(partTimeEmployee2);
    payroll.addEmployee(fullTimeEmployee1);
    //payroll.addEmployee(fullTimeEmployee2);
    System.out.println("===Displaying Employee===");
    System.out.println();
    payroll.displayEmployee();
    System.out.println("===Removingng Employee===");
    payroll.removeEmployee(1);
   System.out.println("===Displaying Employee after Removing===");
    payroll.displayEmployee();
  }
}
