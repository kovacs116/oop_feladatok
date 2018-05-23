/*
K�sz�tsen saj�t csomagban futtathat� oszt�lyt,
amelyben l�trehoz egy 5 elem� int t�mb�t �s
megpr�b�lja felt�lteni billenty�zetr�l beolvasott �rt�kekkel!
Ha siker�lt, �rja ki a beolvasott 5 sz�mot!

Kezelje az esetleg felmer�l� kiv�teleket!
Tesztelje a programot!

Megold�s v�ltozatok:
- beolvas�s Scanner oszt�ly nextInt() met�dus�val.
 */
package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teszt1 {

	public static void main(String[] args) {
		int tombMeret = 5;
		int[] egeszTomb = new int[tombMeret];		
		Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < egeszTomb.length; i++) {

			System.out.print("Kerem a(z) " + (i + 1) + ". egesz szamot!\nszam:");
			
			boolean rosszBeolvasas = true;

			do {
				try {
					egeszTomb[i] = beolvasas.nextInt();
					rosszBeolvasas = false;
				} catch (InputMismatchException kivetel) {
					System.out.println("Nem egesz szam lett megadva a nextInt-nel!");
					System.out.println("Kerem adja meg ujbol!\nszam:");
				} catch (Exception e) {
					System.out.println("Nem egesz szam lett megadva a nextInt-nel!");
				} finally {
					beolvasas.nextLine();
				}				
			} while (rosszBeolvasas);			
		}
		
		beolvasas.close();

		System.out.println("\nA beolvasott szamok:");
		
		for (int i : egeszTomb) {
			System.out.println(i);
		}
	}

}
