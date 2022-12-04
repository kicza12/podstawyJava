package standard_in_out;

public class PrintExamples {
    public static void main(String[] args) {
        //Przykład wydruku na ekran bez formatowania
        int myNumber = 125;
        System.out.println("This is a simple text");
        System.out.println(myNumber);

        //Przykład wydruku na ekran z formatowania
        double result = 100.0 / 3.0;
        // %5.2 oznacza - odwołanie się do liczby zmiennoprzecinkowej, wyświetlenie jej 5 cyfr w tym 2 po przecinku
        System.out.printf("100.0 / 3.0 = %5.2f \n", 100.0 / 3.0);
        System.out.printf("100.0 / 3.0 = %5.2f \n", result);

        // %4d oznacza - odwołanie do liczby całkowitej, wyświetlenie jej 4 cyfr (jeśli tyle posiada, może być mniej)
        System.out.printf("100 / 3 = %4d", 100 / 3);
    }
}
