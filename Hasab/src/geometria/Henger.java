/*
Ugyanebben a csomagban k�sz�tsen Henger oszt�lyt,
amely a Has�b lesz�rmazottja!
Adattagja: sug�r (double)
Konstruktor: a param�terben kapott sug�r �s magass�g
�rt�kekkel inicializ�lja az objektumot
Met�dusok:
- defini�lja fel�l az �r�k�lt alapter�letet visszaad� met�dust,
- defini�lja fel�l a toString() met�dust:
ez �sszef�zve adja vissza a henger sugar�t �s magass�g�t!
 */
package geometria;

public class Henger extends Hasab {
	private double sugar;

	public Henger(double magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}

	@Override
	public double alapterulet() {
		return sugar * sugar * Math.PI;
	}

	@Override
	public String toString() {
		return "sugar: " + sugar + ", magassag: " + getMagassag();
	}
}
