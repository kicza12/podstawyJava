package loops;

public class ForLoopExample {
    public static void main(String [] args) {

        System.out.println("Przykład pętli wykonującej się 10 razy i drukującej i na ekran");
        //Przykład pętli for
        for (int i = 0; i < 10; i++) {
            //Instrukcja wykonuje się do aż warunek "i < 10" zwóric false czyli gdy i = 11;
            System.out.println("Jest to krok numer = " + i);
        }

        //Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        //Zmienna pomocnicza
        int result = 0;
        System.out.println("Przykład pętli wykonującej się 10 razy i dodającej kolejne i do siebie");
        //Przykład pętli for z dodawaniem do siebie kolejnych wartości i
        for (int i = 0; i < 10; i++) { //inkremenctacja, i++ jest tym samym co ->i = i + 1
            result = result + i;
        }
        System.out.println("Suma kolejny i = " + result);

        //Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Pętla for losującą 10 liczb z zakresu od 0 do 100");
        //Przykład pętli for losującą 10 liczb z zakresu od 0 do 100
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 101));
        }

        //Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Pętla for drukująca co trzecią liczbę");
        //Przykład pętli for ze zwiększaniem i o 3
        for (int i = 0; i < 100; i = i +3) {
            System.out.println("i = " + i);
        }
    }
}
