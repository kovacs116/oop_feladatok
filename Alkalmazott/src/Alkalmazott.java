/*
Eg�sz�tse ki a 3_1-ben defini�lt Alkalmazott oszt�lyt 2 konstruktorral!
Az egyik konstruktornak az alkalmazott nev�t �s fizet�s�t kell megadni,
a m�sik konstruktornak az alkalmazott nev�t, a fizet�se 250000 Ft.
A m�sodik konstruktor haszn�lja fel az els�t!
M�dos�tsa az Alkalmazottat haszn�l� oszt�lyt ennek megfelel�en!
 */

public class Alkalmazott {
	//az adatagok felnyilvanosak
	//String nev;
	//long fizetes;//forint

	//az adatagok privatak
	private String nev;
	private long fizetes;//forint	
	
	public Alkalmazott(String nev, long fizetes) {
		this.nev = nev;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev) {
		this(nev, 250000);
	}
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	public void fizetestNovel(long novekmeny) {
		fizetes += novekmeny;
	}

	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes <= felsohatar;
	}
	
	public long fizetendoAdo(int adokulcs) {
		return fizetes * adokulcs / 100;
	}
		
	public long fizetendoAdo() {
		return (long)(fizetes * 0.16);
	}
	
	public boolean fizetesNagyobbMint(Alkalmazott masikAlkalmazott) {
		//return fizetes > masikAlkalmazott.fizetes;
		
		if (fizetes > masikAlkalmazott.getFizetes()) {
			return true;
		} else {
			return false;
		}		
	}
	
	@Override
	public String toString() {
		//return "Alkalmazott neve: " + nev + ", fizetese: " + fizetes + " Ft";
		return "Alkalmazott neve: " + getNev() + ", fizetese: " + getFizetes() + " Ft";
	}
}
