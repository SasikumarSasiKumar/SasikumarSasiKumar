package week3.day1;

class Student extends Department {

	public void getStudentInfo (String name) {
		System.out.println("The student name:"+" "+name);
	}
		
	public void getstudendInfo(int id) {
		System.out.println("student id :"+" "+id);
	}
	public void  getstudendInfo(String Branch) {
		System.out.println("The Student Branch"+" "+Branch);
	}
	public static void main(String[] args) {
		Student kkk =new Student();
		kkk.collegeName("CIT");
		kkk.CollegeCode(12655);
		kkk.collegeRank("firest");
		kkk.getstudendInfo(1803210);
		kkk.getstudendInfo("EEE");
		kkk.getstudendInfo("EEE CIT");
		
	  }
		
		

	}

