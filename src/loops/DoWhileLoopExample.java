package loops;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        //zmienna pomocnicza do pętli
        int i = 0;
        //Pętla do while wykonuję się przynajmniej raz
        //Warunek przy while sprawdzany jest na końcu pętli
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);

        System.out.println("Obecna wartość i przed wejściem w kolejną pętle i = " + i);

        //Pomimo, że i = 10 i warunek w while nie jest spełniony pętla wykona się raz
        //To właśnie odróżnia pętle "do while" od pętli "while
        //Gwarantuje ona wykonanie się kodu zapisanego w niej przynajmnije raz!!!
        do {
            System.out.println("To wykona się raz pomimo niespełnionego warunku i < 10");
            i++;
        } while (i < 10);
    }
}
