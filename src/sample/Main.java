package sample;

//import com.sun.tools.javac.util.Name;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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

        Model model = new Model();
//        window = primaryStage;
//        window.setTitle("List of movies");
//
//        //Set the column names
//        //Name
//        TableColumn<Movie, String> nameColumn = new TableColumn<>("Name");
//        nameColumn.setMinWidth(200);
//        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//
//        //Production Year
//        TableColumn<Movie, Integer> yearColumn = new TableColumn<>("Year");
//        yearColumn.setMinWidth(200);
//        yearColumn.setCellValueFactory(new PropertyValueFactory<>("productionYear"));
//
//        //Country of origin
//        TableColumn<Movie, String> originColumn = new TableColumn<>("Origin");
//        originColumn.setMinWidth(200);
//        originColumn.setCellValueFactory(new PropertyValueFactory<>("countryOfOrigin"));
//
//        //Budget
//        TableColumn<Movie, Double> budgetColumn = new TableColumn<>("Budget");
//        budgetColumn.setMinWidth(200);
//        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("budget"));
//
//        //Setting the table
//        table = new TableView<>();
//        table.setItems(getMovieList());
//        table.getColumns().addAll(nameColumn, yearColumn, originColumn, budgetColumn);
//
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(table);
//
//        Scene scene = new Scene(vBox);
//        window.setScene(scene);
//        window.show();


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
        model.notifytest();

    }

    //Get all of the movies
    public ObservableList<Movie> getMovieList() {
        ObservableList<Movie> movies = FXCollections.observableArrayList();
        movies.add(new Movie("MyName", 1994, "Netherlands", 100000));
        movies.add(new Movie("anotherName", 2016, "Budapest", 999199));
        movies.add(new Movie("Peter de eekhoorn", 1000, "Germany", 10));

        return movies;
    }
}
