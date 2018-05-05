import java.util.*;

public class Mertani_atlag {
    public static void main( String[] args ){

        double[] tomb = new double[10];
        Scanner bemenet = new Scanner(System.in);

        for ( int i = 0; i < tomb.length; i++){
            System.out.println("Kerem dja meg a(z) " + (i + 1) + ".elem erteket");
            tomb[i] = bemenet.nextDouble();
        }

        double mertani_atlag = 1;

        for ( int i = 0; i < tomb.length; i++){
            mertani_atlag *= tomb[i];
        }

        mertani_atlag = Math.pow(mertani_atlag, 1.0 / tomb.length);

        System.out.println("A tomb elemeinek mertani atlaga: ");
        System.out.println(mertani_atlag);


        bemenet.close();

    }
}
