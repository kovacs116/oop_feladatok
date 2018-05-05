public class Ikerpimek {
    public static void main( String []args ){
        int also_hatar = 1;
        int felso_hatar = 100;
        int darab = 0;
        int i, j;
        System.out.println("Ikerprimek: ");

        for ( i = also_hatar; i <= felso_hatar; i++){

            boolean i_prime = primszamE(i);

            for( j = i + 1; j <= felso_hatar; j++){
                if (i_prime &&primszamE(j)) {
                    if ( j - i == 2){
                        darab++;
                        System.out.println(i+ "," + j);
                    }
                }
            }
        }
        System.out.println(darab + " darab ikerprim van a megadott szamok kozott");
    }

    public static boolean primszamE(int szam){
        if ( szam < 2 ){
            return false;
        }

        for (int i =2; i <= szam / 2;i++){
            if ( szam % i == 0 ){
                return false;
            }
        }

        return true;
    }

    public static boolean primszamE2( int szam ){
        boolean talalt = false;

        if ( szam < 2 ){
            return false;
        }

        for ( int i = 2; i <= szam / 2; i++){
            if (szam % i == 0){
                talalt = true;
                break;
            }
        }

        return !talalt;
    }
}
