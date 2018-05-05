import java.util.*;

public class TombVeletlenszam {

    public static void main ( String[] args){
        int[] tomb = new int[10];
        Random veletlenobjektum = new Random();

        System.out.println("A tombelemei: ");
        for ( int i = 0;i < tomb.length; i++){
            tomb[i] = veletlenobjektum.nextInt(50) + 1;
            System.out.println(tomb[i]);
        }

        System.out.println();
        System.out.println("A tomb elemei forditott sorrendben");

        for ( int i = tomb.length - 1; i >= 0; i--){
            System.out.println(tomb[i]);
        }

        int legnagyobb_index = 0;

        for ( int i = 0; i < tomb.length; i++){
            if (tomb[i] > tomb[legnagyobb_index]){
                legnagyobb_index = i;
            }
        }

        System.out.println();
        System.out.println("A legnagyobb szam:" + tomb[legnagyobb_index]);
        int legnagyobb_paros_index = -1;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0) {
                if (legnagyobb_paros_index == -1) {
                    legnagyobb_paros_index = i;
                } else {
                    if (tomb[legnagyobb_paros_index] < tomb[i]) {
                        legnagyobb_paros_index = i;
                    }
                }
            }
        }

        int ciklusvaltozo = 0;
        legnagyobb_paros_index = -1;
        
        for (int i : tomb) {
            if (i % 2 == 0) {
                if (legnagyobb_paros_index == -1) {
                    legnagyobb_paros_index = ciklusvaltozo;
                } else {
                    if (tomb[legnagyobb_paros_index] < i) {
                        legnagyobb_paros_index = ciklusvaltozo;
                    }
                }
            }
            ciklusvaltozo++;
        }

        System.out.println();

        if (legnagyobb_paros_index != -1) {
            System.out.println("A legnagyobb paros szam: " + tomb[legnagyobb_paros_index]);
        } else {
            System.out.println("Nem volt az elemk kozott paros szam.");
        }

    }
}
