package dataTime;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        //Utworzenie obiektu klasy Instant metodą statyczną 'now()'
        Instant now = Instant.now();
        //Wyświetlenie liczby milisekund
        System.out.println(now.toEpochMilli());
        //Wyświetlenie liczby nanosekund (bez uwzględnienia milisekund)
        System.out.println(now.getNano());
        //Wyświetlenie obiektu now (uruchamia się jego metoda 'toString()')
        System.out.println(now);
    }
}
