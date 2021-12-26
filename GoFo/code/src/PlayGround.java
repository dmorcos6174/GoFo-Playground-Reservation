import java.util.ArrayList;

//Class that carries playground information.
public class PlayGround {
    private String name;
    private String location;
    private PlayGroundOwner owner;
    private Boolean status = false;
    private ArrayList<Reservation> reservation;
    private String hours;
    private String priceperhour;
    //Constructor.
    public PlayGround(String n, String loc, String h, String p, PlayGroundOwner pgo){
        name = n;
        location = loc;
        hours = h;
        priceperhour = p;
        owner = pgo;
    }
    //To print the details of a certain playground.
    @Override
    public String toString(){
        return "Playground Details:\n" +
                "Name: " + name + "\n" +
                "Location: " + location + "\n" +
                "Hours: " + hours + "\n" +
                "Price/hour: " + priceperhour + "\n";
    }
    //Function that books a playground through creating new reservation.
    public void book(String timeslot, Player p){
        Reservation r = new Reservation(timeslot, p);

    }
    //Setters and getters.
    public void setHours(String h){
        hours=h;
    }
    public String getHours(){
        return hours;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setLocation(String loc){
        location=loc;
    }
    public String getLocation(){
        return location;
    }
    public void setStatus(Boolean stat){
        status=stat;
    }
    public Boolean getStatus(){
        return status;
    }
    public void setPlayGroundOwner(PlayGroundOwner pgo){
        owner=pgo;
    }

    public String getPriceperhour() {
        return priceperhour;
    }

    public void setPriceperhour(String p) {
        priceperhour = p;
    }
}
