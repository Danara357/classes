package classes;

public class Autor {
    private String firstName;
    private String midlName;
    private String lastName;

    public Autor(String firstName, String midlName, String lastName) {
        this.firstName = firstName;
        this.midlName = midlName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMidlName() {
        return this.midlName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
