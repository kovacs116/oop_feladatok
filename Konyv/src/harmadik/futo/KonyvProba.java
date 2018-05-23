/*Tag 4Oroklodes

K�sz�tsen egy futtathat� oszt�lyt
a K�nyvSt�lussal oszt�lyt
mag�ban foglal� csomag alcsomagj�ban!

Ebben olvasson be n darab k�nyvet egy t�mbbe!
a) Sz�molja meg h�nyf�le k�l�nb�z� st�lus� k�nyv szerepel a t�mbben!
b) �rja ki a "sci-fi" st�lus� k�nyvek adatait!
c) Sz�m�tsa ki a "sci-fi" st�lus� k�nyvek �tlag�r�t!

A String-ek egyez�s�nek vizsg�lat�ra haszn�lja
a String oszt�ly
boolean equalsIgnoreCase(String anotherString)
met�dus�t!
 */
package harmadik.futo;

import java.util.*;//Scanner-hez es Random-hoz
import harmadik.KonyvStilussal;
import sajat.Konyv;

public class KonyvProba {

	public static void main(String[] args) {
		//osztalyok tesztelese
		Konyv alapKonyv = new Konyv("ABC", "c�m1", 1000, 150);
		KonyvStilussal konyv = new KonyvStilussal(
				"XY", "c�m2", 2500, 200, "sci-fi");

		System.out.println(alapKonyv);
		System.out.println(konyv);

		//amelyben beolvas n darab k�nyvet egy t�mbbe
		int darabszam;
		System.out.print("\nHany darab konyv legyen?\nn=");
		Scanner beolvasas = new Scanner(System.in);
		darabszam = beolvasas.nextInt();

		KonyvStilussal[] konyvek = new KonyvStilussal[darabszam];
		Random veletlenSzam = new Random();

		System.out.println("A konyvek adatai:");

		for (int i = 0; i < konyvek.length; i++) {
			String stilus;

			switch (veletlenSzam.nextInt(3)) {
				case 0:
					stilus = "sci-fi";
					break;
	
				case 1:
					stilus = "krimi";
					break;
	
				default:
					stilus = "egyeb";
					break;
			}

			konyvek[i] = new KonyvStilussal("iro" + (i + 1),
					"cim" + (i + 1),
					veletlenSzam.nextInt(3000) + 1,
					veletlenSzam.nextInt(200) + 1,
					stilus);

			System.out.println(konyvek[i]);
		}		
		
		System.out.println();
		
		//Sz�molja meg h�nyf�le k�l�nb�z� st�lus� k�nyv szerepel a t�mbben!		
		int stilusok[] = new int[konyvek.length];
		int stilusokszama = 0;
		
		System.out.println("Stilusok:");
		
		for (int i = 0; i < konyvek.length; i++) {
			String stilus = konyvek[i].getStilus();

			if (stilusok[i] == 0) {
				stilusok[i]++;
				stilusokszama++;

				for (int j = i + 1; j < konyvek.length; j++) {
					if (stilus.equals(konyvek[j].getStilus())) {
						stilusok[j] = -1;
					}				
				}
				
				System.out.println(stilus + " stilusu konyv is szerepel a konyvtarban.");			
			}
		}		
		
		System.out.println();
		System.out.println(stilusokszama + " kulonbozo stilusu konyv szerepel a tombben.");
		System.out.println();
		
		//�rja ki a "sci-fi" st�lus� k�nyvek adatait!				
		System.out.println("A sci-fi stilusu konyvek:");

		//A String-ek egyez�s�nek vizsg�lat�ra haszn�lja
		//a String oszt�ly k�vetkez� met�dus�t:
		//boolean equalsIgnoreCase(String anotherString)
		//Compares this String to another String, ignoring case considerations.
		//nincs kis- es nagybetu kozott kulonbseg osszehasonlitasnal
		
		double atlagar = 0;
		int scifi_konyvek_darabszama = 0;
		
		for (KonyvStilussal konyvStilussal : konyvek) {
			//if (konyvStilussal.getStilus().equals("Sci-fi")) {//nem lesz egyezes
			//if (konyvStilussal.getStilus().equals("sci-fi")) {
			//if (konyvStilussal.getStilus().equalsIgnoreCase("sci-fi")) {				
			if (konyvStilussal.getStilus().equalsIgnoreCase("Sci-fi")) {
				System.out.println(konyvStilussal);
				atlagar += konyvStilussal.getAr();
				scifi_konyvek_darabszama++;
			}			
		}
		
		//Sz�m�tsa ki a "sci-fi" st�lus� k�nyvek �tlag�r�t!		
		System.out.println("\nA sci-fi stilusu konyvek atlagara:");
		
		//System.out.println(atlagar / scifi_konyvek_darabszama);//tizedespont
		//System.out.printf("%.2f\n", atlagar / scifi_konyvek_darabszama);//tizedespont
		System.out.println(String.format("%.2f", atlagar / scifi_konyvek_darabszama));//tizedesvesszo
		
		beolvasas.close();
	}

}
