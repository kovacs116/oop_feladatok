
/*
Az 5_1-es projektben elk�sz�tett Alkalmazott oszt�lyt
eg�sz�tse ki kiv�telkezel�ssel!
Az Alkalmazott kora 18-70 k�z�tt, fizet�se 138000 felett
�rv�nyes (garant�lt b�rminimum)!
A konstruktor dobjon IllegalArgumentException-t
(RuntimeException), ha �rv�nytelen adatokkal ker�l megh�v�sra!
Kezelje le a kiv�telt!
 */
public class Alkalmazott {

	private String nev;
	private int kor;
	private long fizetes;
	
	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int kor, long fizetes) {
		if (kor < 18 || kor > 70 || fizetes <= 138000) {
			throw new IllegalArgumentException("Az alkalmazott kora 18 es 70 kozott legyen, es a fizetes 138000 Ft felett legyen!");
		}
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		this(nev, kor, 10000 * kor);
		this.nev = nev;
	}
	
	public int hanyEvVanHatraANyugdijig() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev 
				+ ", kor=" + kor 
				+ ", fizetes=" + fizetes 
				+ ", evek szama nyugdijig="
				+ hanyEvVanHatraANyugdijig() + "]";
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}	
	
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static Alkalmazott tobbEveVanHatraNyugdijig(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.hanyEvVanHatraANyugdijig() >
			masodikAlkalmazott.hanyEvVanHatraANyugdijig()) {
			return elsoAlkalmazott;
		} else {
			return masodikAlkalmazott;
		}
	}
	
}
