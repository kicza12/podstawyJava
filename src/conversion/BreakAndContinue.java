package conversion;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Pętla for wypisuje co drugą liczbę przy użyciu continue");
        //Przykład pętli for z continue
        //W przypadku wykonania się instrukcji continue obecny krok pętli jest pomijany
        //Kod ponieżej continue nie jest wykonywany
        //W tym przpadku omijamy co drugi krok wypisując co drugą liczbę
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        //Przykład pętli while z instrukcją break
        //Instrukcja break kończy działanie pętli natychmiast
        //Poniższa pętla jest pętlą nieskończoną -> while(true) jest zawsze prawdzimy
        //W przypadku gdy j > 50 wykonywana jest instrukcja break i pętla kończy działanie
        System.out.println("Pętla nieskończona while przerywana przez instrukcje break");
        int j = 0;
        while (true) {
            if (j > 50) {
                break;
            }
            j++;
        }
        //Sprawdzenie przy jakiej wartości j pętla while przestała działać
        System.out.println("j = " + j);
    }
}

