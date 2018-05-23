/*
A Feln�tt oszt�ly kiterjeszt�sek�nt
hozzon l�tre ugyanabban a csomagban
egy Alkalmazott oszt�lyt!
Adattagja: fizet�s (eg�sz), nyugd�jkorhat�r (oszt�lyszint�, eg�sz: �rt�ke 65)
Konstruktora: n�gy param�terben kapott �rt�kkel inicializ�lja az adattagokat
Met�dusai:
- Adja vissza a fizet�st!
- Defini�lja fel�l az adatokat String-ben �sszef�z� �r�kl�tt met�dust!
 */
package szemelyek;

public class Alkalmazott extends Felnott {
	private static int nyugdijkorhatar = 65;
	private long fizetes;

	public Alkalmazott(String nev, int kor, String munkahely, long fizetes) {
		super(nev, kor, munkahely);
		this.fizetes = fizetes;
	}

	public long getFizetes() {
		return fizetes;
	}

	@Override
	public String toString() {
		return "Alkalmazott [" 
				+ super.toString()
				+ ", fizetes: " 
				+ getFizetes() 
				+ " Ft, evek szama nyugdijig: "
				+ (nyugdijkorhatar - getKor())
				+ "]";
	}

	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}	

}
