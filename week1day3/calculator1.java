package week.week1day3;

public class calculator1 {

	public void MultipleTwoNumber() {
		float a=22.22f;
		float b=11.22f;
		float c=a*b;
		System.out.println(c);
	}
	public void divideTwonumber() {
		double a=50.0;
		double b=20.0;
		double d=a%b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		calculator1 cal= new calculator1();
		cal.MultipleTwoNumber();
		cal.divideTwonumber();
		
	}

	}


