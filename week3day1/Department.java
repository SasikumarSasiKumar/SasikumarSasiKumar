package week.week3day1;

public class Department extends College {
	
	public void departmentName(String departmentName) {
		System.out.println("the department as:"+" "+departmentName);
	}
	public static void main(String[] args) {
		Department dep= new Department();
		dep.departmentName("EEE");
	}

}
