package week.week1day4;

public class Char {

 String str1="TestLeaf";
 String str2="TestLeaf";
 char name='a';
 public static void main(String[] args) {
	String str3=new String("TestLeaf");
	String str4=new String("testLeaf");
    int length =str3.length();
	System.out.println(length);
	char[] charArray= str3. toCharArray(); 
	System.out.println(charArray);
	System.out.println(str3.charAt(0));
	System.out.println(str3.contains("TestLeaf"));
	System.out.println(str3.indexOf("z"));
	System.out.println(str3.equalsIgnoreCase(str4));
	System.out.println(str3.equals(str4));
	System.out.println(str3.toLowerCase());
	System.out.println(str4.toUpperCase());
	System.out.println("The Output:"+str3);
	System.out.println("UpperCase"+str4);
	
	

		

	}

}
