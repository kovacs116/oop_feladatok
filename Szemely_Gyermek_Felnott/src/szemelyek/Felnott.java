/*
K�sz�tsen ugyanebben a csomagban Gyermek �s Feln�tt oszt�lyokat
a Szem�ly oszt�ly lesz�rmaztat�s�val!
Adattagjaik: munkahely (a Feln�tt oszt�lyban, String)
Konstruktoraik: h�rom param�terben kapott �rt�kkel
inicializ�lj�k az adattagokat
Met�dusaik:
- Mindk�t oszt�lyban defini�lja fel�l az adatokat String-ben �sszef�z� �r�kl�tt met�dust!
- Adja vissza a Feln�tt munkahely�t!

 */
package szemelyek;

public class Felnott extends Szemely {
	private String munkahely;

	public Felnott(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
	}

	@Override
	public String toString() {
		return "Felnott [" 
				+ super.toString()
				+ ", munkahely: " 				
				+ getMunkahely()
				+ "]";
	}
	
	public String getMunkahely() {
		return munkahely;
	}	
}
