/*
K�sz�tsen egy T�glalap oszt�lyt k�t adattaggal az oldalak t�rol�s�hoz (eg�szek)!
- �rjon konstruktort, amely k�t param�terk�nt kapott �rt�kkel inicializ�l!
- �rjon konstruktort, amely, amely egy param�terk�nt kapott �rt�kkel inicializ�lja
mindk�t adattagot (n�gyzet)!
- �rjon met�dust, amely visszaadja a ter�letet!
- �rjon met�dust, amely egy String-be �sszef�zve adja vissza a t�glalap adatait
a k�vetkez� alakban: "a_oldal, b_oldal: ter�let"!
- �rjon setter met�dust, amely be�ll�tja a t�glalap oldalait a param�terk�nt kapott k�t �rt�kkel!
- �rjon setter met�dust, amely be�ll�tja a t�glalap oldalait a param�terk�nt kapott egyetlen
�rt�ket adva mindk�t oldalnak!
- �rjon met�dust, amely igazat ad, ha a t�glalap nagyobb ter�let�,
mint a param�terk�nt kapott t�glalap, hamisat ad ha nem!
- �rjon met�dust, amely igazat ad, ha a t�glalap oldalai megegyeznek
a param�terk�nt kapott t�glalap oldalaival, hamisat ha nem!
 */
public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	
	public Teglalap(int a_oldal, int b_oldal) {
		//this.a_oldal = a_oldal;
		//this.b_oldal = b_oldal;
		setOldal(a_oldal, b_oldal);
	}
	
	public Teglalap(int oldalhossz) {
		//this.a_oldal = b_oldal = oldalhossz;
		//setOldal(oldalhossz);
		this(oldalhossz, oldalhossz);
	}
	
	public int terulet() {
		return a_oldal * b_oldal;
	}

	@Override
	public String toString() {
		return a_oldal + ", " + b_oldal + ": " + terulet();
		/*
		return String.format("%2d", a_oldal) + ", " 
				+ String.format("%2d", b_oldal) 
				+ ": " + terulet();
		 */		
	}
	
	public void setOldal(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setOldal(int oldalhossz) {
		//this.a_oldal = b_oldal = oldalhossz;
		setOldal(oldalhossz, oldalhossz);
	}
	
	public boolean nagyobbTeruletuMint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	
	public boolean egyenloE(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal
				&& b_oldal == masikTeglalap.b_oldal;
	}	
}
