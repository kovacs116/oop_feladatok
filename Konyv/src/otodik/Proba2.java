/*
M�dos�tsa a K�nyv oszt�ly defin�ci�j�t �gy,
hogy a konstruktora dobjon kiv�telt,
ha a megadott oldalsz�m �s az �r negat�v!
Keressen hozz� megfelel� kiv�teloszt�lyt �s
kezelje le a kiv�telt!

Ellen�rz�tt adatbeolvas�s v�ltozatai:
b) hib�s input eset�n az oldalsz�mot �s az �rat
vegye 0-nak (jelent�se: nem ismert adat)!
 */
package otodik;

import java.util.Scanner;

import negyedik.KonyvEnummal;
import negyedik.KonyvEnummal.Stilus;
import sajat.Konyv;

public class Proba2 {

	public static void main(String[] args) {
		int konyvekDarabszama = 2;
		KonyvEnummal[] konyvek = new KonyvEnummal[konyvekDarabszama];

		Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < konyvek.length; i++) {

			System.out.println("Kerem adja meg a konyv szerzojet!");
			System.out.println("szerzo:");
			String szerzo = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv cimet!");
			System.out.println("cim:");
			String cim = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv oldalszamat!");
			System.out.println("oldalszam:");
			int oldalszam = beolvasas.nextInt();
			beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv arat!");
			System.out.println("ar:");
			int ar = beolvasas.nextInt();
			beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv stilusat!");

			// egesz szam bekerese
			System.out.println("1 - scifi\n2 - szakacs\n3 - romantikus\n4 - egyeb");
			System.out.println("stilus (1-4):");
			int stilusszammal = beolvasas.nextInt();
			beolvasas.nextLine();
			
			Stilus stilus ;
			try {
				stilus = Stilus.values()[stilusszammal - 1];
			} catch (ArrayIndexOutOfBoundsException e) {
				//egyeb stilus
				stilus = Stilus.values()[3];
			}

			boolean rosszAdatok = true;
			
			do {
				try {
					konyvek[i] = new KonyvEnummal(cim, szerzo, ar, oldalszam, stilus);
					rosszAdatok = false;

				} catch (IllegalArgumentException e) {
					if (ar < 0) {
						System.out.println("Az ar nem lehet negativ.");
						ar = 0;
					}
					
					if (oldalszam < 0) {
						System.out.println("Az oldalszam nem lehet negativ.");
						oldalszam = 0;
					}
				}
				
			} while (rosszAdatok);
			

		} // for

		beolvasas.close();

		System.out.println();
		System.out.println("A konyvek adatai:");

		for (Konyv konyv : konyvek) {
			System.out.println(konyv);
		}

	}

}
