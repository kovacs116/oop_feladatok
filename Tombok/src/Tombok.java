public class Tombok {
    public static void main( String[] args){
        int[] tomb = new int[] { 20, 10, 30, 90, 70, 80, 40, 100, 50, 60};
        int[] tomb2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println(" A tomb elemei: ");

        for ( int i = 0; i < tomb.length; i++ ){
            System.out.println(tomb[i]);
        }

        int index = linearis_kereses(90, tomb);
        System.out.println("90-es ertek indexe: " + (index+1));

        kozvetlen_kivalasztasos_rendezes(tomb);

        System.out.println("A rendezett tomb elemei:");

        for ( int i : tomb){
            System.out.println(i);
        }

        index = binaris_kereses(90, tomb);
        System.out.println("90-es ertek indexe: " + (index+1));

    }

    public static int linearis_kereses(int keresett, int[] tomb ){

        for ( int i = 0; i < tomb.length; i++){
           if ( keresett == tomb[i]){
               return i;
           }
        }

        return -1;
    }

    public static void kozvetlen_kivalasztasos_rendezes(int[] tomb){
        int min_index;
        int ideiglenes;

        for ( int i = 0; i < tomb.length - 1; i++){
            min_index = i;
            for ( int j = i + 1; j < tomb.length; j++){
                if( tomb[j] < tomb[min_index]){
                    min_index = j;
                }
            }

            ideiglenes = tomb[min_index];
            tomb[min_index] = tomb[i];
            tomb[i] = ideiglenes;
        }
    }

    public static int binaris_kereses(int keresett, int[] tomb){
        int also_index = 0;
        int felso_index = tomb.length - 1;
        int kozepso_index;

        while ( also_index < felso_index){
            kozepso_index = (also_index + felso_index) / 2;

            if (tomb[kozepso_index] == keresett){
                return kozepso_index;
            }

            if (tomb[kozepso_index] > keresett){
                felso_index = kozepso_index - 1;
            }
            else{
                also_index = kozepso_index + 1;
            }
        }
        return -1;
    }
}
