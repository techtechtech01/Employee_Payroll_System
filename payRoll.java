import java.util.ArrayList;
public class payRoll{
  private ArrayList<Employee> employeeList;
  payRoll(){
    employeeList=new ArrayList<Employee>();
  }
  public void addEmployee(Employee employee){
    employeeList.add(employee);
  }
  public void removeEmployee(int id){
    Employee employeeToRemove=null;
    for(Employee employee:employeeList){
      if (employee.getId()==id){
        employeeToRemove=employee;
        break;
      }
      
    }
    
   if(employeeToRemove!=null){ employeeList.remove(employeeToRemove);}
  }
  public void displayEmployee(){
    for(int i=0;i<employeeList.size();i++){
      System.out.println(employeeList);
      System.out.println();
      break;
    }
  }
}
