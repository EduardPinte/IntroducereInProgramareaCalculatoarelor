package proiecte;

public class main {

	public static void main(String[] args) {
		Sertar sertar1= new Sertar(55,42,10);
		Sertar sertar2= new Sertar(66,52,20);
		
		Birou birou=new Birou(90,175,70,sertar1, sertar2);
		System.out.println(birou);
		}

}
