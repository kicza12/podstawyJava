package variables;

public class VariableTypes {
    public static void main(String[] args) {

        //TYPY PROSTE!!

        //typy liczb całkowitych

        System.out.println("Typy liczb całkowitych");
        byte zmByte = Byte.MAX_VALUE;
        short zmShort = Short.MAX_VALUE;
        int zmInt = Integer.MAX_VALUE;
        long zmLong = Long.MAX_VALUE;
        //Deklaracja i inicjalizacja zmiennych
        int someInt = 10; // zajmuje 4 bajty danych(32 bity)
        long someLong = 10000L;// zajmuje 8 bajtów danych(64 bity)

        //dodawanie
        int int_result = someInt + 100;
        //wyświetlenie dodawania
        System.out.println("Wynik dodawania = " + int_result);
        //dodanie do someInt 15, to samo co someInt = someInt + 15
        someInt += 15;
        System.out.println("SomeInt = " + someInt);
        System.out.println("SomeLong = " + someLong);

        //Przypisanie nowej wartości do someInt
        someInt = 10;
        //dodanie do someInt 15, to samo co someInt += 15
        someInt = someInt + 15;
        System.out.println("SomeInt = " + someInt);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        //typy zmienno przecinkowe

        System.out.println("Typy zmienno przecinkowe");

        //Deklaracja i inicjalizacja zmiennych
        float someFloat = 3.14f; // zamuje 4 bajty, dokładność 6-7 miejsc po przecinku
        double someDouble = 3.14456983789d; // zamuje 8 bajty, dokładność 15 miejsc po przecinku

        double double_result = someDouble + 12.543534d;
        System.out.println("Wynik dodawania zmiennych zmiennoprzecinkowych = " +  double_result);
        System.out.println("someFloat = " + someFloat);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        //typ logiczny

        System.out.println("Typ logiczny");

        //Deklaracja i inicjalizacja zmiennych
        boolean someTrue = true;
        boolean someFalse = false;

        System.out.println("Prawda to -> " + someTrue);
        System.out.println("Fałsz to ->" + someFalse);

        boolean and_result = someTrue && someFalse;
        boolean or_result = someTrue || someFalse;

        System.out.println("Wynik AND = " + and_result);
        System.out.println("Wynik OR = " + or_result);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        //typ znakowy

        System.out.println("Typ znakowy");

        //Deklaracja i inicjalizacja zmiennych
        char someChar = 'k';
        char nextChar = 'h';

        //Przypisanie nowej wartości do zmiennej
        nextChar = 'l';

        System.out.println(someChar);
        System.out.println(nextChar);
        System.out.println(someChar + nextChar);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // JEST TO TYP OBIEKTOWY!!!

        //typ łańcuchowy - tekst (łańcuch znaków 'charów')

        System.out.println("Typ łańcuchowy - tekst (łańcuch znaków 'charów')");

        //Utworzenie obiektu typu String
        String someString = "This is some String!";
        System.out.println(someString);

        //Połączneie Stringów
        someString = someString + " New text";
        System.out.println(someString);
    }
}

