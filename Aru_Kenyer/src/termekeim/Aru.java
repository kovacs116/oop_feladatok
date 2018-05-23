/*
Defini�ljon termekeim nevu csomagban �ru oszt�lyt!
Adattagjai: n�v, nett� �r (eg�sz), �fakulcs (eg�sz, sz�zal�k).
Konstruktora: mindh�rom adat megad�s�val inicializ�lja az adattagokat!
Met�dusai:
- Sz�m�tsa ki a brutt��r�t egy �runak (eg�sz, kerek�tve)!
- Egy sztringbe �sszef�zve adja vissza az �ru nev�t �s a brutt� �r�t!
Defini�lja fel�l az Object oszt�lybeli toString met�dust!
- N�velje meg az �ru nett� �r�t a param�terben megadott sz�zal�kos �rt�kkel (eg�sz)!
- Hasonl�tsa �ssze k�t �ru brutt� �r�t!
1-et adjon vissza, ha az �ru dr�g�bb mint a param�terben megadott;
-1-et ha olcs�bb, �s 0-�t ha azonos �r�ak!
 */
package termekeim;

public class Aru {

	private String nev;
	private int netto_ar;
	private int afakulcs;
	
	public Aru(String nev, int netto_ar, int afakulcs) {
		this.nev = nev;
		this.netto_ar = netto_ar;
		this.afakulcs = afakulcs;
	}

	public int brutto_ar() {
		return (int)(netto_ar * (1 + afakulcs / 100.0));
	}

	@Override
	public String toString() {
		return "Aru [nev=" + nev + ", brutto ara=" + brutto_ar() + "]";
	}
	

	public void netto_arat_novel(int szazalek) {
		netto_ar = (int)(netto_ar * (1 + szazalek / 100.0));
	}

	public int dragabb_e(Aru masik_aru) {
		if (brutto_ar() > masik_aru.brutto_ar()) {
			return 1;
		} else if (brutto_ar() < masik_aru.brutto_ar()) {
			return -1;
		} else {
			return 0;
		}
	}
}
