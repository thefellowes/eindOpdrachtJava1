package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Observable;

public class ListViewController extends ViewController {

    @FXML protected void handleRemoveButtonAction(ActionEvent event) {
        return;
    }

    public void removeMovie() {
        return;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("notified ListViewController");
        return;
    }

    private final ObservableList<Movie> movieDataObservableList
            = FXCollections.observableArrayList();
    public TableView movieTable;
    public Button getMoviesButton;

    public void getMoviesButton() {
        //getMoviesFromController();
    }

    /*private void getMoviesFromController() {
        ListViewController controller = new ListViewController();
        try {
            movieDataObservableList.setAll(controller.getMovies());
        } catch (IOException e) {
            System.out.println("Failed to connect to the controller");
        }
    }*/

    public ObservableList<Movie> getMovieDataObservableList() {
        return movieDataObservableList;
    }
}
