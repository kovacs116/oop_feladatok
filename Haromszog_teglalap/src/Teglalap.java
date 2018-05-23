/*
Egy t�glalapot a 2 oldal�val adjon meg4

Szab�lyok: az oldalak pozit�v eg�sz sz�mok
�s nem egyenl�ek.

A szab�lyok �rv�nyes�t�s�t kiv�telkezel�ssel oldja meg!
 */
public class Teglalap extends Sikidom {

	private double a_oldal;
	private double b_oldal;	
	
	public Teglalap(double a_oldal, double b_oldal) {
		if (a_oldal <= 0 || b_oldal <= 0 || a_oldal == b_oldal) {
			throw new IllegalArgumentException();
		}
		
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}

	@Override
	public double terulet() {
		return a_oldal * b_oldal;
	}

	@Override
	public double kerulet() {
		return 2 * (a_oldal + b_oldal);
	}

	@Override
	public String toString() {
		return "Teglalap [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal + "]";
	}
	
}
