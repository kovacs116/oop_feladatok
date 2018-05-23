/*
K�sz�tsen egy futtathat� oszt�lyt a sajat.masodik nev� csomagban,
amelyben l�trehoz egy Sz�mot, melynek �rt�ke 0-1 k�z�tti intervallumba esik,
�s elt�rolja egy final lok�lis v�ltoz�ban!
Gener�ljon ciklusban 0-1 k�z�tti val�s sz�mokat
�s �rja ki azokat addig, am�g egyez�t nem tal�l
a l�trehozott Sz�mmal (k�l�nbs�g�k a t�r�sen bel�l van)!
�rja ki h�nyadiknak �ll�totta el� ezt a sz�mot!
- Pr�b�lja ki, hogy meg tudja-e v�ltoztatni a Sz�m adattagj�nak �rt�k�t!
- Pr�b�lja ki, hogy meg tudja-e v�ltoztatni a referenci�j�nak az �rt�k�t!
 */

//az elso mindig a package (csomagdeklaracio),
//utana az import (importdeklaraciok)
//legvegen a tipusdeklaraciok (osztaly, vagy interface)
package sajat.masodik;

import sajat.elso.Szam;

public class Futtathato {

	public static void main(String[] args) {
		//ha nincs import
		//final sajat.elso.Szam valosSzam = new sajat.elso.Szam(Math.random());
		final Szam valosSzam = new Szam(Math.random());
		double valosVeletlenSzam;
		int darabszam = 0;

		System.out.println("Valos szam objektumunk adatai:");
		//Object osztaly toString() metodusanak eredmenye
		System.out.println(valosSzam);
		
		do {
			darabszam++;
			valosVeletlenSzam = Math.random();
			//System.out.println(valosVeletlenSzam);
		} while (!valosSzam.szamTuresenBelulVanE(valosVeletlenSzam));

		System.out.println("Az objektum valosSzam adattagjanak erteke:\n" 
				+ valosSzam.getValosSzam()); 
		
		System.out.println("A generalt valos szam:\n" 
				+ valosVeletlenSzam); 
		
		System.out.println("A generalasok szama: " + darabszam);		

		//Pr�b�lja ki meg tudja-e v�ltoztatni 
		//a Szam adattagj�nak �rt�k�t!
		//igen, megvaltoztathato,
		//mert az adattag modosithato setter-rel, nem final, nem konstans
		valosSzam.setValosSzam(3.14);
		System.out.println("Az uj adattag erteke: " 
					+ valosSzam.getValosSzam());
		
		//Pr�b�lja ki meg tudja-e v�ltoztatni 
		//a referenci�j�nak �rt�k�t!
		//nem valtoztathato meg, mert a referencia final
		//valosSzam = null;
		//valosSzam = new Szam(5.67);
	}
}
