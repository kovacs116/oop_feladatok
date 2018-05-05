import java.util.*;

public class Kalkulator {

    public static void main( String[] args ){
        Scanner bemenet = new Scanner(System.in);

        System.out.println("Kerem adja meg az 1. operandust!");
        System.out.println("1. operandus: ");
        double elso_operandus = bemenet.nextDouble();

        System.out.println("Kerem adja meg a 2. operandust!");
        System.out.println("2. operandus: ");
        double masodik_operandus = bemenet.nextDouble();

        System.out.println("Kerem adja meg a muveletet");
        System.out.println("Az operator: ");

        String operator = bemenet.nextLine();
        operator = bemenet.nextLine();

        switch ( operator.charAt(0) ){
            case '+':
                System.out.println("az osszeadas eredmenye");
                System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
                        (elso_operandus + masodik_operandus));
                break;

            case '-':
                System.out.println("a kivonas eredmenye");
                System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
                        (elso_operandus - masodik_operandus));
                break;

            case '*':
                System.out.println("a szorzas eredmenye");
                System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
                        (elso_operandus * masodik_operandus));
                break;

            case '/':

                if (masodik_operandus == 0) {
                    System.out.println("0-val nem lehet osztani! Vegtelent fog adni eredmenyul.");
                }

                System.out.println("az osztas eredmenye");
                System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
                        (elso_operandus / masodik_operandus));
                break;

            default:
                System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
                break;
        }

        System.out.println("Kerem adja meg a kiszamitando kifejezest!");
        System.out.println("a kifejezes:");
        String kifejezes = bemenet.nextLine();


        String eredmenytomb[] = kifejezes.split(" ");

        elso_operandus = Double.parseDouble(eredmenytomb[0]);
        masodik_operandus = Double.parseDouble(eredmenytomb[2]);
        operator = eredmenytomb[1];

        alapmuveletek(elso_operandus, masodik_operandus, operator);

        bemenet.close();
    }
    public static void alapmuveletek(double elso_operandus, double masodik_operandus, String operator) {

        switch (operator.charAt(0)) {
            case '+':
                System.out.println("az osszeadas eredmenye");
                System.out.println(elso_operandus + " + " + masodik_operandus + " = " +
                        (elso_operandus + masodik_operandus));
                break;

            case '-':
                System.out.println("a kivonas eredmenye");
                System.out.println(elso_operandus + " - " + masodik_operandus + " = " +
                        (elso_operandus - masodik_operandus));
                break;

            case '*':
                System.out.println("a szorzas eredmenye");
                System.out.println(elso_operandus + " * " + masodik_operandus + " = " +
                        (elso_operandus * masodik_operandus));
                break;

            case '/':

                if (masodik_operandus == 0) {
                    System.out.println("0-val nem lehet osztani!");
                } else {
                    System.out.println("az osztas eredmenye");
                    System.out.println(elso_operandus + " / " + masodik_operandus + " = " +
                            (elso_operandus / masodik_operandus));
                }
                break;

            default:
                System.out.println("Nem a 4 alapmuvelet (+, -, *, /) egyiket adta meg!");
                break;
        }
    }
}
