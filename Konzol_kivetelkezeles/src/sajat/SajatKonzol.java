/*
K�sz�tsen a sajat csomagban SajatKonzol oszt�lyt,
amelynek van egy
public static int egeszSzamotBeolvas(String uzenet)
met�dusa, amelyben beolvas a konzolr�l a Scanner oszt�ly
nextLine() met�dus�val egy eg�sz sz�mot,
de ha NumberFormatException mer�l fel az �talak�t�s sor�n,
akkor ki�r egy �zenetet, majd �jra k�ri a sz�mot!

Eg�sz�ts�k ki egy double sz�mot beolvas� met�dussal,
amely hasonl�an m�k�dik, mint az eg�szet beolvas�,
de most a beolvas�shoz haszn�lja a Console oszt�lyt
�s dobjon NemTamogatottConsoleException-t,
ha a Console nem t�mogatott!
*/
package sajat;

import java.io.Console;
import java.util.Scanner;
import kivetelek.NemTamogatottConsoleException;

public class SajatKonzol {
	public static int egeszSzamotBeolvas(String uzenet) {
		int egeszSzam = 0;
		boolean rosszBeolvasas = true;

		@SuppressWarnings("resource")
		Scanner beolvasas = new Scanner(System.in);

		do {
			try {
				System.out.println("Kerek egy egesz szamot!");
				System.out.print("szam:");
				
				String szamString = beolvasas.nextLine();
				egeszSzam = Integer.parseInt(szamString);

				rosszBeolvasas = false;
			}
			catch (NumberFormatException kivetel) {
				System.out.println(uzenet);
			}
		} while (rosszBeolvasas);

		return egeszSzam;
	}

	//Eg�sz�ts�k ki egy double sz�mot beolvas� met�dussal,
	//amely hasonl�an m�k�dik mint az eg�szet beolvas� met�dus,
	//de most a beolvas�shoz haszn�lja a Console oszt�lyt,
	//�s dobjon NemTamogatottConsoleException-t, ha a Console nem t�mogatott!
	public static double valosSzamotBeolvas(String uzenet) {
		double valosSzam;
		Console konzol;

		try {
        	konzol = System.console();
			
			if (konzol == null)
				throw new NemTamogatottConsoleException();
			
			do {
				try {
					System.out.println("Kerek egy valos szamot!");
					
					String szamString = konzol.readLine("szam:");				
					valosSzam = Double.parseDouble(szamString);
					
					return valosSzam;
				}
				catch (java.lang.NumberFormatException kivetel) {
					System.out.println(uzenet);
				} 
			} while (true);
		} 
		catch (NemTamogatottConsoleException sajatKivetel) {
			System.out.println(sajatKivetel.getMessage());
			throw new RuntimeException();
		}

	}

	
	public static double valosSzamotBeolvas2(String uzenet) {
		double valosSzam;
		Console konzol;

        konzol = System.console();
			
		do {
			try {
				System.out.println("Kerek egy valos szamot!");
					
				String szamString = konzol.readLine("szam:");				
				valosSzam = Double.parseDouble(szamString);
					
				return valosSzam;
			}
			catch (java.lang.NumberFormatException kivetel) {
				System.out.println(uzenet);
			}				
			catch (NullPointerException kivetel) {
				
				System.out.println("Nincs konzol objektum!");
				try {
					throw new NemTamogatottConsoleException();
				} catch (NemTamogatottConsoleException e) {
					//System.out.println(kivetel.getMessage());
					//e.printStackTrace();
					throw new RuntimeException();
				}
			}				
		} while (true); 

	}
	
}
