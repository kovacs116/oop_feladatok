/*
K�sz�tsen egy futtathat� oszt�lyt,
amelyben l�trehoz 10 darab T�glalap t�pus� objektumot �s
elt�rolja a referenci�jukat egy t�mbben,
v�letlenszer�en gener�lva az oldalaikat a 2-10 tartom�nyban!
- �rja ki az �sszes t�glalap adatait String-be �sszef�zve!
- �rja ki a legkisebb ter�let� t�glalap adatait!
- Hozzon l�tre egy �j t�glalapot, amelynek az adatait beolvassa!
Sz�molja meg az ett�l kisebb ter�let� t�glalapokat!
- �rja ki az els� olyan t�glalapnak az index�t,
amelynek az oldalai megegyeznek a beolvasott t�glalap�val,
vagy ha nincs ilyen, akkor azt hogy "nincs egyez�"! 
 */
import java.util.Scanner;

public class Teglalapok {
	public static void main(String[] args) {
		int meret = 10;
		int min_teruletu_indexe = 0;
		int kisebb_teruletu_teglalapok_szama = 0;
		int egyezo_oldalu_indexe = -1;
		
		Teglalap teglalaptomb[] = new Teglalap[meret];
		//Teglalap[] teglalaptomb = new Teglalap[meret];
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			int a_oldal = (int)(Math.random() * 9) + 2;
			int b_oldal = (int)(Math.random() * 9) + 2;
					
			teglalaptomb[i] = new Teglalap(a_oldal, b_oldal);
		}

		System.out.println("A teglalapok adatai:");
	
		/*
		for (int i = 0; i < teglalaptomb.length; i++) {
			System.out.println(teglalaptomb[i]);
		}
		*/
		
		for (Teglalap teglalap : teglalaptomb) {
			System.out.println(teglalap);
		}		
		
		/*
		for (int i = 1; i < teglalaptomb.length; i++) {
			if (teglalaptomb[i].terulet() < teglalaptomb[min_teruletu_indexe].terulet())
				min_teruletu_indexe = i;			
		}
		*/
		for (int i = 1; i < teglalaptomb.length; i++) {
			if (teglalaptomb[min_teruletu_indexe].nagyobbTeruletuMint(teglalaptomb[i]))
				min_teruletu_indexe = i;			
		}

		System.out.println();
		System.out.println("A legkisebb teruletu teglalap adatai:");
        System.out.println(teglalaptomb[min_teruletu_indexe]);

        Scanner beolvasas = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Kerem adja meg az a oldal erteket!");
        System.out.print("a oldal:");
        int a_oldal = beolvasas.nextInt();
        System.out.println("Kerem adja meg a b oldal erteket!");
        System.out.print("b oldal:");
        int b_oldal = beolvasas.nextInt();
        
        Teglalap teglalap = new Teglalap(a_oldal, b_oldal);

        for (int i = 0; i < teglalaptomb.length; i++) {
			if (teglalap.nagyobbTeruletuMint(teglalaptomb[i])) {
				kisebb_teruletu_teglalapok_szama++;
			}			
		}
        
        System.out.println();
        System.out.println("A kisebb teruletu teglalapok szama:");
        System.out.println(kisebb_teruletu_teglalapok_szama);

        for (int i = 0; i < teglalaptomb.length; i++) {
			if (teglalaptomb[i].egyenloE(teglalap)) {
				egyezo_oldalu_indexe = i;
				break;
			}
		}
		
        System.out.println();
        if (egyezo_oldalu_indexe != -1) {
			System.out.println("A(z) " + egyezo_oldalu_indexe 
					+ ". indexuvel megegyeznek az oldalai.");
		} else {
			System.out.println("Nincs egyezo teglalap.");
		}

		beolvasas.close();	
	}
}
