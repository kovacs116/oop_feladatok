/*
Egy h�romsz�get a 3 oldal�val adjon meg!

Szab�lyok: az oldalak pozit�v eg�sz sz�mok
�s fenn�ll a h�romsz�g egyenl�tlens�g.

A szab�lyok �rv�nyes�t�s�t kiv�telkezel�ssel oldja meg!
 */
public class Haromszog extends Sikidom {

	private double a_oldal;
	private double b_oldal;
	private double c_oldal;
	
	public Haromszog(double a_oldal, double b_oldal, double c_oldal) {
		if (a_oldal + b_oldal > c_oldal && b_oldal + c_oldal > a_oldal
				&& c_oldal + a_oldal > b_oldal) {
			this.a_oldal = a_oldal;
			this.b_oldal = b_oldal;
			this.c_oldal = c_oldal;
			
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	public double terulet() {
		double s = (a_oldal + b_oldal + c_oldal) / 2;

		return Math.sqrt(s * (s - a_oldal) * (s - b_oldal) * (s - c_oldal));
	}

	@Override
	public double kerulet() {
		return a_oldal + b_oldal + c_oldal;
	}

	@Override
	public String toString() {
		return "Haromszog [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal + ", c_oldal=" + c_oldal + "]";
	}

	
}
