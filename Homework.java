package Selfstudy;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= new String("sasi");
		String rev= new String ("");
		//char[] charArray= name.toCharArray();
		
	for(int i=name.length()-1;i<=0;i--) {
		
		rev=rev+name.charAt(i);
		System.out.println(name.charAt(i));
		
	}
	}

}
