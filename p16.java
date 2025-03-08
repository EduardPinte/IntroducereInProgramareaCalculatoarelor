package p1;

public class p16 {

	public static void main(String[] args) {
        int n = 1234;
        
        while (n != 0) {
            int cifra = n % 10;  
            System.out.println(cifra); 
            n = n / 10; 
        }
    }

}
