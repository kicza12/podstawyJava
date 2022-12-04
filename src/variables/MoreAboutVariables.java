package variables;

public class MoreAboutVariables {
    //Stała globalna, widziana w całej klasie
    private final int globalVariable = 10;

    public void someMethod() {
        //Zmienna localna, widziana tylko w tej metodzie
        int localVariable;

        //Dostęp do zmiennej globalnej
        localVariable = globalVariable / 2;

        System.out.println("My global variable = " + globalVariable);
        System.out.println("My local variable = " + localVariable);
    }


    //metoda tej klasy, ma dostęp do zmiennej globalnej
    public int calculate() {
        //Zmienna lokalna dla metody calculate
        //Zmienna o tej samej nazwie w metodzie powyżej nie jest tą samą zmienną
        //Każda z nich jest widoczna tylko w danej metodzie
        int localVariable = 100;

        int result = globalVariable * localVariable;

        return result;
    }

    public static void main(String[] args) {
        // tworze obiekt typu MoreAboutVariables
        MoreAboutVariables myObject = new MoreAboutVariables();
        // Uruchomienie metody obiektu myObject
        myObject.someMethod();

        int methodResult = myObject.calculate();
        System.out.println("Metoda zwróciła wynik = " + methodResult);
    }
}

