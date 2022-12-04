package repetition.objects;
//Moja klasa
public class User {

    //pola klasy (każdy obiekt tej klasy zawiera swój własny zestaw tych pól)
    private String login;
    private String password;
    private String emailAddress;

    //konstruktor bezargumentowy (domyślny)
    //Tworzy obiekt klasy bez przypisywania polom obiektu konkretnych wartości (wartości pól będą domyślne)
    public User() {

    }

    //Konstruktor parametrowy, przyjmuje wartości i przypisuje je do pól obiektu (inicjalizuje pola obiektu konkretnymi wartościami)
    public User(String login, String password, String emailAddress) {
        this.login = login;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    //getter dla pola login
    //zwraca wartośc pola login
    public String getLogin() {
        return login;
    }

    //getter dla pola password
    //zwraca wartośc pola password
    public String getPassword() {
        return password;
    }

    //getter dla pola emailAddress
    //zwraca wartośc pola emailAddress
    public String getEmailAddress() {
        return emailAddress;
    }

    //setter dla pola login
    //ustawia przekazaną wartość w polu login
    public void setLogin(String login) {
        this.login = login;
    }

    //setter dla pola password
    //ustawia przekazaną wartość w polu password
    public void setPassword(String password) {
        this.password = password;
    }

    //setter dla pola emailAddress
    //ustawia przekazaną wartość w polu emailAddress
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


}
