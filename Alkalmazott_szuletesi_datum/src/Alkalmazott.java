/*
M�dos�tsa az Alkalmazott oszt�ly (5_1_Alkalmazott)
defin�ci�j�t �gy, hogy ne az alkalmazott kor�t,
hanem a sz�let�si d�tum�t t�roljuk!
 */
import java.time.LocalDate;

public class Alkalmazott {

	private String nev;
	//Java 8
	private LocalDate szuletes_napja;
	private long fizetes;
	
	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int szuletesi_ev, int szuletesi_honap, int szuletesi_nap, long fizetes) {
		this.nev = nev;
		this.szuletes_napja = LocalDate.of(szuletesi_ev, szuletesi_honap, szuletesi_nap); 
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int szuletesi_ev, int szuletesi_honap, int szuletesi_nap) {
		this.nev = nev;
		this.szuletes_napja = LocalDate.of(szuletesi_ev, szuletesi_honap, szuletesi_nap);
		this.fizetes = 10000 * kor();
	}
	
	public int kor() {
		LocalDate mai_datum = LocalDate.now();
		return mai_datum.getYear() - szuletes_napja.getYear();  
		
	}
	
	public int hanyEvVanHatraANyugdijig() {
		return nyugdijkorhatar - kor();
	}

	//K�sz�tsen egy met�dust, amely String-be �sszef�zve ki�rja
	//az Alkalmazott nev�t, kor�t �s a sz�let�snapj�t!
	public String szuletesnap() {
		return nev + ", " + kor() + ": "
				//+ szuletes_napja.getMonth().name()
				//+ honap_neve(szuletes_napja.getMonth().name())
				+ honap_neve(szuletes_napja.getMonthValue())
				+ " "
				+ szuletes_napja.getDayOfMonth()
				+ ".";
	}
	
	 //�rjon konverzi�s met�dust,
	//amely a h�nap sorsz�m�nak ismeret�ben
	//visszaadja a magyar h�napnevet!
	public String honap_neve(int honap_szama) {
		String magyarhonapok[] = {"janu�r", "febru�r", "m�rcius", "�prilis",
								"m�jus", "j�nius", "j�lius", "augusztus",
								"szeptember", "okt�ber", "november", "december"};
		
		return magyarhonapok[honap_szama - 1];
	}

	public String honap_neve(String angol_honapnev) {
		String magyarhonapok[] = {"janu�r", "febru�r", "m�rcius", "�prilis",
								"m�jus", "j�nius", "j�lius", "augusztus",
								"szeptember", "okt�ber", "november", "december"};
	    String angolhonapok[] = {"JANUARY", "FEBRUARY", "MARCH", "APRIL",
	    						"MAY", "JUNE", "JULY", "AUGUST",
	    						"SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

	    for (int i = 0; i < angolhonapok.length; i++) {
			if (angolhonapok[i].equals(angol_honapnev)) {
				return magyarhonapok[i];
			}
		}

	    return "hibas angol honapnep";	
	}
	
	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev 
				+ ", kor=" + kor()
				+ ", fizetes=" + fizetes 
				+ ", evek szama nyugdijig="
				+ hanyEvVanHatraANyugdijig() + "]";
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}	
	
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static Alkalmazott tobbEveVanHatraNyugdijig(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.hanyEvVanHatraANyugdijig() >
			masodikAlkalmazott.hanyEvVanHatraANyugdijig()) {
			return elsoAlkalmazott;
		} else {
			return masodikAlkalmazott;
		}
	}
	
}
