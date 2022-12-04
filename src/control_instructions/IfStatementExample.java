package control_instructions;

public class IfStatementExample {
    public static void main(String[] args) {
        //Dzięki static'owi nie trzeba tworzyć obiektu; jest wspólna dla wszystkich obiektów dlatego nazywana jest zmienną klasową
        //Wygenerowanie liczby losowej
        int someNumber = (int) (1001 * Math.random());

        //Sprawdzenie czy wynik losowania jest mniejszy od 300
        if (someNumber < 300) {
            //Jeśli mniejszy od 300 wykonaj poniższy kod
            System.out.println("Wylosowana liczba jest minejsza od 300 -> " + someNumber);
            //Sprawdzenie czy wylosowana liczba jest mniejsz aod 600
        } else if (someNumber < 600) {
            //Jeśli mniejszy od 600 wykonaj poniższy kod
            System.out.println("Wylosowana liczba jest mniejsza od 600 ale wieksza od 300 -> " + someNumber);
            //Sprawdzenie czy wylosowana liczba jest mniejsz aod 1000
        } else if (someNumber < 1000) {
            //Jeśli mniejszy od 600 wykonaj poniższy kod
            System.out.println("Wylosowana liczba jest mniejsza od 1000 ale większa od 600 -> " + someNumber);
            //W przypadku jeśli żaden warunek nie zostanie spełniony wykonuje się blok else
        } else {
            //Kod uruchomi się w przypadku nie spełnienia żadnego z warunków
            System.out.println("Twoj szczęśliwy numerek");
        }

        System.out.println("Dalszy ciąg programu");
        //MOJE
        int x = 18;

        if(x % 10 == 7 && x>10) {
            System.out.println("Warunek 1 został spełniony");

        } else if (x>10 && x>11){
            System.out.println("Warunek 2 został spełniony");//else if rozgałęzia if
        }
        else if (x >10){
            System.out.println("Warunek 3 został spełniony");//pierwszy napotkany spełniony warunek zostanie wyświetlony
        }
        else {
            System.out.println("Wykonał się blok else");//else się spełnia, kiedy nie spełnia się warunek w if
        }
        System.out.println("Dalszy kod programu");
    }
}
