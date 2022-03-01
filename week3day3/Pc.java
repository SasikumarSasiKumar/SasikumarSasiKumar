package week.week3day3;

public class Pc extends LapTop {
	public void getSystemInfo() {
		System.out.println(" MAC");
	}
	public static void main(String[] args) {
		Pc info1 = new Pc();
		info1.getSystemInfo();
	}

}
