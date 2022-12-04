package standard_in_out;

import java.util.Scanner;

    public class StdInOutExample {
        public static void main(String[] args) {

            //Utworzenie scanner czytającego dane wejściowe z konsoli
            Scanner scanner = new Scanner(System.in);

            //Wczytanie wartości z konosli jak String (kolejna linia)
            //Pamiętaj aby wprowadzić coś w do konsoli
            //Program czeka na wprowadzenie przez Ciebie danych
            String nextLine = scanner.nextLine();
            System.out.println(scanner);
            System.out.println(nextLine);

            //Wczytanie liczby z konsoli
            //Pamiętaj aby wprowadzić coś w do konsoli
            //Program czeka na wprowadzenie przez Ciebie danych
            //Podanie innych danych niż liczby całkowitej spowoduje błąd
            int nextInt = scanner.nextInt();
            System.out.println(nextInt);

            //Wczytanie liczby z konsoli
            //Pamiętaj aby wprowadzić coś w do konsoli
            //Program czeka na wprowadzenie przez Ciebie danych
            //Podanie innych danych niż liczby zmiennoprzecinkowej spowoduje błąd
            //(Użyj "," -> np. 4,32 lub 10,0
            double nextDouble = scanner.nextDouble();
            System.out.println(nextDouble);

            //Wszytanie wartości logicznej
            //Można wprowadzić jedynie 2 wartości true lub false
            boolean nextBoolean = scanner.nextBoolean();
            System.out.println(nextBoolean);
        }
    }

