package variables;

public class VariableExample {
    public static void main(String[] args) {
        int someNumber;//Deklaracja zmiennej liczbowej "someNumber"
        someNumber = 17;//Inicjalizacja zmiennej liczbowej "someNumber"

        System.out.println("Moja zmienna ma wartość = " + someNumber);
        someNumber = 5; //Przypisanie nowej wartości zmiennej

        System.out.println("Moja zmienna ma wartość = " + someNumber);
        //VariableScope variableScope = new VariableScope();
        //variableScope.someMethod();
        final int MY_FINAL_VARIABLE = 15;
        System.out.println("Moja finalna zmienna = " + MY_FINAL_VARIABLE);

    }
}
