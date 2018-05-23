/*
K�sz�tsen egy futtathat� oszt�lyt,
amelyben egy Sz�nezhet� t�pus� referenci�nak 
Szinespont p�ld�nyt ad �rt�k�l,
ki�rja az adatait, majd �tszinezi
�s �jra ki�rja az adatait!
Ugyanezt pr�b�lja ki egy Toll objektummal is!

K�sz�tsen az oszt�lyba egy statikus met�dust,
amely param�terk�nt egy Sz�nezhet� objektumot v�r
�s az objektumot �tszinezi alapsz�nre!

A main-t is eg�sz�tse ki �gy,
hogy haszn�lja a met�dust egy Szinespont p�ld�nnyal
�s egy Toll p�ld�nnyal is!

K�sz�tsen saj�t Sz�n oszt�ly, ami ugyanazt tudja,
mint a java.awt.Color oszt�ly, csak a toString()
met�dus a sz�nek magyar nev�t �rja ki!
Haszn�lja ezt az objektumok sz�n�nek ki�r�s�hoz!
 */
package Proba;

import java.awt.Color;
import sajat.ISzinezheto;
import pontok.SzinesPont;
import termekeim.Toll;
import sajat.Szin;
import sajat.Szin.Szinek;;

public class Futtathato {

	public static void main(String[] args) {

		//ISzinezheto szinesPont = new SzinesPont(Color.BLUE);
		ISzinezheto szinesPont = new SzinesPont(1.0, 1.0, Color.BLUE);

		System.out.println(szinesPont);
		szinesPont.setSzin(Color.GREEN);
		System.out.println(szinesPont);

		Futtathato.setAlapertelmezettSzin(szinesPont);
		System.out.println(szinesPont);

		ISzinezheto toll = new Toll(Color.YELLOW, "parker", 1, 2);
		
		System.out.println(toll);
		toll.setSzin(Color.BLUE);
		System.out.println(toll);

		Futtathato.setAlapertelmezettSzin(toll);
		System.out.println(toll);		
		
		//Szin szin = new Szin(Szinek.valueOf("BLACK"));
		//Szin szin = new Szin(Color.BLACK);
		Szin szin = new Szin(Szinek.BLACK);
		System.out.println(szin);
		
		SzinesPont szinesPont2 = new SzinesPont(Color.WHITE);
		System.out.println(szinesPont2);		
	}

	static void setAlapertelmezettSzin(ISzinezheto obj) {
		//obj.setSzin(obj.alapertelmezettSzin);
		obj.setSzin(ISzinezheto.alapertelmezettSzin);
	}
}
