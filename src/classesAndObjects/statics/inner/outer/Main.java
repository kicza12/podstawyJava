package classesAndObjects.statics.inner.outer;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiektu klasy zewnętrznej OUT1
        MyOuterClass myOuterClass_1 = new MyOuterClass();
        //Utworzenie obiektu klasy wewnętrznej(IN1) metodą init na rzecz obiektu klasy zewnętrznej(OUT1)
        MyOuterClass.MyInnerClass myInnerClass_1 = myOuterClass_1.init();
        //Wywołanie metody na obiekcie klasy wewnętrznej
        myInnerClass_1.printNumber();

        //DODATKOWY PRZYKŁAD (OBRAZEK OBJAŚNIAJĄCY NA GRUPIE)
        //Utworzenie klasy zewnętrzenej z inicjalizacją zmiennej przez konstruktor OUT2
        MyOuterClass myOuterClass_2 = new MyOuterClass(10);
        //Utworzenie obiektu klasy wewnętrznej(IN2) metodą init na rzecz obiektu klasy zewnętrznej(OUT2)
        MyOuterClass.MyInnerClass myInnerClass_2 = myOuterClass_2.init();

        //Wywołanie metody na rzecz obiektu IN1 korzysta z danych OUT1 (rysunek)
        myInnerClass_1.extra();
        //Wywołanie metody na rzecz obiektu IN2 korzysta z danych OUT2 (rysunek)
        myInnerClass_2.extra();
    }
}

