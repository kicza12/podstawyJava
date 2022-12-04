package variables;

public class VariableIntegerExample {
    public static void main(String[] args) {
        int number; // deklaracja zmiennej typu int (liczba)

        number = 5; // inicjalizacja zmiennej typu int, number = 5

        //Wypisanie zmiennej na ekran
        System.out.println("Moja liczba to: " + number);

        //Przypisanie nowej wartości do zmiennej number
        number = 5 + 2;

        //Ponowne wypisanie zmiennej na ekran
        System.out.println("Moja nowa liczba to: " + number);

        //Przypisanie nowej wartości do zmiennej number z wykorzystaniem jej obecnej wartości
        number = number + 2;

        //Ponowne wypisanie zmiennej na ekran
        System.out.println("Moja nowa liczba to: " + number);

        //Przykład mnożenia
        number = number / 3;

        //Ponowne wypisanie zmiennej na ekran
        System.out.println("Moja nowa liczba to: " + number);
    }
}

