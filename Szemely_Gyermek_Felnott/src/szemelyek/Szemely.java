/*
K�sz�tsen saj�t csomagban Szem�ly oszt�lyt (pl. szemelyek.Szemely)!
Adattagjai: n�v, kor
Konstruktora: k�t param�terben kapott �rt�kkel inicializ�lja az adattagokat!
Met�dusai:
- getter met�dusok az adattagok lek�rdez�s�re,
- a Szem�ly adatait String-ben �sszef�z� �s ezzel visszat�r� met�dus,
- adjon vissza igazat, ha a param�terben megadott szem�ly �letkora kisebb.
 */
package szemelyek;

public class Szemely {
	private String nev;
	private int kor;	
	
	public Szemely(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}

	@Override
	public String toString() {
		return "Nev: " + getNev() + ", kor: " + getKor();
	}
	
	public boolean eletkorNagyobbMint(Szemely masik_szemely) {
		return getKor() >= masik_szemely.getKor();
	}
		
}
