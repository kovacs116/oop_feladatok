/*
Defini�ljon egy futtathat� oszt�lyt polinom.Teszt n�ven!
a) Ebben hozzon l�tre egy oszt�lyszint� met�dust,
amely param�terk�nt megkap egy polinomot
(IPolinom t�pus� referenci�t)
�s ki�rja a kapott polinom f�ggv�nyt�bl�zat�t
0 �s 1 k�z�tt 0.1 l�p�ssel!
b) A main-ben hozzon l�tre 5 line�ris polinomot
beolvasott egy�tthat�kkal �s t�rolja egy t�mbbe!
Majd �rja ki az �sszes polinom k�plet�t!
Ezut�n az el�z� met�dus seg�ts�g�vel irassa ki
az utols� polinom f�ggv�nyt�bl�zat�t!
*/
package polinom;

import java.util.Scanner;
import matematika.IPolinom;

public class Teszt {

	//public static void fuggvenyTablazat(matematika.IPolinom polinom) {
	public static void fuggvenyTablazat(IPolinom polinom) {
				
		System.out.println();
		System.out.print(polinom);
		System.out.println(" fuggvenytablazata:");
		System.out.printf("  x\t    y\n");
		
		for (double i = 0; i <= 1; i += 0.1) {
			//System.out.println(i + "\t" + polinom.szamol(i));
			System.out.printf("%4.1f\t%7.2f\n", 
					 i,  polinom.szamol(i));
		}
	}

	public static void main(String[] args) {
		int polinomokSzama = 5;

		//LinearisPolinom polinomTomb[] =
		LinearisPolinom[] polinomTomb =
				new LinearisPolinom[polinomokSzama];
		
		Scanner beolvasas = new Scanner(System.in);

		for(int i = 0; i < polinomTomb.length; i++) {
			System.out.println("Kerem a(z) " 
					+ (i + 1) + ". polinom elso egyutthatojat: ");

			double a = beolvasas.nextDouble(); beolvasas.nextLine();

			System.out.println("Kerem a(z) "
					+ (i + 1) + ". polinom masodik egyutthatojat: ");

			double b = beolvasas.nextDouble(); beolvasas.nextLine();

			polinomTomb[i] = new LinearisPolinom(a, b);
		}

		System.out.println();
		System.out.println("A polinomok:");
		
//		for(int i = 0; i < polinomTomb.length; i++) {
//			System.out.println(polinomTomb[i]);
//		}
		
		for (LinearisPolinom linearisPolinom : polinomTomb) {
			System.out.println(linearisPolinom);
		}
		
		//fuggvenyTablazat(polinomTomb[polinomokSzama - 1]);
		fuggvenyTablazat(polinomTomb[polinomTomb.length - 1]);
		
		beolvasas.close();

	}

}
