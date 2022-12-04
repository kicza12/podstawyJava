package standard_in_out;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zmienna 1:");
        double x = scan.nextDouble();
        scan.nextLine();

        System.out.println("Zmienna 2:");
        double y = scan.nextDouble();
        scan.nextLine();

        System.out.println("(d) Dodawanie / (o) Odejmowanie / (m) Mnożenie / (dz) Dzielenie" ) ;
        String choose = scan.nextLine();

        if (choose.equals("d")) {
            System.out.println(x+y);
        }
        else if (choose.equals("o")) {
            System.out.println(x - y);
        }
        else if (choose.equals("m")) {
            System.out.println(x * y);
        }
        else if (choose.equals("dz")) {
            System.out.println(x / y);
        }
    }
}
