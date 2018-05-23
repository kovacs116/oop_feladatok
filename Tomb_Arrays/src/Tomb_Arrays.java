import java.util.Arrays;

public class Tomb_Arrays {
	public static void main(String[] args) {
/*
A java.util csomagban defini�lt Arrays oszt�ly met�dusaival
k�nyelmesen kezelhet�k a t�mb�k.
P�ld�ul:
- t�mb rendez�se (nem ad vissza �rt�ket): java.util.Arrays.sort(myArray);
- bin�ris keres�s t�mbben (a megtal�lt elem index�t adja vissza):
java.util.Arrays.binarySearch(myArray, searchKey);
- k�t t�mbben az elemek azonoss�g�nak a vizsg�lata (boolean-el t�r vissza):
java.util.Arrays.equals(array1, array2);

Pr�b�lja ki a met�dusokat int, double �s char t�mb�k�n!
 */
		int meret = 5, maxertek = 50;
		char keresendo_elem = 'c';
		int[] egesztomb = new int[meret];
		double[] valostomb = new double[meret];
		double[] valostomb2 = new double[meret];
		char[] karaktertomb = new char[meret];
		
		for (int i = 0; i < meret; i++) {
			egesztomb[i] = (int)(Math.random() * maxertek);
			valostomb[i] = Math.random() * maxertek;
			valostomb2[i] = valostomb[i];
			karaktertomb[i] = (char)('a' + i); 
		}
		
		Arrays.sort(egesztomb);
		System.out.println("A sorbarendezett egesz tomb elemei:");
		for (int i : egesztomb) {
			System.out.println(i);
		}
		
		System.out.println("Az 1. valos tomb elemei:");
		for (double d : valostomb) {
			System.out.println(d);
		}
		
		System.out.println("A ket valos tomb megegyezik?"); 
		System.out.println(Arrays.equals(valostomb, valostomb2));
		System.out.println("A ket valos tomb ugyanoda hivatkozik?");
		System.out.println(valostomb.equals(valostomb2));
		
		System.out.println("A " + keresendo_elem + " karakter indexe a karaktertombben:");
		System.out.println(Arrays.binarySearch(karaktertomb, keresendo_elem));

	}
}
