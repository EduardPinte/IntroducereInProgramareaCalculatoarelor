package p1;

public class p9 {
    public static void main(String[] args) {
        int n = 3;
        boolean estePrim = true;

        if (n < 2) { 
            estePrim = false;
        } else {
            for (int i = 2; i * i <= n; i++) { 
                if (n % i == 0) {
                    estePrim = false;
                    break; 
                }
            }
        }

        if (estePrim) {
            System.out.println(n + " este un număr prim.");
        } else {
            System.out.println(n + " NU este un număr prim.");
        }
    }
}
