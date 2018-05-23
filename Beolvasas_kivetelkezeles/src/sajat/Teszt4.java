/*
K�sz�tsen saj�t csomagban futtathat� oszt�lyt,
amelyben l�trehoz egy 5 elem� int t�mb�t �s
megpr�b�lja felt�lteni billenty�zetr�l beolvasott �rt�kekkel!
Ha siker�lt, �rja ki a beolvasott 5 sz�mot!

Kezelje az esetleg felmer�l� kiv�teleket!
Tesztelje a programot!

Megold�s v�ltozatok:
- beolvas�s InputStreamReader �s BufferedReader oszt�lyok felhaszn�l�s�val
�s a readLine() met�dussal �s t�pus konverzi�val.
 */
package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teszt4 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];
		InputStreamReader bememetiAdatfolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bememetiAdatfolyam);
		// BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < egeszTomb.length; i++) {

			try {

				System.out.print("Kerem a(z) " + (i + 1) + ". egesz szamot!\nszam:");

				boolean rosszBeolvasas = true;

				do {
					try {
						egeszTomb[i] = Integer.parseInt(beolvasas.readLine());
						rosszBeolvasas = false;
					} catch (NumberFormatException kivetel) {
						System.out.println("Nem egesz szam lett megadva a readLine-nal!");
						System.out.println("Kerem adja meg ujbol!\nszam:");
					}
				} while (rosszBeolvasas);
			} catch (IOException ioKivetel) {
				ioKivetel.printStackTrace();
			}
		}

		System.out.println("\nA beolvasott szamok:");

		for (int i : egeszTomb) {
			System.out.println(i);
		}

	}
}
