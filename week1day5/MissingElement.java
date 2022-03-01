package week.week1day5;

import java.lang.reflect.Array;

public class MissingElement{
	public static void main(String[] args) {
		String name=new String ("sasi");
		String rev= new String ("");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
			//9rev =rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("pall");
		}
		else {
			System.out.println("not");
		}
	}
}