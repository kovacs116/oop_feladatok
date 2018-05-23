import java.util.Scanner;

/*
K�sz�tsen futtathat� oszt�lyt,
amelyben beolvassa n db k�nyv adatait!
- C�m szerint rendezze a k�nyveket
(haszn�lja a String oszt�ly
int compareToIgnoreCase(String str) met�dus�t)
�s �rja ki az egys�g�rukat!
- �llap�tsa meg, mely szerz�knek van
20 Ft/oldaln�l dr�g�bb egys�g�r� k�nyve!
 */
public class Futtathato {

	public static void main(String[] args) {
		Scanner beolvasas = new Scanner(System.in);
		
		System.out.println("Kerem adja meg a konyvek szamat!");
		System.out.println("darabszam: ");
		int darabszam = beolvasas.nextInt();
		
		Konyv konyvek[] = new Konyv[darabszam];
		
		System.out.println("A konyvek adatai:");
		
		for (int i = 0; i < konyvek.length; i++) {
			konyvek[i] = new Konyv("Cim" 
							//+ (int)(Math.random() * 9 + 1),
							+ (i + 1),
							"Szerzo" + (i + 1),
							(int)(Math.random() * 8000 + 1),
							(int)(Math.random() * 1200 + 1));
			System.out.println(konyvek[i]);
			//System.out.println(konyvek[i].egysegar());
		}
		
		System.out.println();
		System.out.println("A cim szerint rendezett konyvek adatai:");
		
		for (int i = 0; i < konyvek.length - 1; i++) {
			int cim_index = i;
			for (int j = i + 1; j < konyvek.length; j++) {
				if (konyvek[j].getCim().compareToIgnoreCase(konyvek[cim_index].getCim()) < 0) {
					cim_index = j;
				}
			}

			Konyv ideiglenes = konyvek[cim_index];
			konyvek[cim_index] = konyvek[i];
			konyvek[i] = ideiglenes;
		}

		for (Konyv konyv : konyvek) {
			System.out.println(konyv);
		}		

		
		int leszurtegysegaruak[] = new int[konyvek.length];
		
		System.out.println();
		System.out.println("20 Ft/oldalnal dragabb egysegaru szerzok:");
		
		for (int i = 0; i < konyvek.length; i++) {
			if (leszurtegysegaruak[i] == 0) {
				for (int j = i; j < konyvek.length; j++) {
					if (konyvek[i].getSzerzo().equals(konyvek[j].getSzerzo())) {
						leszurtegysegaruak[j] = -1;
						if (konyvek[j].egysegar() > 20) {
							leszurtegysegaruak[i] = 1;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < leszurtegysegaruak.length; i++) {
			if (leszurtegysegaruak[i] == 1) {
				System.out.println(konyvek[i].getSzerzo());
			}			
		}
		
		beolvasas.close();
	}

}
