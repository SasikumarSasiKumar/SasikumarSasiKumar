package week.week1day4;

public class MissingElemeny {

	public static void main(String[] args) {
       int[] a= {1,5,6,8,9,7,2};
       int[]b= {1,2,3,4,5,6,7,8,9};
       for(int i=0;i<a.length;i++) {
    	   
    	   for(int j=0;j<b.length;j++) {
    		   if(a[i]==b[j]) {
    			   System.out.println(b[j]);
    			   
    		   }
    	   }
       
	}
	
	}
}