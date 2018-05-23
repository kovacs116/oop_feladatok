import java.util.Scanner;

public class Masodfoku_egyenlet {
	public static void main(String[] args) {
		/*
		�rja meg a m�sodfok� egyenlet val�s gy�keit meghat�roz� Java programot!
		A m�sodfok� egyenlet konstansait a felhaszn�l� adja meg.
		Beolvas�shoz haszn�lja a Scanner oszt�lyt,
		a sz�m�t�shoz pedig a Math oszt�ly sqrt() met�dus�t,
		amely egy double t�pus� argumentumot v�r �s double �rt�ket ad vissza!
		Az els� feladathoz hasonl�an
		- k�rje be egyenk�nt a 3 sz�mot,
		- majd egyetlen sztringk�nt, ahol vessz�vel v�lasztja el a sz�mokat.
		 */
		
		Scanner bemenet = new Scanner(System.in);
		
		//pelda egyutthatokra
		//1 -1 -2
		//1 2 1
		//a masodfoku egyenlet konstansai 
		double a, b, c;
		//a masodfoku egyenlet valos gyokei
		double x1 = 0, x2 = 0;
		
		int megoldasok_szama;
		double diszkriminans;
		
		/*
		System.out.println("Kerem adja meg az egyutthatokat!\na=");
		a = bemenet.nextDouble();
		System.out.println("b=");
		b = bemenet.nextDouble();
		System.out.println("c=");
		c = bemenet.nextDouble();
		*/
		System.out.println("Kerem adja meg az egyutthatokat vesszovel elvalasztva!");
		System.out.print("egyutthatok=");
		String egyutthatok = bemenet.nextLine();
		
		String eredmenytomb[] = egyutthatok.split(",");
		
		a = Double.parseDouble(eredmenytomb[0]);
		b = Double.parseDouble(eredmenytomb[1]);
		c = Double.parseDouble(eredmenytomb[2]);		

		if (a == 0) {
			megoldasok_szama = 0;
		}
		else {
			x2 = 2 * a;
			diszkriminans = b * b - 4 * a * c;

			if (diszkriminans > 0) {
				diszkriminans = Math.sqrt(diszkriminans);
				x1 = (-b + diszkriminans) / x2;
				x2 = (-b - diszkriminans) / x2;
				megoldasok_szama = 2;
			}
			else if (diszkriminans == 0) {
				x1 = -b / x2;
				megoldasok_szama = 1;
			}
			else {
				megoldasok_szama = 0;
			}			
		}		
		
		switch(megoldasok_szama)
		{
			case 2:
				System.out.println("2 megoldas van.");
				System.out.println("x1= " + x1 + ", x2= " + x2);
				break;

			case 1:
				System.out.println("1 megoldas van.\nx= " + x1);
				break;

			default:
				System.out.println("Nincs megoldas a valos szamok halmazan.");
		}
		
		bemenet.close();
	}
}
