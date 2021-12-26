import java.util.ArrayList;

//Class that carries all playgrounds owners and their information.
public class PlayGroundOwner {
    private String name;
    private Ewallet wallet;
    private ArrayList<PlayGround> ownedPlaygrounds;
    private String email;
    private String id;
    private String location;
    private String password;
    //Constructor.
    public PlayGroundOwner(String n, String e, String ID, String loc, String pass){
        name = n;
        email = e;
        id = ID;
        location = loc;
        password = pass;
    }
    //Setters and getters.
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public String getLocation() {
        return location;
    }

    public void setEmail(String mail) {
        email = mail;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String psswd) {
        password = psswd;
    }
    public String getPassword() {
        return password;
    }

    public void setId(String i) {
        id = i;
    }

    public String getId() {
        return id;
    }
    public void addPlayGround(String nam, String loc){

    }
    public void managePlayGround(Integer index){

    }
}

