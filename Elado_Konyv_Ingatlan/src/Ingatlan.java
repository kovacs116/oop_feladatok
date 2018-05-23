/*
K�sz�tsen Ingatlan oszt�lyt,
amely implement�lja az IElado interf�szt!

Adattagjai: �r, devizanem, m�ret (int), hely (v�ros)
Konstruktor: n�gy param�ter megad�s�val inicializ�lja az adatokat
Met�dusok:
- Az ingatlan m�ret�b�l �s �r�b�l sz�m�tsa ki a n�gyzetm�ter �rat!
- �tsz�m�tja az ingatlan �r�t eur�ra!
- Defini�lja fel�l a toString() met�dust!
 */
public class Ingatlan implements IElado {

	private int ar;
	private String devizanem;
	private int meret;
	private String hely;

	public Ingatlan(int ar, String devizanem, int meret, String hely) {
		this.ar = ar;
		this.devizanem = devizanem;
		this.meret = meret;
		this.hely = hely;
	}

	public int negyzetmeterenkentiAr() {
		return ar / meret;
	}

	@Override
	public String toString() {
		return "Ingatlan [" 
				+ hely
				+ ", "
				+ meret 
				+ " m2, "
				+ getAr() 
				+ ", " 
				+ negyzetmeterenkentiAr()
				+ " "
				+ devizanem
				+ "/m2]";
	}

	public void atvaltEurora(int arfolyam) {
		setAr(ar / arfolyam, "EUR");
	}
	
	@Override
	public String getAr() {
		return ar + " " + devizanem;
	}

	@Override
	public void setAr(int ar, String devizanem) {
		this.ar = ar;
		this.devizanem = devizanem;
	}
}
