package arrays;

public class OneDimensionArray {
    public static void main(String[] args) {

        // Deklaracja i inicjalizacja tablicy o rozmiarze 5 bez podawania konkretnych wartości
        // Elementów otrzymają wartość default (domyslaną)
        System.out.println("Utworzenie tablicy o rozmiarze 5");
        int[] myIntArray = new int[5];

        // Wyświetlenie pierwszego elemntu tablicy (jego index to 0!!!)
        // Ta wartość nie została jeszcze zainicjalizowana dlatego w wyniku otrzymamy 0
        // Zmienna typu "int" bez naszej bezpośredniej inizjalizacji otrzymuję wartość default (domyślną) czyli zero
        System.out.println("Wyświetlenie 3 elementów tablicy przy użyciu indexów");
        System.out.println(myIntArray[0]);
        // Wyświetlenie drugiego elemntu tablicy (jego index to 1!!!)
        // Ta wartość nie została jeszcze zainicjalizowana dlatego w wyniku otrzymamy 0
        // Zmienna typu "int" bez naszej bezpośredniej inizjalizacji otrzymuję wartość default (domyślną) czyli zero
        System.out.println(myIntArray[1]);
        // Wyświetlenie trzeciego elemntu tablicy (jego index to 2!!!)
        // Ta wartość nie została jeszcze zainicjalizowana dlatego w wyniku otrzymamy 0
        // Zmienna typu "int" bez naszej bezpośredniej inizjalizacji otrzymuję wartość default (domyślną) czyli zero
        System.out.println(myIntArray[2]);
        // Pozostałe elementy tej tablicy również mają wartość 0 (indexy 3 oraz 4)

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Przypisanie do poszczególnych elementów tablicy wartości
        System.out.println("Przypisanie elementom tablicy wartości przy użyciu indexów");
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;

        // Wyświetlenie poszczególnych elemntów tablicy za pomocą ich idexów
        System.out.println("Wyświetlenie elementów tablicy przy użyciu ich idexów");
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);
        System.out.println(myIntArray[4]);

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Odwołanie się do elemntu o idexie 10.
        // Nasza tablica ma rozmiar 5 w związku z czym nie posiada elemntu o idexie 10
        // Kod poniżej jest zakomentowany.
        // Dla sprawdzenia możesz odkomentować ten kod i po uruchomieniu porgramu otrzymasz błąd
        // System.out.println(myIntArray[10]);


        // Utworzenie nowej tablicy o rozmiarze 10
        System.out.println("Utworzenie tablicy o rozmiarze 10");
        int[] newArray = new int[10];
        // Wywołanie metody zwracającej długość utworzonej tablicy newArray.length = 10
        System.out.println("Długość tablicy = " + newArray.length);
        // Przypisanie do nowej tablicy wartości liczbowych przy wykorzystaniu pętli for
        // Warunek graniczny i < 10 ustalamy poprzez podanie liczby "z palca" czyli wpiusjąc ją bezpośrednio
        System.out.println("Przypisanie wartości do elementow tablicy poprzez pętle for z warunkiem granicznym i < 10");
        for (int i = 0; i < 10; i++){
            newArray[i] = i + 100;
        }

        // Wypisanie elementów tablicy przy użyciu pętli for
        System.out.println("Wyświetlenei zawartości tablicy pętlą for");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        // Wykonanie tej samej operacji przypisania zmieniając tym razem warunek graniczny
        // z "i < 10" na "i < newArray.length" -> Odwołujemy się tutaj bezpośrednio do długości tablicy.
        // Jest to preferowane podejście, nie musimy "zgadywać" rozmariu tablicy tylko sprawdzamy
        // jej długość bezpośrednio poprzez lenght (długość)
        System.out.println("Przypisanie nowych wartości do elementow tablicy poprzez pętle for z warunkiem granicznym i < newArray.length");
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = i + 200;
        }

        // Wypisanie elementów tablicy przy użyciu pętli foreach
        System.out.println("Wyświetlenie zawartości tablicy pętlą foreach");
        for (int element: newArray) { //for each
            System.out.println(element);
        }

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Przykłady deklaracji i inizjalizacji tablicy wraz z wartościami
        System.out.println("Inicjalizacja tablic z wartosciami");
        int[] array_1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array_2 = {1, 2, 3, 4, 5, 6};

        // Wypisanie elementów tablicy przy użyciu pętli foreach
        System.out.println("Wyświtlenie elementów tablicy array_1 pętlą foreach");
        for (int i_1 : array_1) {
            System.out.println(i_1);
        }

        // Wypisanie elementów tablicy przy użyciu pętli foreach
        System.out.println("Wyświetlenie elementów tablicy array_2 pętlą foreach");
        for (int i_2 : array_2) {
            System.out.println(i_2);
        }

        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Wyświetlenie referecji do utowrzonych tablic
        System.out.println("Wyświetlenie referencji tablic array_1 i array_2");
        System.out.println(array_1);
        System.out.println(array_2);
    }
}
