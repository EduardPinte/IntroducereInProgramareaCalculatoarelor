package proiecte;

public class Carte {
	private String numeCarte;
	private int nrpag;
	private Carte carte1nrpag;
	private Carte carte2nrpag;
	
	public Carte (String numeCarte, int nrpag, Carte carte1nrpag, Carte carte2nrpag ) {
		this.numeCarte = numeCarte;
		this.nrpag = nrpag;
		this.carte1nrpag = carte1nrpag;
		this.carte2nrpag = carte2nrpag;
	}
	
	public String comparaPagini(Carte altaCarte) {
	    if (this.nrpag > altaCarte.nrpag) {
	        return this.numeCarte + " are mai multe pagini decât " + altaCarte.numeCarte;
	    } else if (this.nrpag < altaCarte.nrpag) {
	        return this.numeCarte + " are mai puține pagini decât " + altaCarte.numeCarte;
	    } else {
	        return this.numeCarte + " și " + altaCarte.numeCarte + " au același număr de pagini.";
	    }
	}
	
	
	
	public static void main(String[] args) {
	    Carte carte1 = new Carte("Luca", 350, null ,null);
	    Carte carte2 = new Carte("Matei", 500, null,null);

	    System.out.println(carte1.comparaPagini(carte2));
	}

}
