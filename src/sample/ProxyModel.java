package sample;

import javafx.collections.ObservableList;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

// Observer Pattern
// proxy pattern
public class ProxyModel implements Observer {

    private Model realModel;

    public List<Movie> getMovies() {
        return realModel.getMovies();
    }

    // Observer Pattern
    @Override
    public void update(Observable o, Object model) {
        this.realModel = (Model) model;

        System.out.println("updated proxy");
    }


}
