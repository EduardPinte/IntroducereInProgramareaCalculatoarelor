package proiecte;

public class Sertar {

	private int latime;
    private int lungime;
    private int inaltime;

    public Sertar(int latime, int lungime, int inaltime) {
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public String toString() {
        return "Sertar " + latime + " " + lungime + " " + inaltime;
    }
}
