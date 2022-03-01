package week.week1day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
	}
		}
			if(count==2)
			{
				System.out.println("given number is prime");
			}
			else
			{
				System.out.println("given num is not prime");
	}

	}
}

	
