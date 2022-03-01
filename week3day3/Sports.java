package week.week3day3;


public class Sports {
	
	public void acheiver(String name, int medalcount) {
		System.out.println("player name"+" "+name);
		System.out.println("medalCount"+" "+medalcount);
	}
	public void acheiver(String country,String Sportsname,int rank ) {
		System.out.println("country"+" "+country);
		System.out.println("sports name"+" "+Sportsname);
		System.out.println("sports rank"+" "+rank);
	}
	public void acheiver(float weight, int height, long contactNo ) {
		System.out.println("weigt"+" "+weight);
		System.out.println("height"+" "+height);
		System.out.println("contactno"+" "+contactNo);
	}
	public void acheiver(String tournamentname, long prizemoney) {
		System.out.println("tournement name"+" "+tournamentname);
		System.out.println("prizemoney"+" "+prizemoney);
	}
	public static void main(String[] args) {
		Sports sports=new Sports();
		sports.acheiver("SASI KUMAR",2);
		sports.acheiver("INDIA", "KABADI", 02);
		sports.acheiver(56.2f, 162, 9443322650l);
		sports.acheiver("WinByOne", 15000l);
		
	}
	
}
