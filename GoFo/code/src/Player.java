//Class that holds the players and their information.
public class Player {
    private String name;
    private Ewallet wallet;
    private String email;
    private String id;
    private String location;
    private String password;
    //Constructor.
    public Player(String n, String e, String ID, String loc, String pass){
        name = n;
        email = e;
        id = ID;
        location = loc;
        password = pass;
    }
    //setters and getters.
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        email = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String psswd) {
        password = psswd;
    }

    public String getId() {
        return id;
    }

    public void setId(String i) {
        id = i;
    }
}
