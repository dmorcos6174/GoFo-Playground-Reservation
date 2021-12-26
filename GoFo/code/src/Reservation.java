import java.time.LocalDateTime;
//Class that holds the reservations with detailed date and time.
public class Reservation {
    private String time;
    private Player reservationMaker;
    //Constructor.
    public Reservation(String t, Player p){
        time=t;
        reservationMaker = p;
    }
}
