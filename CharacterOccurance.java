package Assignement1;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="welcome to chennai";
		int count=0;
		for(int i=0;i<Name.length();i++) {
		if(Name.charAt(i)=='e') {
			count++;
		}
		}
		System.out.println(count);	
		
		}

	}


