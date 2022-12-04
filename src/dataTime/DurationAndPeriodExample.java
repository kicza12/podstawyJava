package dataTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationAndPeriodExample {
    public static void main(String[] args) {
        System.out.println("Duration.ofHours");
        //Utworzenie obiektu Duration statyczną metodą 'ofHours' i wyświetlenie liczby minut
        System.out.println(Duration.ofHours(10).toMinutes());
        //Utworzenie obiektu Duration statyczną metodą 'ofHours' i wyświetlenie liczby godzin
        System.out.println(Duration.ofHours(10).toHours());
        //Utworzenie obiektu Duration metodą statyczną 'between'. Jest to różnica pomiędzy dwoma datami i czasem
        //Utworzenie
        Duration myDuration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2));
        //Wyświetlenie różnicy czasowej zawartej w obiekcie Duration w postaci minut
        System.out.println(myDuration.toMinutes());
        //Wyświetlenie różnicy czasowej zawartej w obiekcie Duration w postaci godzin (poprzez zamianę minut na godziny)
        System.out.println(myDuration.toMinutes()/60);
        //Wyświetlenie różnicy czasowej zawartej w obiekcie Duration w postaci godzin
        System.out.println(myDuration.toHours());
        //Period liczy czas trwania a Duration okres
        //Utworzenie obiektu Period zawierającego w sobie różnice dwóch dat
        //Różnica ta jest dzielona na okresy takie jak lata, miesiące i dni
        //Ze stu dni odliczane są kolejne pełne miesiące (począwszy od pierwszej przekazanej daty ->LocalDate.now()
        //W przypadku stu dni odliczane są trzy pełne miesiące (obecnie 30, 31 i 31 dni = 92; MOŻE SIĘ TO ZMIENIĆ
        //Pozostałe dni nie mieszczące się w pełnym miesiącu można traktować jako resztę
        Period period = Period.between(LocalDate.now(), LocalDate.now().plusDays(100));
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.getYears());
        System.out.println("Period metodą between z konkretną datą");
        //Zamienia czas pomiędzy datami na liczbę pełnych lat, miesięcy i dni
        //Realizuję podobne zadanie jak przykład powyżej, oblicza liczbę lat, miesięcy i dni od dziś
        Period periodToHoliday =Period.between(LocalDate.now(), LocalDate.of(2023,6,24));
        System.out.println(periodToHoliday.getYears());
        System.out.println(periodToHoliday.getMonths());
        System.out.println(periodToHoliday.getDays());
    }
}
