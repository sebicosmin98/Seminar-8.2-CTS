import java.util.ArrayList;
import java.util.List;

public class Main {

                                                                                    // Observer



    public static void main(String[] args){

        UpdateServer updateServer = new UpdateServer("ios13");

        CarOS carOS1 = new CarOS("ios10");
        CarOS carOS2 = new CarOS("ios11");
        CarOS carOS3 = new CarOS("ios12");

        updateServer.addObservers(carOS1);
        updateServer.addObservers(carOS2);
        updateServer.addObservers(carOS3);

        System.out.println(carOS1.lastUpdate);
        System.out.println(carOS2.lastUpdate);
        System.out.println(carOS3.lastUpdate);

        updateServer.pushUpdates("ios14");

        System.out.println(carOS1.lastUpdate);
        System.out.println(carOS2.lastUpdate);
        System.out.println(carOS3.lastUpdate);

    }
}
