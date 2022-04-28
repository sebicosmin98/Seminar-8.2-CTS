import java.util.ArrayList;
import java.util.List;

public class UpdateServer {

    public String updatePackage;
    public List<CarOS> observers;

    public UpdateServer(String updatePackage) {
        this.updatePackage = updatePackage;
        this.observers = new ArrayList<>();
    }

    void pushUpdates(String updatePackage){

        this.updatePackage = updatePackage;
        for(CarOS a : this.observers){

            a.update(updatePackage);

        }

    }

    void addObservers(CarOS observer){

        this.observers.add(observer);
    }


    void deleteObserver(CarOS observer){

        this.observers.remove(observer);
    }



}
