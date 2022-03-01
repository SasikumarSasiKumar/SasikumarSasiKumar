package week.week1day3;

public class calculator3 {

	public void multipleTwoNumber(float a, float b) {
		float c=a*b;
		System.out.println(c);
	}
	public void divideTwoNumber(float a, float b) {
		float d=a%b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		calculator3 cal=new calculator3();
		cal.multipleTwoNumber(11.10f,10.10f);
		cal.divideTwoNumber(11.11f,22.22f);
	}

}
