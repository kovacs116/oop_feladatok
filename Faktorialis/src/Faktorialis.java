public class Faktorialis {

    public static void main( String[] args ){

        int n = 10;
        long faktorialis = 1;

        for ( int i = 1; i <= n; i++){
            faktorialis *= i;
        }

        System.out.println(n + " faktorialisa: " + faktorialis);
        System.out.println(n + " faktorialisa: " + faktorialis(n));
        System.out.println(n + " faktorialisa: " + rekurziv_faktorialis(n));
    }

    //iterativ megoldas
    private static long faktorialis(int n){
        long faktorialis = 1;

        for ( int i = 2; i <=n; i++){
            faktorialis *= i;
        }
        return faktorialis;
    }

    private static long rekurziv_faktorialis(int n){
        if (n < 2){
            return 1;
        }
        else{
            return n * rekurziv_faktorialis(n-1);
        }
    }
}
