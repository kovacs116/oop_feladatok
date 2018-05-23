/*
K�sz�tsen saj�t csomagban futtathat� oszt�lyt,
amelyben l�trehoz egy 5 elem� int t�mb�t �s
megpr�b�lja felt�lteni billenty�zetr�l beolvasott �rt�kekkel!
Ha siker�lt, �rja ki a beolvasott 5 sz�mot!

Kezelje az esetleg felmer�l� kiv�teleket!
Tesztelje a programot!

M�dos�tsa �gy a feladatot, hogy a beolvas�st k�l�n met�dus val�s�tsa meg!
M�dos�tsa �gy a feladatot, hogy csak pr�msz�mokat fogadjon el beolvas�skor!

K�sz�tsen hozz� saj�t kiv�teloszt�lyt (legyen k�telez�en lekezelend�)!
 */
package sajat;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import kivetelek.NemPrimszamException;

public class Teszt7 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];

		for (int i = 0; i < egeszTomb.length; i++) {
			egeszTomb[i] = primszamotBeolvas(i + 1);
		}

		System.out.println("\nA beolvasott primszamok:");

		for (int i : egeszTomb) {
			System.out.println(i);
		}

	}

	public static int primszamotBeolvas(int i) {
		int egeszSzam = 0;
		InputStreamReader bememetiAdatfolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bememetiAdatfolyam);
		// BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.print("Kerem a(z) " + i + ". primszamot!\nszam:");

			boolean rosszBeolvasas = true;

			do {
				try {
					egeszSzam = Integer.parseInt(beolvasas.readLine());
					if (!primszamE(egeszSzam)) {
						throw new NemPrimszamException();
					}
					rosszBeolvasas = false;
				} catch (NumberFormatException kivetel) {
					System.out.println("Nem egesz szam lett megadva a readLine-nal!");
					System.out.print("Kerem adja meg ujbol!\nszam:");
				} catch (NemPrimszamException kivetel) {
					System.out.println(kivetel.getMessage());
					//System.out.println(kivetel);
					System.out.print("Kerem adja meg ujbol!\nszam:");
				}
			} while (rosszBeolvasas);

		} catch (IOException ioKivetel) {
			ioKivetel.printStackTrace();
		}

		return egeszSzam;
	}
	
	public static boolean primszamE(int szam) {
		if (szam < 2) {
			return false;
		}
		
		for (int i = 2; i <= szam / 2; i++) {
			if (szam % i == 0) {
				return false;
			}
		}
		
		return true;
	}	
}
