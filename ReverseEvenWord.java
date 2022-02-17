package ClassRoom;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="i am in chennai";
		String[]name1 =name.split(" ");
		
		for(int i=0;i<name1.length;i++) 
		{
			if(i % 2 == 1)
			{
				for(int j=name1[i].length()-1;j>=0;j--)
				{
					System.out.print(name1[i].charAt(j));
					
				}
				System.out.print(" ");
			}
				else
				{
					System.out.print(name1[i]+" ");
				}
			}
		}

	}

