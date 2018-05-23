/*
Alcsomagban k�sz�tsen futtathat� oszt�lyt,
amelyben l�trehoz egy hengert majd ki�rja az adatait
�s a t�rfogat�t!
Hozzon l�tre egy t�glatestet,
�rja ki az adatait �s a t�rfogat�t,
majd azt hogy melyik a nagyobb t�rfogat�!
 */
package geometria.proba;

import geometria.Henger;
import geometria.Teglatest;

public class HengerProba {

	public static void main(String[] args) {
		Henger henger = new Henger(6, 7);

		System.out.println("A henger adatai:\n" + henger);
		System.out.println("A henger terfogata:\n" + henger.terfogat());

		Teglatest teglatest = new Teglatest(2, 3, 5);

		System.out.println("A t�glatest adatai:\n" + teglatest);
		System.out.println("A t�glatest t�rfogata:\n" + teglatest.terfogat());

		System.out.println("henger.nagyobbTerfogatuMint(teglatest)");
		System.out.println(henger.nagyobbTerfogatuMint(teglatest));
		System.out.println("teglatest.nagyobbTerfogatuMint(henger)");
		System.out.println(teglatest.nagyobbTerfogatuMint(henger));

		if (henger.nagyobbTerfogatuMint(teglatest)) {
			System.out.println("A henger nagyobb terfogatu.");
		} else if (teglatest.nagyobbTerfogatuMint(henger)) {
			System.out.println("A teglatest nagyobb terfogatu");
		} else {
			System.out.println("Egyforma terfogatu a 2 test.");
		}
	}

}
