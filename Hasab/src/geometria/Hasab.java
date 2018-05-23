/*
K�sz�tsen saj�t csomagban Has�b absztrakt oszt�lyt!
Adattagja: magass�g (int)
Konstruktora: a param�terben kapott �rt�kkel inicializ�lja a magass�got
Met�dusok:
- getter met�dus, amely visszaadja a magass�got,
- abstract met�dus az alapter�let visszaad�s�ra,
- met�dus a t�rfogat visszaad�s�ra,
- �sszehasonl�t� met�dus, amely igazat ad,
ha a has�b nagyobb t�rfogat�, mint egy param�terben kapott m�sik has�b t�rfogata.
 */
package geometria;

public abstract class Hasab {
	private double magassag;

	public Hasab(double magassag) {
		this.magassag = magassag;
	}

	public double getMagassag() {
		return magassag;
	}

	//abstract met�dus az alapter�let visszaad�s�ra
	public abstract double alapterulet();

	public double terfogat() {
		return alapterulet() * magassag;
	}
	
	public boolean nagyobbTerfogatuMint(Hasab masikHasab) {
		return terfogat() > masikHasab.terfogat();

	}
}
