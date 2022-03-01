package week.week1day3;

public class calculator2 {

	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber(int a,int b) {
		int d=a-b;
		System.out.println(d);
	}
	public void mulTwoNumber(int a,int b) {
	   int e=a*b;
	   System.out.println(e);
	}
	   
	public static void main(String[] args) {
		calculator2 calc=new calculator2();
		calc.addTwoNumber(10,20);
		calc.subTwoNumber(20,30);
		calc.mulTwoNumber(10,10);
		
	}

	}

