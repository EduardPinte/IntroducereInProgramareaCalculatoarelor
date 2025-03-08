package p1;

public class p18 {

	public static void main(String[] args) {
		int n=856438;
		int ind=99999;
		int cifra=0;
		
		 while (n != 0) {
	            cifra=n%10; 
	            if(cifra <ind) {
	            	ind=cifra;
	            
	            }
	        	
           	 n = n / 10;
	       
	            
	        }
		 System.out.println(ind);
	}

}
