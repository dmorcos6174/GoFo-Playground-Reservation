import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    //Array that carries the playgrounds.
    static ArrayList<PlayGround> playgroundList = new ArrayList();
    //Array that carries the players.
    static ArrayList<Player> playerList = new ArrayList();
    //Array that carries the playground owners.
    static ArrayList<PlayGroundOwner> playgroundownerList = new ArrayList();
    //Sign up function that adds the player to the list.
    static public void signUpPlayer(Player p){
        playerList.add(p);
        System.out.println("Player Sign Up Successful!");
    }
    //Sign up function that adds the playground owners to the list.
    static public void signUpPlayGroundOwner(PlayGroundOwner pgo){
        playgroundownerList.add(pgo);
        System.out.println("Playground Owner Sign Up Successful!");
    }
    //Function that adds playgrounds to the list after checking their status.
    static public void addPlayground(PlayGround pg){
        System.out.println("Playground request sent to admin!");
        if(pg.getStatus()){
            System.out.println("Playground Accepted by admin!");
            playgroundList.add(pg);
        }
        else if(!pg.getStatus()){
            System.out.println("Playground request pending for approval!");
        }
    }

    public static void main(String[] args) {

        //Player Registration
        System.out.println("Enter Player Name:");
        String n = input.nextLine();
        System.out.println("Enter Player Email:");
        String e = input.nextLine();
        System.out.println("Enter Player ID:");
        String ID = input.nextLine();
        System.out.println("Enter Player Location:");
        String loc = input.nextLine();
        System.out.println("Enter Player Password:");
        String pass = input.nextLine();

        Player p1 = new Player(n, e, ID, loc, pass);
        signUpPlayer(p1);


        //Playground Owner Registration
        System.out.println("Enter PGO Name:");
        String n1 = input.nextLine();
        System.out.println("Enter PGO Email:");
        String e1 = input.nextLine();
        System.out.println("Enter PGO ID:");
        String ID1 = input.nextLine();
        System.out.println("Enter PGO Location:");
        String loc1 = input.nextLine();
        System.out.println("Enter PGO Password:");
        String pass1 = input.nextLine();

        PlayGroundOwner pgo1 = new PlayGroundOwner(n1, e1, ID1, loc1, pass1);
        signUpPlayGroundOwner(pgo1);

          //Adding a new playground request
//        System.out.println("Playground Owner Menu");
//        System.out.println("---------------------");
//        System.out.println("1- Add a new playground");
//        System.out.println("2- View all playgrounds");
//        String choice = input.nextLine();
//        switch(choice){
//            case "1"://////////////Add New Playground
//                System.out.println("Enter Playground Name:");
//                String n2 = input.nextLine();
//                System.out.println("Enter Playground location:");
//                String loc2 = input.nextLine();
//                System.out.println("Enter Playground hours:");
//                String h2 = input.nextLine();
//                System.out.println("Enter Playground Price/hour:");
//                String p = input.nextLine();
//                PlayGround pg = new PlayGround(n2, loc2, h2, p, pgo1);
//                addPlayground(pg);
//                break;
//        }

        //Sample Playgrounds
        PlayGround pg1 = new PlayGround("Name1", "Masr EL Gdida", "Saturday - Thursday 10:00AM-11:00AM, 11:30AM - 12:30AM","60/hour", pgo1);
        PlayGround pg2 = new PlayGround("Name2", "Giza", "Saturday - Thursday 10:00PM-11:00PM, 11:30AM - 12:30AM","50/hour", pgo1);
        playgroundList.add(pg1);
        playgroundList.add(pg2);

        //Viewing and Booking a playground
        System.out.println("Player Menu");
        System.out.println("---------------------");
        System.out.println("1- View available playgrounds");
        System.out.println("2- Manage Account");
        String choice1 = input.nextLine();
        switch(choice1){
            case "1"://////////////View playgrounds
                System.out.println("---------------------");
                System.out.println("Available Playgrounds");
                for (int i = 0; i < playgroundList.size(); i++){
                    int no = i+1;
                    System.out.println("Playground #" + no + ":");
                    System.out.println(playgroundList.get(i));
                    System.out.println("---------------------");
                }
                System.out.println("Enter number of playground to view/book");
                String ind = input.nextLine();
                int index = Integer.parseInt(ind);
                System.out.println(playgroundList.get(index-1));
                System.out.println("---------------------");
                System.out.println("1- Book Playground");
                System.out.println("2- Go back");
                String cg = input.nextLine();
                switch(cg){
                    case "1"://////////Book Playground
                        System.out.println("Enter preferred time slot to reserve: ");
                        String t = input.nextLine();
                        playgroundList.get(index-1).book(t,p1);
                        System.out.println("Booking Successful");
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}
