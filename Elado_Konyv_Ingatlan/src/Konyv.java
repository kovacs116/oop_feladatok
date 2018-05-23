// A K�nyv oszt�ly pedig az �ru lesz�rmazottja.
import java.time.LocalDate;

public class Konyv extends Aru {
	private String cim;
	private String szerzo;
	//modositas konstanssa, final modosito hozzaadasa
	private final int megjelenes_eve;
	private int oldalszam;
	//osztalyszintu adattag
	private static String kiado = "Mora Kiado";

	public Konyv(String cim, String szerzo, int ar, int oldalszam) {
		super("konyv", ar, 27);
		this.cim = cim;
		this.szerzo = szerzo;
		this.megjelenes_eve = LocalDate.now().getYear();
		this.oldalszam = oldalszam;
	}

	public Konyv(String cim, String szerzo, int oldalszam) {
		this(cim, szerzo, 2500, oldalszam);
	}	
	
	@Override
	public String toString() {
		return szerzo + ": " + cim 
				+ " (" 
				+ kiado 
				+ ", " 
				+ megjelenes_eve 
				+ ", " 
				+ oldalszam
				+ " old., "
				+ getAr()
				+ ")";
	}

	public String getCim() {
		return cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public int getMegjelenes_eve() {
		return megjelenes_eve;
	}
	
	//�rjon met�dust, amely igazat ad, ha a k�nyv c�me megegyezik
	//a param�terk�nt kapott k�nyv c�m�vel, hamisat ha nem!
	public boolean cimEgyezikE(Konyv masikKonyv) {
		return cim.equals(masikKonyv.cim);
	}
	
	//�rjon met�dust, amely k�t param�terk�nt kapott k�nyv k�z�l a hosszabbat adja vissza!
	public static Konyv hosszabbKonyv(Konyv egyik_konyv, Konyv masik_konyv) {
		if (egyik_konyv.oldalszam > masik_konyv.oldalszam) {
			return egyik_konyv;
		} else {
			return masik_konyv;
		}
	}
	
	//�rjon met�dust, amely igazat ad vissza, ha a k�nyv oldalsz�ma p�ros!
	public boolean oldalszamParosE() {
		return oldalszam % 2 == 0;
	}
}