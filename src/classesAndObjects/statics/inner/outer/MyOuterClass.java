package classesAndObjects.statics.inner.outer;
//Klasa zewnętrzna
public class MyOuterClass {
    //Pole klasy MyOuterClass, każdy obiekt tej klasy będzie posiadał takie pole
    //Każdy obiekt bedzie posiadał swoje pole 'outerNumber'
    private int outerNumber = 5;

    //DODATKOWE POLE DO PRZYKŁADU
    private int extraNumber;

    //Konstruktor bez parametru (domyślny)
    public MyOuterClass() {

    }

    //Klasa wewnętrzna
    public class MyInnerClass {
        //metoda w klasie wewnętrznej('MyInnerClass') ma dostęp do pól klasy zewnętrznej('MyOuterClass')
        public void printNumber() {
            System.out.println(outerNumber);
        }

        //METODA DO DODATKOWEGOPRZYKŁADU
        public void extra() {
            System.out.println("outerNumber = "+ outerNumber + ", extraNumber = " + extraNumber);
        }
    }

    //Metoda klasy zewnętrznej('MyOuterClass') zwracająca obiekt klasy wewnętrznej('MyInnerClass')
    public MyInnerClass init() {
        return new MyInnerClass();
    }

    //KOD DO DODATKOWEGO PRZYKŁADU
    //Konstruktor z argumentem
    public MyOuterClass(int extraNumber) {
        this.extraNumber = extraNumber;
    }
}
