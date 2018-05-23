/*
K�sz�tsen ugyanebben a csomagban T�glatest oszt�lyt,
amely a Has�b lesz�rmazottja!
Adattagjai: az alap k�t oldala (double)
Konstruktor: a h�rom adattagot a param�terben megkapott �rt�kkel inicializ�lja
Met�dusok:
- defini�lja fel�l az �r�k�lt alapter�letet visszaad� met�dus,
- defini�lja fel�l a toString() met�dust:
ez �sszef�zve adja vissza a t�glatest alapj�nak oldalait �s magass�g�t!
 */
package geometria;

public class Teglatest extends Hasab {
	private double aOldal;
	private double bOldal;	
	
	public Teglatest(double magassag, double aOldal, double bOldal) {
		super(magassag);
		this.aOldal = aOldal;
		this.bOldal = bOldal;
	}

	@Override
	public double alapterulet() {
		return aOldal * bOldal;
	}

	@Override
	public String toString() {
		return "a oldal: " + aOldal 
				+ ", b oldal: " + bOldal 
				+ ", magassag: " + getMagassag();
	}
}
