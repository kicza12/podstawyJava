package conversion;

public class SaveConversionExample {
    public static void main(String[] args) {
        // Deklaracja i inicjalizacja zmiennej typu double
        double someDouble = 10.3532348678678678697868796987d;
        // Deklaracja i inicjalizacja zmiennej typu float
        float someFloat= 17.1214f;

        // Deklaracja i inicjalizacja zmiennej typu long
        long someLong = 117L;
        // Deklaracja i inicjalizacja zmiennej typu int
        int someInt = 57;

        // Deklaracja i inicjalizacja zmiennej typu short
        short someShort = 12;
        // Deklaracja i inicjalizacja zmiennej typu byte
        byte someByte = 99;
        // Deklaracja i inicjalizacja zmiennej typu char
        char someChar = 'A';

        // Przykłady rzutowania innych typów liczbowych na typ double
        // Przy rzutowaniu na typ double nie dochodzi do utraty danych
        // W związku z tym rzutowanie to jest niejawne
        // Nie musimy wskazywać tego rzutowania bezpośrednio
        // Wystarczy przypisać zmienną do innej zmiennej typu double
        System.out.println("Rzutowanie na double'a");

        // Zmienna pomocnicza
        double testDouble;

        System.out.println("Wartość zmiennej typu float przed rzutowaniem = " + someFloat);
        //Rzutowanie (niejawne) float na double
        testDouble = someFloat;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ double = " + testDouble);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu long przed rzutowaniem = " + someLong);
        // Rzutowanie (niejawne) long na double
        testDouble = someLong;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ double = " + testDouble);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu int przed rzutowaniem = " + someInt);
        // Rzutowanie (niejawne) int na double
        testDouble = someInt;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ double = " + testDouble);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu short przed rzutowaniem = " + someShort);
        // Rzutowanie (niejawne) shor na double
        testDouble = someShort;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ double = " + testDouble);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu byte przed rzutowaniem = " + someByte);
        // Rzutowanie (niejawne) short na double
        testDouble = someByte;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ double = " + testDouble);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu char przed rzutowaniem = " + someChar);
        // Rzutowanie (niejawne) char na double
        // Dochodzi tutaj to zamiany znaku na liczbę!!!!!
        testDouble = someChar;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ double = " + testDouble);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Przykłady rzutowania innych typów liczbowych na typ long
        // Przy rzutowaniu na typ long może dojść do utraty danych
        // Long jest typem dla liczb całkowitych w związku z tym przy rzutowaniu float lub double traci część ułamkową
        // Jeśli chodzi o typy całkowite long posiada największy zakres
        // Rzutowanie innych typów liczbowych zachodzi niejawnie (nie ma ryzyka utraty danych)
        System.out.println("Rzutowanie na longa");

        // Zmienna pomocnicza
        long testLong;

        System.out.println("Wartość zmiennej typu int przed rzutowaniem = " + someInt);
        // Rzutowanie (niejawne) int na long
        testLong = someInt;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ long = " + testLong);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu short przed rzutowaniem = " + someShort);
        // Rzutowanie (niejawne) short na long
        testLong  = someShort;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ long = " + testLong);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu byte przed rzutowaniem = " + someByte);
        // Rzutowanie (niejawne) byte na long
        testLong = someByte;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ long = " + testLong);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Wartość zmiennej typu char przed rzutowaniem = " + someChar);
        // Rzutowanie (niejawne) char na long
        // Dochodzi tutaj to zamiany znaku na liczbę!!!!!
        testLong = someChar;
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ long = " + testLong);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // PRZYPADKI NIEBEZPICZNE - UTRATA INFORMACJI
        System.out.println("PRZYPADKI UTRATY DANYCH!!!");

        // Rzutowanie (jawne) double na float
        float testFloat = (float) someDouble;
        System.out.println("Wartość zmiennej typu double przed rzutowaniem = " + someDouble);
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ float = " + testFloat);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Rzutowanie (jawne) double na long
        testLong = (long) someDouble;
        System.out.println("Wartość zmiennej typu double przed rzutowaniem = " + someDouble);
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ long = " + testLong);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Przypadek kiedy long jest zbyt duży aby zmieścić się z int
        // Takie rzutowanie prowadzi do wyniku, który ciężko przewidzieć
        // Long to 64 bity (8 bajtów), int 32 bity (4 bajty)
        // Zmienna pomocnicza o dużej wartości
        long someLong2 = 92233720368787L;
        // Rzutowanie (jawne) int na long
        int testInt = (int) someLong2;
        System.out.println("Wartość zmiennej typu long przed rzutowaniem = " + someLong2);
        System.out.println("Wartość tej zmiennej po rzutowaniu na typ int = " + testInt);

    }
}
