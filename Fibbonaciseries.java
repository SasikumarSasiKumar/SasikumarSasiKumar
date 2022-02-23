package week1.day4;

public class Fibbonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=1;
		System.out.println(first);
		int second=2;
		System.out.println(second);
	
	for(int i=3;i<=10;i++) {
		int sum=first+second;
		System.out.println(sum);
		first=second;
	    second=sum;
	}

	}

}
