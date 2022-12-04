package classesAndObjects;

import classesAndObjects.Movie;

//Tutaj uruchamiamy program
public class Main {
    public static void main(String[] args) {
        //Utowrzenie obiektu typu Movie
        Movie movie = new Movie();
        //Wywołania metody play() na obiekcie movie
        //w celu sprawdzenia wartości pola title = null
        //(pole zainicjalizowane wartością domyślną - default)
        movie.play();

        System.out.println("Wywoływanie pierwszego setter");

        //Wywołanie setter na obiekcie movie
        //i ustawienie wartości w oplu title
        movie.setTitle("8 pasażer nostromo");
        //Ponowne wywołanie metody play()
        //w celu zaobserwowania zmiany wartości pola title
        movie.play();

        System.out.println("Wywołanie pozostałych setterów");

        //Wywołanie settera i ustawienie wartosci pola description
        movie.setDescription("straszny kosmita, fuuuuj");
        //Wywołanie settera i ustawienie wartosci pola productionYear
        movie.setProductionYear(1972);
        //Sprawdzenie wartości pól w obiekcie
        movie.play();

        System.out.println("Poprawa wartości pola productionYear");
        //Ponowne ustawienie wartości pola productionYear
        movie.setProductionYear(1979);
        movie.play();

        System.out.println("Wywołanie getterów");
        //wywołanie getterów i wyświetlenie danych
        System.out.println(movie.getTitle());
        System.out.println(movie.getDescription());
        System.out.println(movie.getProductionYear());



        //INNY PRZYKŁAD NE GET I SET
        System.out.println("ODDZIELNY PRZYKLAD NA GETTER I SETTER");
        //Utworzenie obiektu
        Movie movie2 = new Movie();

        //Pobiera wartosc pola title
        String movieTitle = movie2.getTitle();
        System.out.println(movieTitle);

        //Ustawia wartość pola title dla obiektu movie2
        movie2.setTitle("Some movie");

        //Pobranie wartości pola title z obiektu movie2
        movieTitle = movie2.getTitle();
        System.out.println(movieTitle);

        //Ustawia nową wartość pola title dla obiektu movie2
        movie2.setTitle("New title");
        //Pobranie nowej wartości pola title z obiektu movie2
        movieTitle = movie2.getTitle();
        System.out.println(movieTitle);


        System.out.println("Przykład zmiennej statycznej");

        //Wyświetlenie wartości zmiennej statycznej dla klasy i obiektów
        //Zmienna statyczna jest taka sama dla każdego obiektu
        //Nazywamy ją zmienną klasową
        //Nie trzeba tworzyć obiektu aby się do niej odwołać (jak poniżej)
        System.out.println("Wartość z klasy = " + Movie.someInt);
        //Wywołanie metody z dostępem do zmiennej statycznej na rzecz dwóch obiektów
        //Wartość jets taka sama w każdym przypadku
        System.out.println("Wartość z obiektu = " + movie.getSomeInt());
        System.out.println("Wartość z obiektu2 = " + movie2.getSomeInt());

        //Zmiana wartości zmiennej statycznej
        Movie.someInt = 100;

        //Wyświetlenie zmienionej wartości zmiennej statycznej dla klasy i obiektów
        System.out.println("Wartość z klasy = " + Movie.someInt);
        System.out.println("Wartość z obiektu = " + movie.getSomeInt());
        System.out.println("Wartość z obiektu2 = " + movie2.getSomeInt());


        ///UŻYCIE KONSTRUKTORA PARAMETRYZOWANEGO i wyświetlenie pól obiektu
        System.out.println("Wypisanie danych z obiektu tworzonego przez konstruktor parametryzowany");
        Movie movie3 = new Movie("Star Wars 3", "Miecze świetlne brzrzzrrz", 2015);
        System.out.println(movie3.getTitle());
        System.out.println(movie3.getDescription());
        System.out.println(movie3.getProductionYear());
    }
}
