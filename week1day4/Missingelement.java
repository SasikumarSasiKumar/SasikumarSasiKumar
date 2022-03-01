package week.week1day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,7,6,8};
		//missing element 5
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if(i+1!=array[i])
			{
				System.out.println(i+1);
				break;
			}
			
		}
		//find missing element
		

	}

}
	

	


