public class Euler_szam {
    public static void main( String[] args){
        double e = 0;

        int darab = 100;

        for ( int i = 0; i < darab; i++){
            e += 1 / faktorialis(i);
        }

        System.out.println("Euler-fele szam");
        System.out.println("e: " + e);
    }

    private static double faktorialis( int n ){
        double faktorialis = 1;

        for ( int i = 2; i <= n; i++ ){
            faktorialis *= i;
        }

        return faktorialis;
    }
}
