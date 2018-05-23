/* Tag 2Csomag
Ugyanebben a csomagban k�sz�tsen egy futtathat� oszt�lyt,
amelyben beolvas n darab k�nyvet egy t�mbbe!
- �rja ki a leghosszabb k�nyv adatait!
- Gy�jtse ki egy t�mbbe a p�ros oldalsz�m� k�nyveket
�s �rja ki a leghosszabb p�ros oldalsz�m� k�nyv adatait!
- �rja ki, hogy melyik szerz�nek h�ny darab k�nyve jelent meg!
 */
/* Tag 3KulonbozoCsomagok
Ugyanezeket a feladatokat oldja meg �gy,
hogy a futtathat� oszt�lyt m�sik csomagban defini�lja!
 */

package masik;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;
import sajat.Konyv;

public class Konyvtar {
	public static void main(String[] args) {
		
		Scanner beolvasas = new Scanner(System.in);
		Random veletlenszamobjektum = new Random();

		int meret;
		meret = 5;
//		System.out.println("Hany darab konyvet szeretne tarolni?");
//		System.out.println("darabszam:");
//		meret = Integer.parseInt(beolvasas.nextLine());

		Konyv konyvek[] = new Konyv[meret];

		System.out.println("A konyvek adatai:");		
		
		for (int i = 0; i < konyvek.length; i++) {
			/*
			System.out.println("Kerem adja meg a(z) " + (i + 1) + ". konyv szerzojet!\nszerzo:");
			String szerzo = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv cimet!\ncim:");
			String cim = beolvasas.nextLine();

			System.out.println("Kerem adja meg a konyv oldalszamat!\noldalszam:");
			int oldalszam = beolvasas.nextInt();
			
			System.out.println("Kerem adja meg a konyv arat!\nar:");
			int ar = beolvasas.nextInt();
			//puffer uritese
			beolvasas.nextLine();
			
			konyvek[i] = new Konyv(cim, szerzo, ar, oldalszam);
			*/
			
			konyvek[i] = new Konyv("Cim" + (i + 1),
					(char)(veletlenszamobjektum.nextInt('Z' - 'A' + 1) + 'A')
					+ "" + (char)(veletlenszamobjektum.nextInt('Z' - 'A' + 1) + 'A'),
					veletlenszamobjektum.nextInt(10000) + 1,
					veletlenszamobjektum.nextInt(1500) + 1);
			System.out.println(konyvek[i]);
			
		}

		//�rja ki a leghosszabb k�nyv adatait!
		Konyv leghosszabb_konyv = konyvek[0];
		
		for (int i = 1; i < konyvek.length; i++) {
			leghosszabb_konyv = Konyv.hosszabbKonyv(konyvek[i], leghosszabb_konyv);			
		}

		System.out.println("A leghosszabb konyv adatai:");
		System.out.println(leghosszabb_konyv);
		
		//�rja ki a leghosszabb p�ros oldalsz�m� k�nyv adatait!
		Konyv leghosszabb_paros_oldalszamu_konyv = null;
		for (int i = 0; i < konyvek.length; i++) {
			if (konyvek[i].oldalszamParosE()) {
				if (leghosszabb_paros_oldalszamu_konyv == null) {
					leghosszabb_paros_oldalszamu_konyv = konyvek[i];
				} else {
					leghosszabb_paros_oldalszamu_konyv = Konyv.hosszabbKonyv(konyvek[i], leghosszabb_paros_oldalszamu_konyv);
				}						
			}
		}

		System.out.println("A leghosszabb paros oldalszamu konyv adatai:");
		System.out.println(leghosszabb_paros_oldalszamu_konyv);
				
		//Gy�jtse ki egy t�mbbe a p�ros oldalsz�m� k�nyveket
		//�s �rja ki a leghosszabb p�ros oldalsz�m� k�nyv adatait!
		int paros_oldalszamuak_darabszama = 0;

		//parosok megszamolasa
		for (Konyv konyv : konyvek) {
			if (konyv.oldalszamParosE()) {
				paros_oldalszamuak_darabszama++;
			}
		}
		
		//tomb letrehozasa
		Konyv paros_oldalszamu_konyvek[] = new Konyv[paros_oldalszamuak_darabszama];
		int paros_konyv_indexe = 0;
		
		//tomb feltoltese
		for (Konyv konyv : konyvek) {
			if (konyv.oldalszamParosE()) {
				paros_oldalszamu_konyvek[paros_konyv_indexe] = konyv;
				paros_konyv_indexe++;
			}
		}

		//leghosszabb paros megkeresese
		leghosszabb_paros_oldalszamu_konyv = null;
		
		for (Konyv konyv : paros_oldalszamu_konyvek) {
			if (leghosszabb_paros_oldalszamu_konyv == null) {
				leghosszabb_paros_oldalszamu_konyv = konyv;
			} else {
				leghosszabb_paros_oldalszamu_konyv = Konyv.hosszabbKonyv(konyv, leghosszabb_paros_oldalszamu_konyv);
			}						
		}
		
		//System.out.println("A leghosszabb paros oldalszamu konyv adatai:");
		//System.out.println(leghosszabb_paros_oldalszamu_konyv);		
		
		//�rja ki, hogy melyik szerz�nek h�ny darab k�nyve jelent meg!
		int darabszamok[] = new int[konyvek.length];
		
		for (int i = 0; i < konyvek.length; i++) {
			String szerzo = konyvek[i].getSzerzo();

			if (darabszamok[i] == 0) {
				darabszamok[i]++;

				for (int j = i + 1; j < konyvek.length; j++) {
					if (szerzo.equals(konyvek[j].getSzerzo())) {
						darabszamok[i]++;
						darabszamok[j] = -1;
					}				
				}
				
				System.out.println(szerzo + " konyveinek darabszama: " + darabszamok[i]);			
			}
		}		
		
		beolvasas.close();
	}
}