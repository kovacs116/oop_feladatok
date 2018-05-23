package zh;
import java.util.*;

public class Futtathato {

    public static void main( String[] args){
        Random rnd = new Random();
        Scanner scr = new Scanner(System.in);

        System.out.println("Adja meg a szamot: ");
        int num = Integer.parseInt(scr.nextLine());

        Model[] filmek = new Model[num];
        OszkarDijasok[] oszkarosok = new OszkarDijasok[num];

        for ( int i = 0; i < num; i++){
            try {
                oszkarosok[i] = new OszkarDijasok("filmtitle"+i, "category"+i, "xyy", 2000+i, "foszereplo"+i,2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for ( int j = 0; j < num; j++) {
            try {
                filmek[j] = new Model("filmtitle" + j, "category" + j, "xyy", 2000 + j, "foszereplo" + j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
