package proiecte;

public class Patrat {
	private int latura;

	
	public Patrat(int latura) {
		this.latura = latura;
	}
	
	public int CalculareArie(int latura) {
		return this.latura * this.latura;
	}

	public static void main(String[] args) {
		Patrat p= new Patrat(10);
		System.out.println("aria patratului este: "+ p.CalculareArie(10));
	}

}
