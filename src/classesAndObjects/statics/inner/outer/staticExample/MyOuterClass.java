package classesAndObjects.statics.inner.outer.staticExample;
//Klasa zewnętrzna
public class MyOuterClass {
    //Wewnętrzna klasa statyczna
    public static class MyInnerClass {

    }
    //Metoda zwracająca obiekt klasy wewnętrznej
    public MyInnerClass init() {
        return new MyInnerClass();
    }
}
