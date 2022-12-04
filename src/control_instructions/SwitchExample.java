package control_instructions;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        //zmienna pomocnicza
        int someNumber = 11;

        //Utworzneie scanner, będzie służył do wprowadzania wartość z konsoli
        Scanner scanner = new Scanner(System.in);
        //Zmienna pod, którą przypiszemy wartość z konsoli
        int numberOfTheDay;
        //Informacja dla użytkownika programu
        System.out.print("Podaj liczbę = ");
        //Przypisanie wartość podanej przez użytkownika w konsoli
        //Pamiętaj aby podać liczbę załkowitą (int)
        //W przeciwnym razie program zakończy się błędem
        numberOfTheDay = scanner.nextInt();

        //Instrukcja switch wywoływana dla na zmiennej numberOfTheDay
        switch (numberOfTheDay) {
            //Przypadek dla numberOfTheDay = 1
            case 1:
                System.out.println("Poniedziałek");
                //Przykład instrukcji if w jednym w przypadków switcha
                if (someNumber % 2 == 0) {
                    System.out.println("Liczba jest parzysta");
                } else {
                    System.out.println("Liczba jest nieparzysta");
                }
                //Zakończenie przypadku dla tego warunku switcha
                break;
            //Przypadek dla numberOfTheDay = 2
            case 2:
                System.out.println("Wtorek");
                //Zakończenie przypadku dla tego warunku switcha
                break;
            //Przypadek dla numberOfTheDay = 3
            case 3:
                System.out.println("Środa");
                //Zakończenie przypadku dla tego warunku switcha
                break;
            //Przypadek dla numberOfTheDay = 4
            case 4:
                System.out.println("Czwartek");
                //Zakończenie przypadku dla tego warunku switcha
                break;
            //Przypadek dla numberOfTheDay = 5
            case 5:
                System.out.println("Piątek");
                //Zakończenie przypadku dla tego warunku switcha
                break;
            //Przypadek dla numberOfTheDay = 6
            case 6:
                System.out.println("Sobota");
                //Zakończenie przypadku dla tego warunku switcha
                break;
            //Przypadek dla numberOfTheDay = 7
            case 7:
                System.out.println("Niedziela");
                //Zakończenie przypadku dla tego warunku switcha
                break;
            //Blok default dla wszystkich pozostałych przypadków
            default:
                System.out.println("Nie ma takiego dnia tygodnia");
                //Zakończenie przypadku dla tego warunku switcha
                break;
        }

        System.out.println("Dalszy kod programu");

    }
}
