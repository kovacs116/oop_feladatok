/*
1. K�sz�tsen el egy Alkalmazott oszt�lyt
�s egy Alkalmazott oszt�lyt haszn�l� oszt�lyt!
a) Az Alkalmazott oszt�lyban
- van n�v �s fizet�s adattag (f�lnyilv�nosak);
- van egy met�dusa, amely egy param�terk�nt kapott �rt�kkel megn�veli a fizet�st;
- van egy met�dusa, amely egy String-be �sszef�zi a nevet �s a fizet�st �s ezt adja vissza.

b) �rjuk �t az adattagokat private-ra �s k�sz�ts�nk setter met�dusokat az adatok be�ll�t�s�hoz,
�s getter met�dusokat az adatok lek�rdez�s�hez (adatrejt�s)!
�rjuk �t ennek megfelel�en az Alkalmazott oszt�lyt haszn�l� oszt�lyt!

c) Eg�sz�ts�k ki az Alkalmazott oszt�lyt a k�vetkez� met�dusokkal:
 - adjon vissza igazat, ha a fizet�s a param�terk�nt megadott hat�rok k�z� esik, �s hamisat ha nem;
 - adja vissza a fizetend� ad� �rt�ket, ha az ad�kulcs 16% ;
 - adjon vissza igazat, ha a fizet�s nagyobb, mint egy param�terk�nt megadott m�sik alkalmazott�!
 
Eg�sz�ts�k ki az Alkalmazott oszt�lyt haszn�l� oszt�lyt �gy,
hogy minden funkci�t ki tudjunk pr�b�lni.
 */

public class Alkalmazott {
	//az adatagok felnyilvanosak
	//String nev;
	//long fizetes;//forint

	//az adatagok privatak
	private String nev;
	private long fizetes;//forint
	
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
