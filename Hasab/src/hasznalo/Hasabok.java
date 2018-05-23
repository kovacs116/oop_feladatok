/*
K�sz�tsen �j csomagban egy olyan oszt�lyt,
amely has�bokat k�pes t�rolni!
Adattagja: Has�b t�pus� t�mb adattag
Konstruktor: param�terben megkapja a has�bok maxim�lis sz�m�t
�s ezzel a m�rettel hozza l�tre a t�mb�t!
Met�dusok:
- setter met�dus, amely param�terben megkap egy indexet �s egy has�bot,
majd a t�mb adott index� elem�nek �rt�k�l adja a kapott has�b referenci�j�t,
- getter met�dus, amely visszaadja a t�mb m�ret�t,
azaz a has�bok maxim�lis sz�m�t,
- getter met�dus, amely param�terk�nt egy indexet kap
�s visszaadja a t�mb adott index� elem�t,
- getter met�dus, amely visszaadja,
hogy h�ny darab nem null �rt�k� t�mbelem van,
- getter met�dus, amely visszaadja a has�bok �tlagos t�rfogat�t,
- getter met�dus, amely visszadja a Henger t�pus� has�bok sz�m�t!
 */
package hasznalo;

import geometria.*;

public class Hasabok {
	Hasab[] hasabtomb;

	public Hasabok(int meret) {
		hasabtomb = new Hasab[meret];
	}

	public void setHasab(int index, Hasab hasab) {
		hasabtomb[index] = hasab;
	}
	
	public int meret() {
		return hasabtomb.length;
	}

	public Hasab getHasab(int index) {
		if (index >= 0 && index < meret()) {
			return hasabtomb[index];
		} else
			return null;
	}

	public int nemNullHasab() {
		int darab = 0;
		
		for (int i = 0; i < meret(); i++)
			if (hasabtomb[i] != null)
				darab++;

		return darab;
	}

	public double atlagosTerfogat() {
		double szumma = 0;
		int darab = 0;
		
		for (int i = 0; i < meret(); i++) {
			if (hasabtomb[i] != null) {
				szumma += hasabtomb[i].terfogat();
				darab++;
			}
		}
		
		if (darab != 0) {
			return szumma / darab;
		} else {
			return 0;
		}
	}
	
	public int hengerekSzama() {
		int darab = 0;
		
		for (int i = 0; i < meret(); i++) {
			if (hasabtomb[i] instanceof Henger) {
				darab++;
			}
		}
		
		return darab;
	}
}
