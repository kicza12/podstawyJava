package classesAndObjects.statics.methods;

public class Main {
    public static void main(String[] args) {
        //Wywołanie metody statycznej "printNumber()" bez utworzenia obiektu
        StaticMethodsExample.printNumber(10);

        //Wywołanie metody statycznej "printNumber()" na utworzonym obiekcie
        //Praktyka ta nie jest polecana, kompilator informuje nas o nietypowym użyciu metody
        StaticMethodsExample staticMethodsExample = new StaticMethodsExample();
        staticMethodsExample.printNumber(20);

        //Zmienna pomocnicza do przechowania wyniku
        int result = 0;

        //Wywołanie metody statycznej i przypisanie zwróconego wyniku do zmiennej 'result'
        result = StaticMethodsExample.squared(5);
        //Wypisanie zmiennej 'result' na ekran
        System.out.println("Wynik potęgowania = " + result);

    }
}

