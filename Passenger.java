package busCore;

public class Passenger extends User {
    public static int  passengerCount=0;
    public static boolean loggedpassenger=false;

    public static Bus[] rides=new Bus[10];
    public  int ride_count=0;
    public Passenger(String username, String password) {
        super(username, password);
        passengerCount++;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRide_count() {
        return ride_count++;
    }


    public void setRide_count(int ride_count) {
        this.ride_count = ride_count;
    }

    public static void setLoggedpassenger(boolean loggedpassenger) {
        Passenger.loggedpassenger = loggedpassenger;
    }



}
