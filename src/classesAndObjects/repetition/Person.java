package classesAndObjects.repetition;

//publiczna klasa Person
//dostępna w całym projekcie
public class Person {

    //Pola klasy, są prywatne, niedostępne poza klasą
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    //Konstruktor z argumentami
    //Tworzy obiekt typu Person i inicjalizuje jego pola przekazanymi wartościami
    public Person(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    //Konstruktor bezargumentowy (domyślny)
    //Tworzy obiekt typu Person ale nie inicjalizuje jego pól
    public Person() {

    }

    //PONIEŻE METODY SĄ PUBLICZNE
    //OZNACZA TO, ŻE MOŻNA JE WYWOŁAĆ NA RZECZ OBIEKTU TEJ KLASY W DOWOLNYM PAKIECIE APLIKACJI

    //getter, zwraca wartość pola firstName obiektu na którym go wywołano
    public String getFirstName() {
        return this.firstName;
    }

    //getter, zwraca wartość pola lastName obiektu na którym go wywołano
    public String getLastName() {
        return lastName;
    }

    //getter, zwraca wartość pola age obiektu na którym go wywołano
    public int getAge() {
        return age;
    }

    //getter, zwraca wartość pola height obiektu na którym go wywołano
    public int getHeight() {
        return height;
    }

    //setter, ustawia wartość pola firstName obiektu, na ktorym został wywołana
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //setter, ustawia wartość pola lastName obiektu, na ktorym został wywołana
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //setter, ustawia wartość pola age obiektu, na ktorym został wywołana
    public void setAge(int age) {
        this.age = age;
    }

    //setter, ustawia wartość pola height obiektu, na ktorym został wywołana
    public void setHeight(int height) {
        this.height = height;
    }

    //metoda w klasie, może zostać wywołana na rzecz każdego obiektu tej klasy
    //metoda ta demonstruje użycie "return" w metodzie, która nie zwraca wyniku
    //Słowo "void" określa brak typu zwrotnego meotdy -> public void testMethod()
    //Dla przykładu gettery (np. metoda getAge()) zwaraca typ int -> public int getAge()
    //W przypakdu wykonania się instrukcji "return" metoda po prostu kończy działanie nie zwracając wyniku
    //Ta metoda nie robi nic dla parzystego wieku (kiedy pole "age" dzieli się przez 2)
    //W przypadku kiedy wiek jest nieparzysty (kiedy pole "age" nie dzieli się przez 2)
    //Metoda ta wypisuje na ekran "Return się nie wykonał"
    public void testMethod() {
        if (this.age % 2 == 0) {
            return;
        }
        System.out.println("Return się nie wykonał");
    }

    //metoda toString(), pozwala na wyświetlenie wartości pól danego obiektu
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

