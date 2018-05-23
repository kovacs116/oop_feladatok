/*
K�sz�tsen IElado interf�szt!
Adattagjai: alap�rtelmezett �r, �rt�ke 1, 
�s alap�rtelmezett devizanem, �rt�ke Ft.
Met�dusok:
- Getter met�dus az �r �s a devizanem lek�rdez�s�re.
- Setter met�dus az �r �s a devizanem megv�ltoztat�s�ra.
 */
public interface IElado {
	static int alapertelmezett_ar = 1;
	static String alapertelmezett_devizanem = "Ft";
	
	String getAr();
	void setAr(int ar, String devizanem);
}
