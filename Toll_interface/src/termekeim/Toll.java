/*
A 6_1_Aru_Kenyer-ben k�sz�tett �ru oszt�llyal azonos csomagban
k�sz�tsen Toll oszt�lyt az �ru oszt�ly lesz�rmazottjak�nt!
Adattagjai: sz�n �s m�rkan�v
Konstruktor: minden adatot megkap param�terk�nt
Met�dus:
- Defini�lja fel�l az �r�k�lt toString() met�dust.
- Implement�lja a Sz�nezhet� interf�szt.
 */
package termekeim;

import java.awt.Color;

import sajat.ISzinezheto;

public class Toll extends Aru implements ISzinezheto {
	private Color szin;
	private String markanev;	
	
	public Toll(String nev, int netto_ar, int afakulcs, Color szin, String markanev) {
		super(nev, netto_ar, afakulcs);
		this.szin = szin;
		this.markanev = markanev;
	}

	public Toll(Color szin, String markanev, int netto, int afa) {
		super("toll", netto, afa);
		this.szin = szin;
		this.markanev = markanev;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", szin: " + szin + ", markanev: " + markanev;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}
}
