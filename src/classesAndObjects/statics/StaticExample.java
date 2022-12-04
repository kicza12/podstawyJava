package classesAndObjects.statics;

public class StaticExample {
    //Deklaracja i inicjalizacja zmiennej statycznej - licznik
    //(zmienna klasowa - wspólna dla wszystkich obiektów)
    //(Metoda statyczna nie potrzebuje obiektu aby ją wywołać)
    private static int counter = 0;

    //Konstruktor
    //(zwiększa wartość licznika po każdym utworzonym obiekcie)
    public StaticExample() {
        counter++;
    }

    //Metoda statyczna (klasowa)
    //Zwraca wartość licznika (counter)
    public static int getCounter() {
        return counter;
    }

    //Metoda zwracająca wartośc licznika (counter)
    //(Nie jest statyczna, potrzeba obiektu aby ją wywołać
    public int getCounterByObject() {
        return counter;
    }

    //Metoda statyczna ustawiająca wartość licznika (counter)
    //(Metoda statyczna nie potrzebuje obiektu aby ją wywołać)
    public static void setCounter(int newCounter) {
        counter = newCounter;
    }
}

