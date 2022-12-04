package operators;

public class RelationOperators {
    public static void main(String[] args) {
        //Zmienne pomocnicze
        boolean result;

        //Zmienne pomocnicze
        boolean myTrue = true;
        boolean myFalse = false;

        //Zmienne pomocnicze
        int x = 17;
        int y = 21;
        long z = 35;

        //Wyniki logiczne nierówności i porównań liczbowych
        //Czy x większy od y
        result = x > y;
        System.out.println("x > y -> " + result);

        // Zaprzeczenie wyrażenia x > y
        result = !(x > y);
        System.out.println("!(x > y) -> " + result);

        //Porównanie x i y, czy x = y???
        result = x == y;
        System.out.println("x == y -> " + result);

        //zaprzeczenie wyrażenia x == y, dosłownie tłumacząc x nie równa się y ???
        result = x != y;
        System.out.println("x != y -> " + result);

        //|Czy z większe od x
        result = z > x;
        System.out.println("z > x -> " + result);

        //Czy z równe y
        result = z == y;
        System.out.println("z == y -> " + result);

        //Wyniki działań logicznych
        //Iloczyn logiczny, koniunkcja, "i"
        result = myTrue && myFalse;
        System.out.println("myTrue && myFalse -> " + result);

        //Suma logiczna, alternatywa, "lub"
        result = myTrue || myFalse;
        System.out.println("myTrue || myFalse -> " + result);

        //Zaprfzeczenie iloczynku logicznego
        result = !(myTrue && myFalse);
        System.out.println("!(myTrue && myFalse) -> " + result);
        //MOJE
        int a = 5;
        int b = 6;
        System.out.println("Moje proste warunki");
        System.out.println(a == b);// == sprawdza, czy te liczby (a,b) są równe

        System.out.println(a != b);// != oznacza nie równa się-zaprzeczenie

        System.out.println(a >= b);// >= oznacza większe, bądź równe

        System.out.println(b <= 6);// <= oznacza mniejsze, bądź równe

        System.out.println(b > a);// > oznacza większe

        boolean myBoolean = false;

        System.out.println("Moje działanie logiczne");
        System.out.println((a == b || a != b) && ((a >= b && b <= 6) || !myBoolean));//&& oznacza and czyli jeśli obie wartości są prawdziwe to wydrukuje true
        //|| oznacza or czyli jeśli jedna z wartości jest prawdziwa to wydrukuje true
    }
}
