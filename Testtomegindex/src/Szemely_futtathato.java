
//K�sz�tsen egy futtathat� oszt�lyt,
//amelyben beolvassa egy szem�ly adatait �s ki�rja!

import java.util.Scanner;

public class Szemely_futtathato {

	public static void main(String[] args) {

		Scanner adatBekeres = new Scanner(System.in);
		// java.util.Scanner adatBekeres = new java.util.Scanner(System.in);

		System.out.println("K�rem adja meg a nevet!\nn�v:");
		String nev = adatBekeres.nextLine();

		System.out.println("K�rem adja meg a testt�meget!\ntestt�meg [kg]:");
		String testtomeg = adatBekeres.nextLine();

		System.out.println("K�rem adja meg a magass�got!\nmagass�g [m]:");
		String magassag = adatBekeres.nextLine();

		int egeszTomeg = Integer.parseInt(testtomeg);
		double valosMagassag = Double.parseDouble(magassag);

		Szemely szemely = new Szemely();
		szemely.setNev(nev);
		szemely.setTesttomeg(egeszTomeg);
		szemely.setMagassag(valosMagassag);

		System.out.println(szemely);
		
		System.out.println("M�dos�tott index:");
		System.out.println(szemely.modositott_testTomegIndex());
		
		adatBekeres.close();
	}
	
}
