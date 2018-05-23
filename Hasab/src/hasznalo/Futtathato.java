/*
K�sz�tsen ugyanebben a csomagban futtathat� oszt�lyt,
amelyben l�trehoz egy 5 elem� has�bt�mb objektumot!

A t�mb elemeinek adjon �rt�ket �gy,
hogy legyen null �rt�k� t�mbelem is!
K�t henger �s egy t�glatest adatait olvassa be!

�rja ki az �sszes has�b adat�t,
majd a has�bok �tlagos t�rfogat�t,
�s a hengerek sz�m�t!
 */
package hasznalo;

import geometria.*;

public class Futtathato {

	public static void main(String[] args) {
		Hasabok hasabtomb = new Hasabok(5);

		Hasab henger1 = new Henger(1, 2);
		Hasab henger2 = new Henger(3, 4);
		Hasab teglatest = new Teglatest(1, 2, 3);

		//hasabtomb.setHasab(0, new Henger(1, 2));
		hasabtomb.setHasab(0, henger1);
		hasabtomb.setHasab(1, henger2);
		hasabtomb.setHasab(2, teglatest);

		System.out.println("A hasabok adatai:");
		//for (int i = 0; i < hasabtomb.nemNullHasab(); i++) {
		for (int i = 0; i < hasabtomb.meret(); i++) {	
			System.out.println(hasabtomb.getHasab(i));
		}

		System.out.printf("\nA hasabok atlagos terfogata: %.2f\n",
				hasabtomb.atlagosTerfogat());
		System.out.println("A hengerek szama: "
				+ hasabtomb.hengerekSzama());
	}

}
