package oopS;

                   // BY REFERENCE 
public class Employee {
	
	String EmployeeName;  //variables
	int EmployeeId;
	String EmployeeCity;
	
	
	}
	
	


class Office{
	
	 public static void main(String[] args) {
		 Employee e=new Employee();  //new object
		 
		 e.EmployeeId=121;
		 e.EmployeeName="Deepak";
		 e.EmployeeCity="Bihar";
		 
		 System.out.println(e.EmployeeName+" "+e.EmployeeId+" "+e.EmployeeCity);
		 
		
		
	}

}
