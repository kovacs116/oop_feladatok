/*
K�sz�tsen egy Sz�m oszt�lyt a sajat.elso nev� csomagban,
amelynek van egy oszt�lyszint� konstans adattagja
0.001 �rt�kkel egy t�r�s t�rol�s�ra!
Legyen egy m�sik private adattagja egy val�s sz�m t�rol�s�ra!
- Legyen konstruktora, amely a param�terk�nt kapott
�rt�kekkel inicializ�lja az adattagot!
- Legyen egy met�dusa, amely igazat ad,
ha a val�s sz�m adattagnak a param�terk�nt kapott
sz�mt�l val� elt�r�se a t�r�sen bel�l van!
- Legyen getter, setter met�dusa a val�s sz�m adattagra!
 */
package sajat.elso;

public class Szam {

	private static final double tures = 0.001;
	private double valosSzam;
	
	public Szam(double valosSzam) {
		this.valosSzam = valosSzam;
	}

	public double getValosSzam() {
		return valosSzam;
	}

	public void setValosSzam(double valosSzam) {
		this.valosSzam = valosSzam;
	}
	
	//valojaban a metodus azt ellenorzi, hogy
	//egyezik-e a 2 szam (adott turesen belul)
	//public boolean egyezikE(double valosSzam) {
	public boolean szamTuresenBelulVanE(double valosSzam) {
		return Math.abs(this.valosSzam - valosSzam) < tures;
	}	
}
