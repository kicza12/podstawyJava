package classesAndObjects.statics;

public class Main {
    public static void main(String[] args) {
    //Wyświetlenie początkowego stanu licznika
        System.out.println("Wartość początkowa licznika");
        System.out.println(StaticExample.getCounter());

    //Utworzenie pierwszego obiektu
    StaticExample staticExample_1 = new StaticExample();

    //Wyświetlenie wartości licznika po utworzeniu pierwszego obiektu
    //Wykorzystujemy metodę statyczną bez utworzenia obiektu (klasową)
        System.out.println("Wartość licznika po utworzeniu pierwszego obiektu");
        System.out.println(StaticExample.getCounter());

    //Utworzenie drugiego obiektu
    StaticExample staticExample_2 = new StaticExample();

    //Wyświetlenie wartości licznika po utworzeniu drugiego obiektu
    //Wykorzystujemy metodę statyczną bez utworzenia obiektu (klasową)
        System.out.println("Wartość licznika po utworzeniu drugiego obiektu");
        System.out.println(StaticExample.getCounter());


    //Utworzenie 3 obiektu
    StaticExample staticExample_3 = new StaticExample();



}
}
