package variables;

public class CharVariables {
    public static void main(String [] args) {
        char someLetter = 'A';
        char anotherLetter = 'k';

        System.out.println(someLetter);
        System.out.println(anotherLetter);
        System.out.println(someLetter + anotherLetter);
        System.out.println("To są moje litery -> " + someLetter + anotherLetter); //String zapisujemy w ""
        //brak nawiasu powoduje, że  someLetter + anotherLetter jest czytane jako string, dlatego wydrukuje zapis literowy
        System.out.println("To są moje litery -> " + (someLetter + anotherLetter));
        //dzięki nawiasom wydrukuje liczbę (A oraz k są literami które odpowiadają odpowiednim liczbom
    }
}
