/*
K�sz�tsen egy Hanglemez oszt�lyt, melynek adattagjai az el�ad�, a c�m �s a hossz (eg�sz)!
- �rjon konstruktort, amely a param�terk�nt kapott �rt�kekkel inicializ�lja az adattagokat!
- �rjon met�dust, amely egy String-ben �sszef�zve adja vissza a lemez adatait
a k�vetkez� alakban "El�d�: Cim, hossz perc"!
- �rjon met�dust, amely 1-t ad vissza, ha a lemez hosszabb,
mint a param�terk�nt kapott lemez,
-1-et ad vissza, ha a param�terk�nt kapott a hosszabb
�s 0-t ad, ha egyforma hossz�ak!
- �rjon met�dust, amely param�terk�nt egy el�ad�t kap (String)
�s igazat ad, ha a lemeznek � az el�ad�ja!
(A String-ek tartalmi egyez�s�g�nek vizsg�lat�ra haszn�lja
a String oszt�ly equals() vagy equalsIgnoreCase() met�dus�t!)
- Az adattagok �rt�k�nek lek�rdez�s�re �rjon getter met�dusokat!
 */
public class Hanglemez {
	private String eloado;
	private String cim;
	private int hossz;

	//konstruktor
	public Hanglemez(String eloado, String cim, int hossz) {
		this.eloado = eloado;
		this.cim = cim;
		this.hossz = hossz;
	}

	public String toString() {
		return eloado + ": " + cim + ", " + hossz + " perc";
	}

	public short hosszabbMint(Hanglemez masikLemez) {
		if (hossz > masikLemez.hossz)
			return 1;
		else if (masikLemez.hossz > hossz) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean eloado(String eloado) {
		//a kis- es nagybetu kulonbozik
		return this.eloado.equals(eloado);
		//nincs kis- es nagybetuerzekenyseg
		//return this.eloado.equalsIgnoreCase(eloado);
	}

	public String getEloado() {
		return eloado;
	}

	public String getCim() {
		return cim;
	}

	public int getHossz() {
		return hossz;
	}	
}
