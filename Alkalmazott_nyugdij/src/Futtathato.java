//import java.util.Random;
//import java.util.Scanner;
//ha sok osztaly van egy csomagbol, hasznalhato a *
import java.util.*;

public class Futtathato {
/*
K�sz�tsen egy futtathat� oszt�lyt,
amely beolvas n sz�m� alkalmazottat egy t�mbbe!
- �rja ki az alkalmazottak adatait,
majd m�dos�tsa a nyugd�jkorhat�rt
�s �jra �rja ki az alkalmazottak adatait!
- �rja ki azon alkalmazottak adatait,
akiknek 5 �vn�l kevesebb van m�g h�tra nyugd�jig!
- �rja ki azoknak az alkalmazottaknak az adatait,
akiknek az �tlagn�l t�bb �ve van m�g h�tra nyugd�jig!
- Rendezze az alkalmazottak t�mbj�t
a nyugd�jig h�tral�v� �vek alapj�n n�vekv�,
majd pedig cs�kkent� sorrendbe!
 */
	public static void main(String[] args) {

		//int meret = 5;
		Scanner beolvasas = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az alkalmazottak szamat!");
		System.out.println("alkalmazottak szama:");
		int meret = beolvasas.nextInt();
		//int meret = Integer.parseInt(beolvasas.nextLine());
		
		Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
		Random veletlenszam = new Random();

		System.out.println("Az alkalmazottak adatai:");
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("XY" + (i + 1),
					//18 + veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar() - 18 + 1));
					18 + veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar() - 17));

			System.out.println(alkalmazottak[i]);
		}
		
		//alkalmazottak[0].setNyugdijkorhatar(68);
		Alkalmazott.setNyugdijkorhatar(68);
		
		System.out.println("Adatok a nyugdijkorhatar valtoztatasa utan:");

		//foreach-es szerkezet
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		System.out.println("Alkalmazottak, akiknek 5 evnel kevesebb eve van meg hatra a nyugdijig:");

		double atlag = 0;
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			if (alkalmazott.hanyEvVanHatraANyugdijig() < 5) {
				System.out.println(alkalmazott);
			}
			atlag += alkalmazott.hanyEvVanHatraANyugdijig();
		}

		atlag /= alkalmazottak.length;
		
		System.out.println("Alkalmazottak, akiknek az atlagnal tobb eve van meg hatra a nyugdijig:");

		for (Alkalmazott alkalmazott : alkalmazottak) {
			if (alkalmazott.hanyEvVanHatraANyugdijig() > atlag) {
				System.out.println(alkalmazott);
			}
		}

		//rendezes tobbEveVanHatraNyugdijig() metodus segitsegevel
		for (int i = 0; i < alkalmazottak.length - 1; i++) {
			int max_index = i;
			for (int j = i + 1; j < alkalmazottak.length; j++) {
				Alkalmazott max_hatralevo_ideju = Alkalmazott.tobbEveVanHatraNyugdijig(alkalmazottak[max_index], alkalmazottak[j]);
				if (max_hatralevo_ideju == alkalmazottak[j]) {
					max_index = j;
				}
			}
			
			Alkalmazott ideiglenes = alkalmazottak[max_index];
			alkalmazottak[max_index] = alkalmazottak[i];
			alkalmazottak[i] = ideiglenes;
		}

		System.out.println("Csokkeno sorrend nyugdijig hatralevo ido alapjan");
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}

		//rendezes hanyEvVanHatraANyugdijig() metodus segitsegevel
		for (int i = 0; i < alkalmazottak.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < alkalmazottak.length; j++) {
				if (alkalmazottak[j].hanyEvVanHatraANyugdijig() <
						alkalmazottak[min_index].hanyEvVanHatraANyugdijig()) {
					min_index = j;
				}
			}
			
			Alkalmazott ideiglenes = alkalmazottak[min_index];
			alkalmazottak[min_index] = alkalmazottak[i];
			alkalmazottak[i] = ideiglenes;
		}

		System.out.println("Novekvo sorrend nyugdijig hatralevo ido alapjan");
		
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}		
		
		beolvasas.close();
	}

}
