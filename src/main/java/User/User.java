package User;

public class User {
    private final  int id;
    private String adress;
    private String userName;
    private String passwort;
    private String email;

    public User(int id, String adress, String userName, String passwort, String email){
        this.id = id;
        this.adress = adress;
        this.userName = userName;
        this.passwort =passwort;
        this.email = email;
    }


    public String getPasswort() {
        return passwort;
    }

    public int getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}


