package dataTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattedExample {
    public static void main(String[] args) {
        //Utworzenie obiektu LocalTime statyczną metodą now
        LocalTime localTime = LocalTime.now();
        //Utowrzenie Stringa poprzez formater (reprezentuje czas zgodnie z podaną normą, sposobem prezentacji)
        String formattedLocalTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formattedLocalTime);
        //Utworzenie obiektu LocalDateTime statyczną metodą now
        LocalDateTime localDateTime = LocalDateTime.now();
        //Utworzenie Stringa poprzez formater (reprezentuje datę i czas zgodnie z podaną normą, sposobem prezentacji)
        String localDateTimeString = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(localDateTimeString);

    }
}
