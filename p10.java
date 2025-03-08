package p1;

public class p10 {

		public static void main(String[] args) {
	        int numar = 1001;
	        while (!estePrim(numar)) {
	            numar++; 
	        }
	        System.out.println("Cel mai mic număr prim mai mare ca 1000 este: " + numar);
	    }

	    public static boolean estePrim(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) return false; 
	        }
	        return true;
	    }
	
	}


