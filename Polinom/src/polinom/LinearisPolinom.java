/*
Defini�ljon egy polinom.LinearisPolinom oszt�lyt,
amely egy els�fok� egyv�ltoz�s polinomot reprezent�l
(k�plete: y=ax+b)!
Adattagjai: a polinom egy�tthat�i (a �s b), val�s sz�mok
Konstruktor: k�t param�terben megadott �rt�kkel
inicializ�lja az adattagokat
Met�dusai:
- Implement�lja a IPolinom interf�sz met�dusait!
- Defini�lja fel�l a toString met�dust,
amely a polinom k�plet�t adja vissza egy string-ben
a konkr�t egy�tthat�kkal (Pl.: y=2x-3)!
 */
package polinom;

import matematika.IPolinom;

public class LinearisPolinom implements IPolinom {

	//a polinom egyutthatoi
	//y = ax + b
	private double a;
	private double b;
	
	public LinearisPolinom(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double szamol(double valosSzam) {
		return a * valosSzam + b;
	}

	@Override
	public int getPolinomFoka() {
		if (a == 0)
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "y=" + a + "x" 
				+ (b < 0 ? "" : "+") + b;
	}

}
