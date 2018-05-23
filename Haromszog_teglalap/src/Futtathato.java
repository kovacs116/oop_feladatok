/*
K�sz�tsen hozz� kipr�b�l� oszt�lyt!
Deklar�ljon 2 db 10 elem� s�kidom t�mb�t!
Az egyikben h�romsz�geket,
a m�sikban t�glalapokat t�roljon!

Az objektumok l�trehoz�s�hoz haszn�lt �rt�keket
v�letlenszer�en �ll�tsa el�!

Ha egy el��ll�tott sz�mh�rmas, ill. sz�mp�r nem felel meg
a szab�lyoknak, �j �rt�keket �ll�tson el�!

K�sz�tsen statisztik�t a t�mb�k felt�lt�s�r�l:
l�p�sek sz�ma, el��llt kiv�telek!
V�g�l irassa ki a felt�lt�tt t�mb�k tartalm�t!
 */

import java.util.Random;

public class Futtathato {

	public static void main(String[] args) {
		int meret = 10;
		Sikidom[] haromszogTomb = new Sikidom[meret];
		Sikidom[] teglalapTomb = new Sikidom[meret];
		
		Random veletlenObjektum = new Random();
		int haromszogLepesekSzama = 0;
		int teglalapLepesekSzama = 0;
		int haromszogEloalltKivetelekSzama = 0;
		int teglalapEloalltKivetelekSzama = 0;
		
		for (int i = 0; i < meret; i++) {
			boolean rosszAdat = true;
			
			do {
				try {
					haromszogTomb[i] = new Haromszog(veletlenObjektum.nextDouble() * 10,
							veletlenObjektum.nextDouble() * 10, veletlenObjektum.nextDouble() * 10);
					rosszAdat = false;
				} catch (IllegalArgumentException e) {
					//System.out.println("rossz szamharmas");
					haromszogEloalltKivetelekSzama++;
				}
				haromszogLepesekSzama++;
			} while (rosszAdat);

			rosszAdat = true;
			
			do {
				try {
					teglalapTomb[i] = new Teglalap(veletlenObjektum.nextDouble() * 10,
							veletlenObjektum.nextDouble() * 10);
					rosszAdat = false;
				} catch (IllegalArgumentException e) {
					//System.out.println("rossz szampar");
					teglalapEloalltKivetelekSzama++;
				}
				teglalapLepesekSzama++;
			} while (rosszAdat);
		
		}
		
		System.out.println("Haromszognel a lepesek szama:");
		System.out.println(haromszogLepesekSzama);
		System.out.println("Haromszognel az eloallt kivtelek szama:");
		System.out.println(haromszogEloalltKivetelekSzama);
		System.out.println("Teglalapnal a lepesek szama:");
		System.out.println(teglalapLepesekSzama);
		System.out.println("Teglalapnal az eloallt kivtelek szama:");
		System.out.println(teglalapEloalltKivetelekSzama);
		
		

		System.out.println("A haromszogek adatai:");
		for (Sikidom sikidom : haromszogTomb) {
			System.out.println(sikidom);
		}

		System.out.println("A teglalapok adatai:");
		for (Sikidom sikidom : teglalapTomb) {
			System.out.println(sikidom);
		}
	
	}

}
