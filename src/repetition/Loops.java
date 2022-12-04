package repetition;

public class Loops {
    public static void main(String[] args) {
        //Zmienna pomocnicza do przechowywania wyniku dodawania
        int result = 0;
        //Pętla for dla i od 0 do 10 (suma liczb od 0 do 10)
        for (int i = 0; i < 11; i++) {
            //Przypisanie do zmiennej 'result' obecnej wartości i
            result = result + i;
        }
//Wydruk wyniku
        System.out.println(result);
        //Przykład pęlti for z dodawaniem co drugiej liczby
        //Reset wartości zmiennej
        result = 0;
        for (int i = 0; i < 101; i = i + 2) {
            result = result + i;
        }

        System.out.println("Suma co drugiej liczby (parzystych) od 0 do 100 = " + result);

        //pętla foreach

        int[] myArray = {10, -20, 50, 21, -46, 4343, 12, -100, 18};

        //Reset wartości zmiennej
        result = 0;
        //Suma liczb w tablicy myArray petlą foreach
        for (int element : myArray) {
            result = result + element;
        }
        System.out.println("Suma liczb w tablicy policzona petlą for each wynosi = " + result);


        //PĘTLA WHILE
        System.out.println("PĘTLA WHILE");

        //Restart zmiennej
        result = 1;
        //i ustawione na 1 (1 jest neutralne dla mnożenia)
        int i = 1;
        //Pętla wylicza iloczyn liczb od 1 do 9
        //Pętla wykonuje się do momentu aż warunek i < 10 zwróci false
        while (i < 10) {
            //Liczenie iloczynu
            result = result * i;
            //Inkremetacja i do kolejnego obrotu pętli
            i++;
        }
        System.out.println("Iloczyn liczb od 1 do 9 wynosi = " + result);


        //Ustawienie zmiennej i tak aby warunek w while poniżej nie był spełniony (zwraca false)
        i = 10;
        //Niezależnie od tego czy warunek w instrukcji while jest spełniony kod w bloku do wykona sie przynajmniej raz
        do {
            System.out.println("Pętla do while");
            i++;
            //Ten warunek nie jest spełniony od samego początku, blok do wykona się raz
        } while (i < 5);


    }
}

