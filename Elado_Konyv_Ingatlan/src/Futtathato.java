/*
K�sz�tsen egy futtathat� oszt�lyt,
amelyben egy IElado t�pus� referenci�nak 
Ingatlan p�ld�nyt ad �rt�k�l,
ki�rja az adatait,
majd �tsz�m�tja az �r�t eur�ra 
�s �jra ki�rja az adatait!
Ugyanezt pr�b�lja ki egy K�nyv objektummal is!
 */
public class Futtathato {
	public static void main(String[] args) {
		int euroarfolyam = 311;
		IElado ingatlan = new Ingatlan(500000, "Ft", 50, "Miskolc");

		System.out.println(ingatlan);
		((Ingatlan)ingatlan).atvaltEurora(euroarfolyam);;
		System.out.println(ingatlan);

		IElado konyv = new Konyv("Cim", "Szerzo", 3500, 250);
		System.out.println(konyv);
		//konyv.setAr(((Konyv)konyv).brutto_ar() / euroarfolyam, "EUR");
		konyv.setAr(((Aru)konyv).brutto_ar() / euroarfolyam, "EUR");
		System.out.println(konyv);
	}
	
}
