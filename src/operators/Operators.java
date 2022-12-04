package operators;

public class Operators {
    public static void main(String[] args) {
        //DODAWANIE
        int a = 60;
        a += 40;
        System.out.println("a = " + a);
//TO SAMO
        a = 60;
        a = a + 40;
        System.out.println("a = " + a);

        //MNOŻENIE
        int b = 10;
        b *= 3;
        System.out.println("b = " + b);
//TO SAMO
        b = 10;
        b = b * 3;
        System.out.println("b = " + b);

        //MODULO - (Reszta z dzielenia)
        int c = 11;
        int moduloResult = c % 3;
        System.out.println("Wynik działania modulo to -> " + moduloResult);

        //POTĘGOWANIE
        int d = 10;
        double powerResult = Math.pow(d, 2);
        System.out.println("Wynik potęgowania = " + powerResult);

        //PIERWIASTEK
        int e = 4;
        double squarResult = Math.sqrt(e);
        System.out.println("Wynik pierwiastkowania = " + squarResult);

        e = 8;
        squarResult = Math.pow(e, 1.0 / 3.0);// 1.0/3.0 bo wynik pierwiastka trzeciego stopnia jest potęgą 1/3
        System.out.println("Wynik pierwiastkowania = " + squarResult);

        //Zmienne pomocnicze
        int f = 5;
        int g = 10;
        int h = 0;

        //Przykłady działań matematycznych i wydruk wyników na ekran
        h = f + g;
        System.out.println("Wynik dodawania: " + h);

        h = f - g;
        System.out.println("Wynik odejmowania: " + h);

        h = f * g;
        System.out.println("Wynik mnożenia: " + h);

        h = g / f;
        System.out.println("Wynik dzielenia: " + h);

        h = g % f;
        System.out.println("Reszta z dzielenia: " + h);

        h = g % 4;
        System.out.println("Reszta z dzielenia: " + h);

        h += f;
        System.out.println("Wynik dodawani (skócona forma): " + h);
    }

}


