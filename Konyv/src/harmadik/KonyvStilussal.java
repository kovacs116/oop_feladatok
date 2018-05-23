/*Tag 4Oroklodes

A kor�bbi saj�t csomagban defini�lt K�nyv oszt�ly
lesz�rmazottjak�nt k�sz�tsen egy m�sik csomagban
K�nyvSt�lussal oszt�lyt!
Adattagjai: st�lus (sz�veg)
Konstruktora: minden adat�t param�terben kapott adatokkal inicializ�lja!
Met�dusai:
- Adja vissza a st�lust!
- Defini�lja fel�l az �soszt�lybeli String-et visszaad� met�dust �gy,
hogy az �sbeli sztringhez f�zze hozz� a st�lust is!
 */
package harmadik;

import sajat.Konyv;

public class KonyvStilussal extends Konyv {
	private String stilus;

	public KonyvStilussal(String cim, String szerzo, int ar, int oldalszam, String stilus) {
		super(cim, szerzo, ar, oldalszam);
		this.stilus = stilus;
	}

	public String getStilus() {
		return stilus;
	}

	@Override
	public String toString() {
		return "Konyv stilussal ["
				+ super.toString()
				+ ", stilus: "
				+ getStilus()  
				+ "]";
	}

}
