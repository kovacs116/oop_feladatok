/*
K�sz�tsen ugyanebben a csomagban Gyermek �s Feln�tt oszt�lyokat
a Szem�ly oszt�ly lesz�rmaztat�s�val!
Adattagjaik: iskola (a Gyermek oszt�lyban, String)
Konstruktoraik: h�rom param�terben kapott �rt�kkel
inicializ�lj�k az adattagokat
Met�dusaik:
- Mindk�t oszt�lyban defini�lja fel�l az adatokat String-ben �sszef�z� �r�kl�tt met�dust!
- Adja vissza a Gyermek iskol�j�t!
 */
package szemelyek;

public class Gyermek extends Szemely {
	private String iskola;

	public Gyermek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
	}	
	
	@Override
	public String toString() {
		return "Gyermek [" 
				+ super.toString()
				+ ", iskola: " 				
				+ getIskola() 
				+ "]";
	}

	public String getIskola() {
		return iskola;
	}	
}
