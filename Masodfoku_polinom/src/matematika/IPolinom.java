/*
Defini�ljon egy matematika.IPolinom nev� interf�szt!
Met�dusai:
- Egy val�s sz�mot kap �s egy val�s sz�mot ad vissza.
Szerepe, egy megadott x �rt�kre visszaadni a kisz�molt y-t.
- Param�ter n�lk�li �s egy eg�szet ad vissza.
Szerepe: a polinom fok�t visszaadni. 
 */
package matematika;

public interface IPolinom {
	double szamol(double valosSzam);
	int getPolinomFoka();
}
