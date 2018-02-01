package sample;
import java.util.Observable;
import java.util.Observer;

// Observer Pattern
public abstract class ViewController implements Observer {

    public String getName() {
        return "";
    }

    public int getProductionYear() {
        return 1;
    }

    public String getCountryOfOrigin() {
        return "";
    }

    public double getBudget() {
        return 1;
    }

    @Override
    public abstract void update(Observable o, Object arg);

}
