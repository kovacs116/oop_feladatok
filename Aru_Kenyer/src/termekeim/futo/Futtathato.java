/*
a) K�sz�tsen egy futtathat� oszt�lyt a termekeim alcsomagj�ban!
Ebben hozzon l�tre egy �ru �s egy Keny�r objektumot!
�rja ki az adataikat, �s hasonl�tsa �ssze az �rukat!
 */
package termekeim.futo;

//import termekeim.Aru;
//import termekeim.Kenyer;
import termekeim.*;


public class Futtathato {

	public static void main(String[] args) {
		Aru aru_objektum = new Aru("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		
		System.out.println("A termekek adatai:");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		System.out.println();		
		
		//int melyik_dragabb = kenyer_objektum.dragabb_e(aru_objektum);
		int melyik_dragabb = aru_objektum.dragabb_e(kenyer_objektum);
         
		if (melyik_dragabb > 0) {
			System.out.println("aru a dragabb\n" + aru_objektum);
		}
		else if (melyik_dragabb < 0) {
			System.out.println("kenyer a dragabb\n" + kenyer_objektum);
		}
		else {
			System.out.println("egyforma a brutto aruk\n");
		}
		
		//switch (kenyer_objektum.dragabb_e(aru_objektum)) {
		switch (aru_objektum.dragabb_e(kenyer_objektum)) {		
			case 1:
				System.out.println("aru a dragabb");
				break;
	
			case -1:
				System.out.println("kenyer a dragabb");
				break;
				
			case 0:
				System.out.println("egyforma a brutto aruk");
				break;
				
			default:
				break;
		}
		
		System.out.println();
		
/*
b) Hozzon l�tre m�g egy Keny�r t�pus� objektumot,
de ennek a referenci�j�t egy �ru t�pus� v�ltoz�ban t�rolja (neve: aru2)!
Pr�b�lja ki, hogy az "aru2" referenci�ra megh�vva
milyen eredm�nyt ad a toString met�dus!
Meg tudja-e h�vni ezen a referenci�n kereszt�l
a Keny�r mennyis�g�t visszaad� met�dust?
 */
		Aru aru2 = new Kenyer("kenyer2", 210, 15, 1);
		//Kenyer aru3 = new Aru("kenyer3", 210, 15);//error
		
		System.out.println("aru2.toString() eredmenye:");
		System.out.println(aru2);
		
		//System.out.println(aru2.getMennyiseg());//hiba
		System.out.println(((Kenyer) aru2).getMennyiseg());
		//System.out.println(((Kenyer) aru_objektum).getMennyiseg());//ClassCastException		

/*
c) Hozzon l�tre m�g egy Keny�r p�ld�nyt (neve: kenyer2)
�s a "aru2" referenci�val hivatkozott m�sik Keny�rrel
�sszehasonl�tva a nagyobb egys�g�r�t kell ki�rni
(konvert�l�sra lesz sz�ks�g)!
 */
		Kenyer kenyer2 = new Kenyer("kenyer3", 110, 15, .5);
		
		System.out.println("\nelso_kenyer_nagyobb_egysegaru() eredmenye:");
		//System.out.println(kenyer2.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2));
		System.out.println(Kenyer.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2));			
		
		System.out.println("\nA nagyobb egysegaru:");
		if (Kenyer.elso_kenyer_nagyobb_egysegaru((Kenyer)aru2, kenyer2)) {
			System.out.println(aru2);
		}
		else {
			System.out.println(kenyer2);
		}
		
	}

}
