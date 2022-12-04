package variables;

public class IncreDecre {
    public static void main(String [] args) {
        int i = 1;

        System.out.print("Wartość i = " + i);// = 1

        System.out.println("Wartość podczas postinkrementacji i = " + i++);// najpierw wydrukuje wartość i, a dopiero w następnej linii doda 1

        System.out.println("Wartość po postinkrementacji i = " + i);// = 2

        System.out.println("Wartość podczas preinkrementacji i = " + ++i);// doda 1 i wydrukuje wynik i+1

        System.out.println("Wartość po preinkrementacja i = " + i);//wydrukuje wynik i+1

        System.out.println("Obecna wartość i = " + i);// = 3

        System.out.println("Wartość podczas postdekrementacji i = " + i--);//najpierw wydrukuje wartość i, a dopiero w następnej lini odejmie 1

        System.out.println("Wartość po postdekrementacji i = " + i);// = 2

        System.out.println("Wartość podczas predekrementacji i = " + --i);// odejmie 1 i wydrukuje wynik i-1

        System.out.println("Wartość po predekrementacji i = " + i);// = 1
    }
}

