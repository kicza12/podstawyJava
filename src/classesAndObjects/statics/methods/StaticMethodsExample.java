package classesAndObjects.statics.methods;
//Klasa posiadająca metodę statyczną
public class StaticMethodsExample {
    //Metoda statyczna, brak w niej modyfikatora dostępu (dostęp domyślny- package private)
    static void printNumber(int number) {
        //Kod ten wypisze na ekran liczbę przekazaną w parametrze metody 'number'
        System.out.println("The number is: " + number);
    }

    //Przykład metody statycznej zwracającej wynik
    static int squared(int number) {
        return number * number;
    }

    //Przykład metody statycznej zwracającej 'true'
    static boolean getTrue() {
        return true;
    }
}

