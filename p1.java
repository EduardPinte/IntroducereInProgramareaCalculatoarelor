package p1;

public class p1 {
    public static void main(String[] args) {
        int n = 7;
        String str;

        if (n < 1 || n > 10) {  
            str = "Invalida";
        } else if (n > 5) {  
            str = "Admis";
        } else {  
            str = "Respins";
        }

        System.out.println(str);  // Afisam rezultatul
    }
}
