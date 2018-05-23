/*
K�sz�tsen oszt�lyt �j csomagban KonyvEnummal n�ven
a kor�bbi saj�t csomagban defini�lt K�nyv oszt�ly
lesz�rmazottjak�nt!
Legyen benne public be�gyazott felsorol�s t�pus
Stilus n�ven a k�nyv st�lus�nak megad�s�hoz
a k�vetkez� konstansokkal:
SCIFI, SZAKACS, ROMANTIKUS, EGYEB.
Adattagja: Stilus t�pus� st�lus adattag
Konstruktor: minden adattagot a param�terben kapott �rt�kekkel inicializ�lja
Met�dusok:
- Defini�lja fel�l a toString met�dust �gy,
hogy az �sbelihez m�g f�zze hozz� a st�lust!
- Getter met�dus a st�lus lek�rdez�s�re!
 */
package negyedik;

import sajat.Konyv;

public class KonyvEnummal extends Konyv{
	public enum Stilus {
		SCIFI, SZAKACS, ROMANTIKUS, EGYEB
	}
	
	private Stilus stilus;

	public KonyvEnummal(String cim, String szerzo, int ar, int oldalszam, Stilus stilus) {
		super(cim, szerzo, ar, oldalszam);
		this.stilus = stilus;
	}

	@Override
	public String toString() {
		return super.toString() + ", stilus: " + getStilus();
	}

	public Stilus getStilus() {
		return stilus;
	}
}
