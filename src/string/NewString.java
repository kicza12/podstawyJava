package string;

public class NewString {
    public static final String SOME_CONSTANT = "HELLO"; //stała jest pisana dużymi literami; final oznacza że nie można jej przypisać nowej referencji
    public static void main(String[] args) {
        String myString = "My String ";
        myString += "New text";
        myString += SOME_CONSTANT;
        String newString = myString.intern();

        System.out.println(myString);
        System.out.println(newString);
//KONKATENCJA STRINGÓW
        String objectString = new String("Hohoho");
        String intern = objectString.intern();
        String text1 = "My name is ";
        String text2 = "John Doe";
        String finalText = text1 + text2;
        System.out.println(finalText);

        String text3 = "This is";
        String text4 = "a test";
        String finalText2 = text3 + text4;
        System.out.println(finalText2);
//PORÓWNYWANIE STRINGÓW
        System.out.println(finalText.equals(finalText2));
        String test1 = "Test";
        String test2 = "Test";
        System.out.println(test1.equals(test2));
//METODY KLASY STRING
        System.out.println("This is test value".length());//podaje długość łańcucha
        System.out.println(finalText.toLowerCase());//wydrukuje wartość stringa z małych liter
        System.out.println(finalText.toUpperCase());//wydrukuje wartość stringa z dużych liter
        String testValue = "This is a test value";
        System.out.println(testValue.indexOf("is"));//podaje indeks danego wystąpienia litery lub wyrazu
        System.out.println(testValue.replaceAll("s", "P"));//zamienia podane litery na inne
    }
}
