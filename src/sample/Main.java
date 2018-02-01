package sample;

//import com.sun.tools.javac.util.Name;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends Application {
    //Stage window;
    //TableView<Movie> table;

    private int width = 500;
    private int height = 375;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

        //Inserting some test data
        List<Movie> movies = new ArrayList<Movie>(Arrays.asList(
            new Movie("myFirstMovie", 2017, "Somewhere over the rainbow", 100.000),
            new Movie("mySecondMovie", 2016, "Somewhere over the rainbow", 20.000),
            new Movie("BraveHeart", 1995, "Scotland", 200.000)
        ));

        Model model = new Model(movies);

        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent listViewRoot = fxmlLoader.load(getClass().getResource("listView.fxml").openStream());
        ListViewController listViewController = (ListViewController) fxmlLoader.getController();
        Stage listViewStage = new Stage();
        listViewStage.setTitle("listView");
        listViewStage.setScene(new Scene(listViewRoot, width, height));
        listViewStage.show();

        FXMLLoader fxmlLoader2 = new FXMLLoader();
        Parent addViewRoot = fxmlLoader2.load(getClass().getResource("addView.fxml").openStream());
        AddViewController addViewController = (AddViewController) fxmlLoader2.getController();
        Stage sampleStage2 = new Stage();
        sampleStage2.setTitle("addViewController");
        sampleStage2.setScene(new Scene(addViewRoot, width, height));
        sampleStage2.show();

        FXMLLoader fxmlLoader3 = new FXMLLoader();
        Parent graphViewRoot = fxmlLoader3.load(getClass().getResource("graphView.fxml").openStream());
        GraphViewController graphViewController = (GraphViewController) fxmlLoader3.getController();
        Stage sampleStage3 = new Stage();
        sampleStage3.setTitle("graphView");
        sampleStage3.setScene(new Scene(graphViewRoot, width, height));
        sampleStage3.show();

        // add observers to the model class
        model.addObserver(addViewController);
        model.addObserver(graphViewController);
        model.addObserver(listViewController);

        // test notifier
        model.notifyInit();

    }
}
