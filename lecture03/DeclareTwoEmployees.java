package lecture03;

public class DeclareTwoEmployees{
    
   public static void main(String[] args){
      Employee clerk = new Employee();
      Employee driver = new Employee();
      
      clerk.setEmpNum(345);
      clerk.setEmpFirstName("Boban");
      driver.setEmpNum(567);
      
      System.out.println("The clerk's number is " +
        clerk.getEmpNum() + " and the driver's number is " +
        driver.getEmpNum());
      System.out.println(9); 
      Employee manager = new Employee("John", "Smith"); 
      System.out.println("Name of new manager is: " +
        manager.getEmpFirstName() + " " +
        manager.getEmpLastName());
      
   }
}
