package week1.day1;

public class mobile {

	public void message() {
		System.out.println("hi how are you");

	}
	public void shareDocument() {
		System.out.println("send pdf");
	}
	public void call() {
		System.out.println("call to ashok");
	}
	public static void main(String[] args) {
		mobile myMobile = new mobile();
		myMobile.message();
		myMobile.shareDocument();
		myMobile.call();
	}
	}


