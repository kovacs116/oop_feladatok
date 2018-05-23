/*
K�sz�tsen saj�t csomagban futtathat� oszt�lyt,
amelyben l�trehoz egy 5 elem� int t�mb�t �s
megpr�b�lja felt�lteni billenty�zetr�l beolvasott �rt�kekkel!
Ha siker�lt, �rja ki a beolvasott 5 sz�mot!

Kezelje az esetleg felmer�l� kiv�teleket!
Tesztelje a programot!

M�dos�tsa �gy a feladatot, hogy a beolvas�st k�l�n met�dus val�s�tsa meg!
Csak pozit�v sz�mokat fogadjon el.
A negat�v sz�mok �s a 0 �rv�nytelen input.
 */
package sajat;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Teszt5 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];

		for (int i = 0; i < egeszTomb.length; i++) {
			//egeszTomb[i] = pozitivEgeszetBeolvas(i + 1);
			egeszTomb[i] = pozitivEgeszetBeolvasKivetellel(i + 1);
		}

		System.out.println("\nA beolvasott szamok:");

		for (int i : egeszTomb) {
			System.out.println(i);
		}

	}

	public static int pozitivEgeszetBeolvas(int i) {
		@SuppressWarnings("resource")
		java.util.Scanner beolvasas = new java.util.Scanner(System.in);
		int egeszSzam;

		do {
			System.out.print("Kerem a(z) " + i + ". pozitiv egesz szamot!\nszam:");

			while (!beolvasas.hasNextInt()) {
				beolvasas.next();
				System.out.println("Nem egesz szam lett megadva!");
				System.out.print("Kerem adja meg ujbol!\nszam:");
			}

			egeszSzam = beolvasas.nextInt();

			if (egeszSzam <= 0)
				System.out.println("Nem pozitiv egesz szam lett megadva!");

		} while (egeszSzam <= 0);

		return egeszSzam;
	}

	public static int pozitivEgeszetBeolvasKivetellel(int i) {
		int egeszSzam = 0;
		InputStreamReader bememetiAdatfolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bememetiAdatfolyam);
		// BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.print("Kerem a(z) " + i + ". pozitiv egesz szamot!\nszam:");

			boolean rosszBeolvasas = true;

			do {
				try {
					egeszSzam = Integer.parseInt(beolvasas.readLine());
					if (egeszSzam <= 0) {
						throw new IllegalArgumentException();
					}
					rosszBeolvasas = false;
				} catch (NumberFormatException kivetel) {
					System.out.println("Nem egesz szam lett megadva a readLine-nal!");
					System.out.println("Kerem adja meg ujbol!\nszam:");
				} catch (IllegalArgumentException kivetel) {
					System.out.println("Nem pozitiv szam lett megadva a readLine-nal!");
					System.out.println("Kerem adja meg ujbol!\nszam:");
				}
			} while (rosszBeolvasas);

		} catch (IOException ioKivetel) {
			ioKivetel.printStackTrace();
		}

		return egeszSzam;
	}
}
