/*
K�sz�tsen m�sik csomagban Pont oszt�lyt!
Adattagja: x �s y koordin�ta (int)
Konstruktor: k�t megkapott param�terrel inicializ�lja az adattagokat
Met�dus:
- Defini�lja fel�l a toString() met�dust,
amely Stringben �sszef�zve adja vissza a pont adatait!

 */
package pontok;

public class Pont {
	private double x;
	private double y;
	
	public Pont(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}	
}
