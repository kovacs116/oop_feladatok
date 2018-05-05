public class Szamok {
    public static void main( String[] args){
        int n = 5;

        for ( int i = 1; i <= n; i++){
            for ( int j = 0; j < i; j++ ){
                System.out.print( i + " ");
            }
            System.out.println();
        }

        for ( int i = 1; i <= n; i++ ) {

            cimke:

            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
                if (j == i) {
                    break cimke;
                }
            }
            System.out.println();
        }
    }
}
