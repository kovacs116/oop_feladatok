package tartalyos.fut;
import java.util.*;
import tartalyos.Tartaly;

public class Proba {
    public static void main( String[] args){
        Tartaly[] tartalyok = new Tartaly[5];

        int temp_terfogat;
        double temp_nyomas;
        Scanner scnr = new Scanner(System.in);

        for ( int n = 0; n < 5; n++){
            temp_terfogat = Integer.parseInt(scnr.nextLine());
            temp_nyomas = Double.parseDouble(scnr.nextLine());
            tartalyok[n] = new Tartaly(temp_terfogat, temp_nyomas);
        }

        for ( int i = 0; i < 5; i++ ){
            System.out.println( tartalyok[i]);
        }

        int max = 0;
        for ( int j = 1; j < 5; j++){
            if (tartalyok[max].getTerfogat() < tartalyok[j].getTerfogat()){
                max = j;
            }
        }

        System.out.println("Legnagyobb terfogatu: " + tartalyok[max]);


        int max2 = 0;
        for ( int k = 1; k < 5; k++){
            if (tartalyok[max2].getNyomas() < tartalyok[k].getNyomas()){
                max2 = k;
            }
        }

        System.out.println("Legnagyobb nyomasu: " + tartalyok[max2]);
    }
}
