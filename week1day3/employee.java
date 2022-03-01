package week.week1day3;

public class employee {

public void employeName (String empName) {
	System.out.println("emp Name"+" "+empName);
}
public void employId(int  empId ) {
	System.out.println("emp ID"+" "+ empId);
}
public void employAddress(String empAddress) {
	System.out.println("emp Address"+" "+ empAddress );
}
public void employSalary(float empSalary) {
	System.out.println("emp Salery"+" "+ empSalary );
}
public void employMobile(long empNumber) {
	System.out.println("emp Number"+" "+ empNumber);
}

public static void main(String[] args) {
	employee emp= new employee();
	emp. employeName ("sasi kumar");
	emp.employId (1803210);
	emp. employAddress("chennai");
    emp.employSalary(250.000f);
	emp. employMobile(9443322650l);


	}


}
