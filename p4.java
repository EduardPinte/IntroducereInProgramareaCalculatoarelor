package p1;

public class p4 {

	public static void main(String[] args) {
		int v1=44;
		int v2=23;
		int v3=10;
		int min1=0;
		int min2=0;
		if(v1<v2) {
			min1=v1;
		}else {min1=v2;}
		if(min1<v3) {
			min2=min1;System.out.println(min2);
		}else {min2=v3;System.out.println(min2);}
	}

}
