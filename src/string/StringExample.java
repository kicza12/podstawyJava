package string;

public class StringExample {
    public static final String SOME_CONSTANT = " HELLO";
    public static void main(String[] args) {
        //Tworzenie i Konkatenacja Stringów
        System.out.println("Tworzenie i Konkatenacja Stringów");

        //Utworzenie obiektu typu String
        String myString = "My String";
        //Połączenie dwóch Stringów w jeden (konkatenacja)
        myString += " New Text"; // myString = myString + "New Text"
        //Dołączenie do Stringa stałej (konkatenacja)
        myString += SOME_CONSTANT;

        //Wykonanie metody "intern()"
        //Zwraca ona String ze String pulla na którym została wykonana
        String newString = myString.intern();

        System.out.println("String po doklejaniu kolejnych Stringów (konkatenacji)");
        System.out.println(myString);
        System.out.println("Wartość zwrócona z metody 'intern()' (jest taka sama)");
        System.out.println(newString);

        //Utworzenie obiektu typu String za pomocą operatora "new"
        String objectString = new String("Hiho");
        //String utworzony poprzez "new" nie znajduje się w String pull
        //Wywołanie metody "intern()" sprawdza czy String znajduje się już String pullu
        //Jeżeli nie to dodaje go tam i zwraca jego wartość
        String intern = objectString.intern();


        //Konkatenacja Stringów poporzez + (łączenie)
        String text1 = "My name is ";
        String text2 = "John Doe";
        String finalText = text1 + text2;
        System.out.println(finalText);

        //Konkatenacja Stringów poporzez wywołanie metody "concat()"
        String text3 = "This is ";
        String text4 = "a test";
        String finalText2 = text3.concat(text4);
        System.out.println(finalText2);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        //Porównywanie Stringów
        System.out.println("Porównywanie Stringów");
        //Stringi finalText i finalText2 nie są takie same
        //Metoda "equals()" zwróci false
        System.out.println(finalText.equals(finalText2));
        String test1 = "Test";
        String test2 = "Test";
        //Stringi są takie same, zwróci true
        System.out.println(test1.equals(test2));

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        //Metody klasy String
        System.out.println("Metody klasy String");
        System.out.println("String, na którym wywołamy metody --> '" + finalText + "'");
        //Zwraca długośc Stringa
        System.out.println(finalText.length());
        //Zamienia wszystkie litery w Stringu na wielkie
        System.out.println(finalText.toUpperCase());
        //Zamienia wszystkie litery w Stringu na małe
        System.out.println(finalText.toLowerCase());

        String testValue = "This is test value";
        //Zwraca index pod, którym występuje podany symbol -> "is"
        System.out.println(finalText.indexOf("is"));
        //Zamienia wszystkie litery "o" na "P"
        System.out.println(finalText.replaceAll("o", "P"));

    }
}

