/*
K�sz�tsen saj�t csomagban ISzinezheto n�ven interf�szt!
Adattagja: alap�rtelmezett sz�n,
�rt�ke piros (haszn�lja a java.awt.Color oszt�lyt)!
Met�dusok:
- getter met�dus a sz�n lek�rdez�s�re,
- setter met�dus a sz�n megv�ltoztat�s�ra.
 */
package sajat;

import java.awt.Color;

public interface ISzinezheto {
	Color alapertelmezettSzin = Color.RED;
	Color getSzin();
	void setSzin(Color szin);
}
