package loops;

public class WhileExample {
    public static void main(String[] args) {
    //Zmienna pomocnicza do pętli
    int i = 0;
        System.out.println("Pętla while wypisująca kolejne wartości i");
    //Przykład pętli while wykonującej się 10 razy
    //Pętla wykonuje się do momentu aż warunek i < 10 zwróci false
    //False nastąpi przy i = 11
        while(i < 10) {
        System.out.println("i = " + i);
        i++;
    }

    //Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Pętla while drukująca co drugą liczbę mniejszą od 40 i zliczająca ich sumę");
    //Zmienna pomocnicza do zliczania sumy
    int sum = 0;
    //Wyzerowanie zmiennej przed ponownym jej użyciem w następnej pętli
    i = 0;
        while(i < 40) {
        System.out.println("i = " + i);
        sum = sum + i;
        i = i + 2;
    }
        System.out.println("Suma liczb = " + sum);


    //Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");


        System.out.println("Pętla while drukująca liczby od 10 do 0");
    //Zmiana wartości zmiennej przed ponownym jej użyciem w następnej pętli
    i = 10;
    //Pętla while z przykładem dekrementacji
    //Wykonuje się do mommentu gdy i = -1
        while(i >= 0) {
        System.out.println("i = " + i);
        //dekrementacja -> i = i - 1;
        i--;
    }

    //Zmiana wartości zmiennej przed ponownym jej użyciem w następnej pętli
    i = 5;
    //Ten warunek zwraca flase od samego początku
    //Pętla nie wykona się ani razu!!!!!
        while (i < 4) {
        System.out.println("Ta pętla się nie wykona");
    }

    //Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        System.out.println("Przykład obrazujący różnice preinkrementacji i postinkrementacji");
    //Zmiana wartości zmiennej przed ponownym jej użyciem w następnej pętli
    i = 0;
    //Zmienna pomocnicza
    int j = 0;
    //Zmienna pomocnicza
    int k = 0;
    //Pętla while wykona się 10 razy
        while (i < 10) {
            //Postinkremetacja
            j++;
            //Preinkrementacja
            ++k;
            //Przy postinkremetacji najpierw zwracana jest aktualna wartość j
            //Dopiero potem zwiększana jest o 1
            //Stąd wyniki przy "j = " są o 1 mniejsze
            System.out.println("Wartość j = " + j++);
            //Przy preinkremetacji najpierw dodawane jest 1
            // A opiero potem zwraca jest wartość k
            //Stąd wyniki przy "k = " są o 1 większe
            System.out.println("Wartosc k = " + ++k);
            i++;
        }
    }
}
