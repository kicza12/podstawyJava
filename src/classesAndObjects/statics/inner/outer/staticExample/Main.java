package classesAndObjects.statics.inner.outer.staticExample;

public class Main {
    public static void main(String[] args) {
        //Utowrzenie obiektu klasy zewnętrznej
        MyOuterClass myOuterClass = new MyOuterClass();
        //Utworzenie obiektu klasy wewnętrznej przy użyciu obiektu klasy zewnętrznej
        //(tak jak w poprzednim przykładzie-> pakiet 'inner_outer'
        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
        //Utworzenie obiektu klasy wewnętrznej bez tworzenia obiektu klasy zewnętrznej
        //Takie podejście umożliwia nam zadeklarowanie klasy wewnętrznej jak i static
        MyOuterClass.MyInnerClass myInnerClass1 = myOuterClass.init();
    }
}
