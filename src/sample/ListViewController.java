package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.util.List;
import java.util.Observable;
import javafx.stage.Stage;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;


public class ListViewController extends ViewController {

    private Model model;
    private VBox vBox;
    //TableView<Movie> table;

    /*@FXML
    private TableColumn<Movie, String> nameColumn;

    @FXML
    private TableColumn yearColumn;

    @FXML
    private TableColumn originColumn;

    @FXML
    private TableColumn budgetColumn;*/

    @FXML
    protected void handleFetchMovies(ActionEvent event) {
        List<Movie> movies = getMovies();
        for (Movie m : movies){
            System.out.println(m.getName() + " " + m.getProductionYear() + " " + m.getCountryOfOrigin() + " " + m.getBudget());
        }
   }

    @FXML protected void handleRemoveButtonAction(ActionEvent event) {
        return;
    }

    public void removeMovie() {
        return;
    }

    @Override
    public void update(Observable o, Object model) {
        this.model = (Model) model;
        System.out.println("updated ListViewController");
        return;
    }

    public List<Movie> getMovies() {
        List<Movie> movies = model.getMovies();
        return movies;
    }
}
