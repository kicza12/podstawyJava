package classesAndObjects.repetition;

public class Main {

    public static void main(String[] args) {
        //Utworzenie obiektu klasy Person i przekazanie danych do inizjalizacji pól tego obiektu
        Person me = new Person("Piotr", "Andrzejak", 29, 177);

        //Wywołanie metody "getFirstName()"
        //Zwraca ona wartość pola firstName i przypisuje do zmiennej firstName
        String firstName = me.getFirstName();

        //Wypisanie wartości, którą zwróci metoda 'getFirstName()'
        System.out.println(me.getFirstName());

        //Wywołanie metody setFirstName()
        //Ustawia ona wartość pola firstName na wartość przekazaną w argumencie
        //Zmienia imię z Piotr na Andrzej
        me.setFirstName("Andrzej");

        //Wypisanie wartości pola firstName w cleu sprawdzenia czy zmieniło swoją wartość
        System.out.println(me.getFirstName());

        //Wywołanie meotdy toString() i wyświetlenie wartości wszytskich pól
        System.out.println(me.toString());

        //Utworzenie nowego obiektu typu Person konstruktorem bezargumentowym
        Person somePerson = new Person();
        //Wyświetlenie wartości pól utworoznego obiektu
        //Nie przekazano wartości do inicjalizacji pól obiektu (konstruktor bezargumentowy Perosn() )
        //Wyświetlą się wartości defaul, null dla obiektów, 0 dla liczb
        System.out.println(somePerson.toString());
        //Wywołanie setterów i ustawienie wartości dla pól obiektu
        somePerson.setFirstName("SomeName");
        somePerson.setLastName("SomeLastname");
        somePerson.setAge(99);
        somePerson.setHeight(180);
        //Ponowne wywołanie metody 'toString()'
        //Pola mają teraz ustawione wartości
        System.out.println(somePerson.toString());

        //Wykonanie metody testMethod()
        //Opis działania tej metody znajduje się w klasie Person
        somePerson.testMethod();
        //Zmiana wartości pola age poprzez setter aby metoda testMethod() wykonała się inaczej
        somePerson.setAge(100);
        //Ponowne wykonanie metody i inny wynik
        somePerson.testMethod();
    }
}