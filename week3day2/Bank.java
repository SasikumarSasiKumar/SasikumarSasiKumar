package week.week3day2;

import week3.day2.CIBIL;
import week3.day2.PNB;
import week3.day2.SBI;

public class Bank extends SBI implements CIBIL,PNB  {

	public void MaximumLoanAmount() {
		System.out.println("Maximum loan amount : 10000");
		
	}

	public void CreditScore() {
		System.out.println("CreditScore : 55");
		
		
	}

	public void minimumBalance() {
		System.out.println("minimum balance: 1000");
		
	}

	public void cibilScore() {
		System.out.println("cibil Score : 10");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("bank balance : 500");
		
	}

	@Override
	public void maximumloanaAmount() {
		System.out.println("maximum loan Amont: 5000");
	}
public static void main(String[] args) {
	
		
		Bank BBB = new Bank();
		BBB.bankBalance();
		BBB.maximumloanaAmount();
		BBB.minimumBalance();
		BBB.itlone();
		BBB.cibilScore();
		BBB.CreditScore();
		
		
	}
}
	


