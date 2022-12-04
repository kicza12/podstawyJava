package arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // Utworzenie tablicy dwuwymiarowej bez podania liczby kolumn
        System.out.println("Utworzenie tablicy dwuwymiarowej string2DArray_1 bez podania liczby kolumn");
        String[][] string2DArray_1 = new String[2][];
        // Wyświetlamy wiersze w utworzonej tablicy
        // Elementy w wierszach tablicy nie są zainicjalizowane dlatego otrzymamy "null"
        // Każdy wiersz w tablicy jest kolejną tablicą (obecnie nie zainicjalizowaną)
        // Brak inicjalizacji wierszy w tej tablicy wynika ze sposobu jej utworzenia czyli "new String[2][]"
        // Nie podajemy liczby kolumn (drugi nawias kwadratowy) stąd nie ma pewności jakiej długości tablicę utworzyć dla każdego wiersza
        // PRZY TWORZENIU TABLIC KONIECZNE JEST ABY PODAĆ JEJ ROZMWIAR!!!!
        // Tablicę 2D można określić jako tablicę tablic
        System.out.println("Wyświetlamy wiersze w utworzonej tablicy string2DArray_1");
        System.out.println(string2DArray_1[0]);
        System.out.println(string2DArray_1[1]);
        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");
        // Obrazowy przykład inicjalizacji tablicy string2DArray_1 jako macierz
        //   1. null
        //   2. null

        // Obrazowy przykład inicjalizacji tablicy string2DArray_1 jako tablica tablic
        // [null, null]

        // Utworzenie tablicy dwuwymiarowej z podaniem liczby kolumn
        System.out.println("Utworzenie tablicy dwuwymiarowej string2DArray_2 z podaniem liczby kolumn");
        String[][] string2DArray_2 = new String[2][3];
        // W tym przypadku elementy w wierszach tablicy są zainicjalizowane (każdy wiersz to tablica) "new String[2][3]"
        // Podajemy liczbę kolumn jako 3
        // Po wyświetleniu wiersza (czyli wyświetleniu tablicy) otrzymamy referencję do tej tablicy
        // Tablica w Javie jest obiektem
        // Przy wyświetlaniu poprzez bezpośrednie odwołanie do niej otrzymamy jej referencję
        // Wyświetlenie 1 i 2 wiersza tablicy 2D
        System.out.println("Wyświetlenie 1 i 2 wiersza tablicy 2D string2DArray_2");
        System.out.println(string2DArray_2[0]);
        System.out.println(string2DArray_2[1]);
        // Wyświetlenie długości 1 i 2 wiersza tablicy 2D
        System.out.println("Wyświetlenie długości 1 i 2 wiersza tablicy 2D string2DArray_2");
        System.out.println(string2DArray_2[0].length);
        System.out.println(string2DArray_2[1].length);
        // Wyświetlenie elementów z tablicy z podaniem wiersza i kolumny
        // Nie przypisywaliśmy im wcześniej konkretnych wartości
        // Uzyskujemy null ponieważ elementy uzyskały wartość default (nie zostały im przypisane konkretne wartości)
        System.out.println("Wyświetlenie elementów tablicy 2D string2DArray_2 z podaniem ich indexów");
        System.out.println(string2DArray_2[0][0]);
        System.out.println(string2DArray_2[1][1]);
        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Obrazowy przykład inicjalizacji tablicy string2DArray_2 jak macierz
        //  1. [ null, null, null ]
        //  2. [ null, null, null ]

        // Obrazowy przykład inicjalizacji tablicy string2DArray_2 jako tablica tablic
        // [ [ null, null, null ], [ null, null, null ] ]

        // (W przypadku gdyby tablica zawierała liczby) -> int[][] int2Darray = new int[2][3]
        //  1. [ 0, 0, 0 ]
        //  2. [ 0, 0, 0 ]

        // Porownanie wierszy tablicy string2DArray_1 i string2DArray_2
        // Nasza tablica string2DArray_1 nie posiada obecnie zainicjalizownaych wierszy
        System.out.println("Porównanie wierszy tablic string2DArray_1 i string2DArray_2");
        // Wiersze tablicy string2DArray_1 nie są jeszcze zainicjalizowane, otrzymujemy null
        System.out.println("Wiersze tablicy 2D string2DArray_1");
        System.out.println(string2DArray_1[0]);
        System.out.println(string2DArray_1[1]);
        // Wiersze tablicy string2DArray_2 są już zainicjalizowane, otrzymujemy referencję
        System.out.println("Wiersze tablicy 2D string2DArray_2");
        System.out.println(string2DArray_2[0]);
        System.out.println(string2DArray_2[1]);
        // Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Utworzenie 2 nowych tablic i inicjalizacja ich wartości
        System.out.println("Utworzenie 2 nowych tablic oraz inicjalizacja ich wartości");
        String[] array_1 = {"Stirng_1", "String_2", "String_3"};
        String[] array_2 = {"Stirng_4", "String_5", "String_6", "String_7"};

        // Przypisanie utworzonych tablic do wierszy tablicy 2D string2DArray_1
        System.out.println("Przypisanie do wierszy tablicy 2D string2DArray_1 tablic array_1 oraz array_2");
        string2DArray_1[0] = array_1;
        string2DArray_1[1] = array_2;

        // Wyswietlenie referencji po przypisaniu
        // Zwróc uwagę, że wyświetlone referencje są takei same jak te powyżej
        // Nasza tablica przechowuje obecnie w sowich wierszach array_1, array_2
        // Ciekawostką jest to że array_1 i array_2 mają różne rozmiary (odpowiednio 3 oraz 4)
        // Fakt, że tablica string2DArray_1 zawiera w swoich wierszach referencję do innych tablic (obiektów)
        // Umożliwia umieszaczanie tam tablic o różnych rozmiarach
        // Istotny jest jedynie typ danych jaki te tablice przechowują a nie ich rozmiar
        System.out.println("Wyświetlenie wierszy tablicy 2D string2DArray_1 po przypisaniu do nich array_1 i array_2");
        System.out.println(string2DArray_1[0]);
        System.out.println(string2DArray_1[1]);

        // Wyświetlanie elementów tablicy (for)
        System.out.println("Wyświetlenie elementów tablicy string2DArray_1 przy użycui pętli for");
        for (int i = 0; i < string2DArray_1.length; i++) {
            for (int j = 0; j < string2DArray_1[i].length; j++) {
                System.out.println(string2DArray_1[i][j]);
            }
        }

        // Wyświetlanie elementów tablicy (foreach)
        System.out.println("Wyświetlenie elementów tablicy string2DArray_1 przy użycui pętli foreach");
        for (String[] strings : string2DArray_1) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
        //Nowy pusty wiersz (dla lepszej widoczności w konsoli)
        System.out.println(" ");

        // Umieszczenia w tablicy String[2][3] tablicy o dlugości 3 oraz 4
        // Nie istotna jest długość tablicy a jedynie typ danych
        // Do wiersza przypisywana jest referencja do tablicy
        System.out.println("Przypisanie do wierszy tablicy 2D string2DArray_2 tablic array_1 oraz array_2");
        string2DArray_2[0] = array_1;
        string2DArray_2[1] = array_2;

        // Wyświetlanie elementów tablicy string2DArray_2 (pętla for)
        System.out.println("Wyświetlenie elementów tablicy 2D string2DArray_2 poprzez ich indexy pętlą for");
        for (int i = 0; i < string2DArray_2.length; i++) {
            for (int j = 0; j < string2DArray_2[i].length; j++) {
                System.out.println(string2DArray_2[i][j]);
            }
        }

        // Wyświetlanie elementów tablicy string2DArray_2 (pętla foreach)
        System.out.println("Wyświetlenie elementów tablicy 2D string2DArray_2 poprzez ich indexy pętlą foreach");
        for (String[] strings : string2DArray_2) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
}

