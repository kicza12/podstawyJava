public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int globalVariable = 4;

    public void someMethod() {
        int localVariable = 5;
        System.out.println("Suma zmiennej globalnej i lokalnej wynosi = " + (globalVariable + localVariable));

    }
}