package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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

// Observer Pattern
// Adapter pattern
public class ListViewController extends ViewController {

    private Model model;
    private VBox vBox;

//    TableView<Movie> table;

    @FXML
    private TableView<Movie> movieTable;

    @FXML
    private TableColumn nameColumn;

    @FXML
    private TableColumn yearColumn;

    @FXML
    private TableColumn originColumn;

    @FXML
    private TableColumn budgetColumn;

    @FXML
    private Button rmMovieButton;

    @FXML
    protected void handleFetchMovies(ActionEvent event) {
        List<Movie> movies = getMovies();
        for (Movie m : movies){
            System.out.println(m.getName() + " " + m.getProductionYear() + " " + m.getCountryOfOrigin() + " " + m.getBudget());
        }
   }

    @FXML
    protected void handleRemoveButtonAction(ActionEvent event) {
        Movie toDelete = movieTable.getSelectionModel().getSelectedItem();
        model.removeMovie(toDelete);
//        System.out.println("[Debug] rm");
    }


    // Observer Pattern
    @Override
    public void update(Observable o, Object model) {
        this.model = (Model) model;

        ObservableList<Movie> data = movieTable.getItems();
        data.setAll(((Model) model).getMovies());
        System.out.println("updated ListViewController");
    }

    // Adapter pattern
    private List<Movie> getMovies() {
        List<Movie> movies = model.getMovies();
        return movies;
    }
}
