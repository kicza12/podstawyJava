package dataTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        //Utowrzenie obiektu typu LocalTime (obecny czas pobierany z zegara systemowego)
        //Metoda 'now()' jest statyczna, do jej użycia nie potrzeba tworzyć obiektu klasy LocalTime
        LocalTime localTime = LocalTime.now();
        //Wyświetlenie utworzonej daty na ekranie konsoli
        System.out.println("Now is the time: " + localTime);
        //Przypisanie do zmiennej 'localTime' nowej wartości
        //Metody są tutaj wywoływane jedna po drugiej (chain)
        localTime = LocalTime.now()
                .withSecond(0)
                .withNano(0);
        System.out.println("Now is the time: " + localTime);
        //Przypisanie do zmiennej 'localTime' nowej wartości
        //Metody są tutaj wywoływane jedna po drugiej (chain)
        localTime = localTime.plusSeconds(15).plusMinutes(10).plusHours(2);
        System.out.println("Now is the time: " + localTime);
        //Użycie metod do wyświetlenia konkretnej składowej czasu
        System.out.println("Godzina -> " + localTime.getHour());
        System.out.println("Minuta -> " + localTime.getMinute());
        System.out.println("Sekunda -> " + localTime.getSecond());
        //Utworzenie obiektu klasy LocalTime metodą statyczną 'now()'
        LocalTime now = LocalTime.now();
        //Utworzenie obiektu typu String (połączenie ze sobą kilku elementów)
        String formattedTime = now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
        //Wyświetlenie zmiennej
        System.out.println(formattedTime);
    }
}
