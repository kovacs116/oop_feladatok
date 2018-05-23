/*
K�sz�tsen Szinespont oszt�lyt a Pont oszt�lyb�l sz�rmaztatva!
Adattagja: sz�n
Konstruktor:
- Csak a sz�n param�ter megad�s�val inicializ�lja az adatokat!
- H�rom megkapott param�terrel inicializ�lja az adatokat!
Met�dus:
- Defini�lja fel�l az Object oszt�lyt�l �r�k�lt toString() met�dust!
- Implement�lja a Sz�nezhet� interf�szt!
 */
package pontok;

import java.awt.Color;
import sajat.ISzinezheto;
import sajat.Szin;

public class SzinesPont extends Pont implements ISzinezheto {
	private Color szin;
	private Szin szinkod;
		
	public SzinesPont(Color szin) {
		this(0, 0, szin);
	}

	public SzinesPont(double x, double y, Color szin) {
		super(x, y);
		this.szin = szin;
		szinkod = new Szin(szin);
	}

	@Override
	public String toString() {
		//return super.toString() + ", szin: " + szin;
		return super.toString() + ", szin: " + szinkod;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
		szinkod.setSzinKod(szin);
	}
}
