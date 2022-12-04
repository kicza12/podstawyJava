package repetition.objects;

public class Main {
    public static void main(String[] args) {

        //Utworzenie obiektu User konstruktorem bezargumentowym
        //Pola tego obiektu mają wartości default
        User user_1 = new User();

        //Utworzenie obiektu typu User z przekazaniem wartości dla pól tego obiektu
        //Pola tego obiektu posiadają przekazane wartości
        User user_2 = new User("PA", "123", "pa@gmail.com");

        //Porównanie referencji utworzonych obiektów
        System.out.println(user_1);
        System.out.println(user_2);

        System.out.println("Wywołanie getterów, pokazanie wartości pól");
        //Porównanie wartości pól obiektów przy wykorzystaniu getterów do tyhc pól
        System.out.println("Porównanie pola login dla user_1 i user_2");
        System.out.println(user_1.getLogin());
        System.out.println(user_2.getLogin());

        System.out.println("Porównanie pola password dla user_1 i user_2");
        System.out.println(user_1.getPassword());
        System.out.println(user_2.getPassword());

        System.out.println("Porównanie pola emailAddress dla user_1 i user_2");
        System.out.println(user_1.getEmailAddress());
        System.out.println(user_2.getEmailAddress());

        //Wywołanie setterów
        System.out.println("Wywołanie setterów");
        user_1.setLogin("User_1");
        user_1.setPassword("Password_For_User_1");

        user_2.setEmailAddress("someEmail@gmail.com");


        System.out.println("Ponownie wyświeltenie wartości pól obiektów po wcześniejszym wywołaniu setterów");
        //Porównanie wartości pól obiektów po wywołaniu setter dla niektórych pól
        System.out.println("Porównanie pola login dla user_1 i user_2");
        System.out.println(user_1.getLogin());
        System.out.println(user_2.getLogin());

        System.out.println("Porównanie pola password dla user_1 i user_2");
        System.out.println(user_1.getPassword());
        System.out.println(user_2.getPassword());

        System.out.println("Porównanie pola emailAddress dla user_1 i user_2");
        System.out.println(user_1.getEmailAddress());
        System.out.println(user_2.getEmailAddress());
    }
}

