/*
K�sz�tsen az �ru oszt�llyal azonos csomagban Keny�r oszt�lyt, amely az �ru lesz�rmazottja!
Adattagja: mennyis�g (val�s, pl. 0.75)
Konstruktora: n�gy param�terben kapott adattal inicializ�lja az objektumot!
Met�dusai:
- Defini�lja fel�l a toString met�dust! Az �soszt�lyban defini�lt met�dushoz k�pest
f�zze hozz� az egys�g�rat (brutt��r/mennyis�g)!
- Adja vissza a mennyis�get!
- Hasonl�tsa �ssze k�t keny�r egys�g�r�t!
Az oszt�lyszint� met�dus akkor adjon vissza igazat,
ha a param�terk�nt kapott k�t Keny�r k�z�l az els�nek nagyobb az egys�g�ra!
 */
package termekeim;

public class Kenyer extends Aru {
	private double mennyiseg;

	public Kenyer(String nev, int netto_ar, int afakulcs, double mennyiseg) {
		super(nev, netto_ar, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [" + super.toString() 
				+ ", egysegar: "
				+ brutto_ar() / mennyiseg
				+ "]";
	}
	
	public double getMennyiseg() {
		return mennyiseg;
	}
	
	public static boolean elso_kenyer_nagyobb_egysegaru(
			Kenyer elso_kenyer, Kenyer masodik_kenyer) {
		return elso_kenyer.brutto_ar() / elso_kenyer.mennyiseg >
				masodik_kenyer.brutto_ar() / masodik_kenyer.brutto_ar();
	}
}
