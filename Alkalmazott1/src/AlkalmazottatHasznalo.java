/*
Az Alkalmazott oszt�lyt haszn�l� oszt�lyban
egy main met�dus van, amelyben l�trehozunk egy
Alkalmazott objektumot: �rt�ket adunk a tagjainak,
ki�rjuk az adatait, megemelj�k a fizet�s�t �s �jra
ki�rjuk az adatait.
 
 */
public class AlkalmazottatHasznalo {

	public static void main(String[] args) {
		//Alkalmazott alkalmazottObjektum = new Alkalmazott();
		Alkalmazott alkalmazott = new Alkalmazott();
		
		//csak felnyilvanos adattagok eseten mukodik
		//alkalmazott.nev = "Nagy Norbert";
		//alkalmazott.fizetes = 42;

		alkalmazott.setNev("Nagy Norbert");
		alkalmazott.setFizetes(42);
		
		//System.out.println(alkalmazott.toString());
		//ugyanaz, mint
		System.out.println(alkalmazott);		
		
		alkalmazott.fizetestNovel(10);
		
		System.out.println(alkalmazott);
		
		System.out.println();
		System.out.println("Fiezetes intervallumok kozott van?");
		System.out.println(alkalmazott.fizetesIntervallumokKozott(30, 100));
		
		System.out.println("Fizetendo ado:");
		System.out.println(alkalmazott.fizetendoAdo());
		//System.out.println(alkalmazott.fizetendoAdo(16));
		
		Alkalmazott masik_alkalmazott = new Alkalmazott();

		masik_alkalmazott.setNev("Kiss Klaudia");
		masik_alkalmazott.setFizetes(60);
		
		System.out.println("Fizetes nagyobb, mint");
		System.out.println(alkalmazott.fizetesNagyobbMint(masik_alkalmazott));
		System.out.println(masik_alkalmazott.fizetesNagyobbMint(alkalmazott));
		System.out.println();

/*
d) Az Alkalmazott oszt�lyt haszn�l� oszt�lyban deklar�ljunk
�s t�lts�nk fel adatokkal egy Alkalmazottakb�l �ll� t�mb�t!
- �llap�tsuk meg, hogy kinek a legmagasabb a fizet�se!
- Sz�moljuk meg, hogy h�ny alkalmazott fizet�se esik egy megadott intervallumba!
- Sz�m�tsuk ki az alkalmazottak �tlagfizet�s�t!
- Sz�m�tsuk ki az alkalmazottak �ltal befizetett ad� �ssz�rt�k�t! 		
 */			
		//objektumtomb
		Alkalmazott[] alkalmazottak = new Alkalmazott[10];
		
		System.out.println("Az alkalmazottak:");
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setFizetes((long)(Math.random() * 100));
			String nev =  nagybetu() + "" + nagybetu();
			alkalmazottak[i].setNev(nev);
			//System.out.println(alkalmazottak[i]);
		}
		
		//foreach
		for (Alkalmazott alkalmazott_objektum : alkalmazottak) {
			System.out.println(alkalmazott_objektum);
		}
				
		//�llap�tsuk meg, hogy kinek a legmagasabb a fizet�se!
		int legnagyobbfizetesu = 0;
		for (int i = 1; i < alkalmazottak.length; i++) {
			if (alkalmazottak[i].getFizetes() > alkalmazottak[legnagyobbfizetesu].getFizetes()) {
				legnagyobbfizetesu = i;
			}
		}
		
		System.out.println();
		System.out.println("A legnagyobb fizetesu alkalmazott:");
		System.out.println(alkalmazottak[legnagyobbfizetesu]);
		
		//Sz�moljuk meg, hogy h�ny alkalmazott fizet�se esik egy megadott intervallumba!
		int adott_intervallumba_eso_alkalmazottak_szama = 0;

		/*
		for (int i = 0; i < alkalmazottak.length; i++) {
			if (alkalmazottak[i].fizetesIntervallumokKozott(20, 60)) {
				adott_intervallumba_eso_alkalmazottak_szama++;
			}			
		}
		*/
		
		for (Alkalmazott alkalmazott_objektum : alkalmazottak) {
			if (alkalmazott_objektum.fizetesIntervallumokKozott(20, 60)) {
				adott_intervallumba_eso_alkalmazottak_szama++;
			}			
		}
		
		System.out.println();
		System.out.print("Adott intervallumba eso alkalmazottak szama: ");
		System.out.println(adott_intervallumba_eso_alkalmazottak_szama);
		
		//Sz�m�tsuk ki az alkalmazottak �tlagfizet�s�t!
		double atlag = 0;
		
		/*
		for (int i = 0; i < alkalmazottak.length; i++) {
			atlag += alkalmazottak[i].getFizetes();			
		}
		*/
		
		for (Alkalmazott alkalmazott_objektum : alkalmazottak) {
			atlag += alkalmazott_objektum.getFizetes();
		}
		
		System.out.println();
		System.out.print("Az alkalmazottak atgafizetese: ");
		System.out.print(atlag / alkalmazottak.length);
		System.out.println(" Ft");
		
		//Sz�m�tsuk ki az alkalmazottak �ltal befizetett ad� �ssz�rt�k�t!
		double befizetett_osszado = 0;
		
		/*
		for (int i = 0; i < alkalmazottak.length; i++) {
			befizetett_osszado += alkalmazottak[i].fizetendoAdo();			
		}
		*/
		
		for (Alkalmazott alkalmazott_objektum : alkalmazottak) {
			befizetett_osszado += alkalmazott_objektum.fizetendoAdo();
		}
		
		System.out.println();
		System.out.print("Az alkalmazottak altal befizetett ado osszerteke: ");
		System.out.println(befizetett_osszado + " Ft");
	}
	
	public static char nagybetu() {
		return (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
	}

}
