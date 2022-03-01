package week.week4day2;

public class Employee {
	
	String employeeName;
	static String employeecompany;
	int employeeId;
	double employeeSalery;
	boolean isActive;
	
	Employee()
	{
		System.out.println("default Constructor");
	}
     Employee(String employeeName,String employeecompany,int employeeId, double employeeSalery){
    	this();
    	this.employeeName=employeeName;
    	this.employeecompany=employeecompany;
    	this.employeeId=employeeId;
    	this.employeeSalery=employeeSalery;
    	
    	
     }
    
     public static void main(String[] args) {
		Employee emp=new Employee("sasi","test leaf",410, 500000d );
		//System.out.println(emp.employeeName);
	//	System.out.println(emp.employeecompany);
	//	System.out.println(emp.employeeId);
		//System.out.println(emp.employeeSalery);
		
		Employee emp1=new Employee("mani","tcs",420, 500000);
		System.out.println(emp1.employeeName);
		System.out.println(emp1.employeecompany);
		System.out.println(emp1.employeeId);
		System.out.println(emp1.employeeSalery);
		System.out.println(emp.employeeName);
		System.out.println(emp.employeecompany);
		System.out.println(emp.employeeId);
		System.out.println(emp.employeeSalery);
      }
     
      }

	