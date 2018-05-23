/*
K�sz�tsen egy Alkalmazott oszt�lyt n�v, kor �s fizet�s adatokkal!
- Legyen egy oszt�lyszint� adattagja a nyugd�jkorhat�r t�rol�s�ra,
�rt�ke kezdetben legyen 65!
- Legyen 2 konstruktora!
Az egyik a param�terk�nt kapott n�v, kor �s fizet�s �rt�kekkel
inicializ�lja az adattagokat.
A m�siknak csak a nevet �s a kort kell megadni, a fizet�s 10000*kor.
- Legyen met�dusa, amely visszadja h�ny �ve van m�g nyugd�jig!
- Legyen met�dusa, amely String-be �sszef�zve adja vissza az Alkalmazott adatait,
hozz�f�zve a nyugd�jig h�trelev� �veinek sz�m�t is!
- Legyen met�dusa, amely a param�terk�nt kapott �rt�kre �ll�tja be a nyugd�jkorhat�rt!
- Legyen met�dusa, amely a param�terk�nt kapott k�t Alkalmazott k�z�l azt adja vissza,
amelyiknek t�bb �ve van m�g h�tra a nyugd�jig!
 */
public class Alkalmazott {

	private String nev;
	private int kor;
	private long fizetes;
	
	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000 * kor;
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
