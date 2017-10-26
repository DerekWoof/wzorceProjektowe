package pl.sdacademy.designpatterns;

public class Pope {
    private String firstName = "Abc";
    private String lastName = "Cde";

    private static Pope instance;

    private Pope() {

    }

    public static Pope getInstance() {
        if (instance == null) {
            instance = new Pope();
        }
        return instance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
