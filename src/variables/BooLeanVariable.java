package variables;

public class BooLeanVariable {
    public static void main(String[] args) {
        boolean myBooLean_1 = true;
        boolean myBooLean_2 = false;

        boolean andResult = myBooLean_1 && myBooLean_2;
        System.out.println("Wynik iloczynu logicznego = " + andResult); //&& oznacza and lub iloczyn

        boolean orResult = myBooLean_1 || myBooLean_2;
        System.out.println("Wynik sumy logicznej = " + orResult); //|| oznacza or lub sumę logiczną

        if (andResult) { // andResult = false -> dlatego ciało instrukcji if nie zostanie wykonane
            System.out.println("Ten komunikat nie wyświetli się");
        }
        if (orResult) { // andResult = true -> dlatego ciało instrukcji if zostanie wykonane
            System.out.println("Wnętrze instrukcji sterującej if");
        }
        int x = 11;
        if (x > 10) {
            System.out.println("X jest większy od 10");//warunek spełniony
        }

        if (x < 10) {
            System.out.println("Tutaj warunek nie jest spełniony");//nie wydrukuje nic
        }
    }
}
