package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

        Model model = new Model();

        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent listViewRoot = fxmlLoader.load(getClass().getResource("listView.fxml").openStream());
        ListViewController listViewController = (ListViewController) fxmlLoader.getController();
        Stage listViewStage = new Stage();
        listViewStage.setTitle("listView");
        listViewStage.setScene(new Scene(listViewRoot, 300, 275));
        listViewStage.show();

        FXMLLoader fxmlLoader2 = new FXMLLoader();
        Parent addViewRoot = fxmlLoader2.load(getClass().getResource("addView.fxml").openStream());
        AddViewController addViewController = (AddViewController) fxmlLoader2.getController();
        Stage sampleStage2 = new Stage();
        sampleStage2.setTitle("addViewController");
        sampleStage2.setScene(new Scene(addViewRoot, 300, 275));
        sampleStage2.show();

        FXMLLoader fxmlLoader3 = new FXMLLoader();
        Parent graphViewRoot = fxmlLoader3.load(getClass().getResource("graphView.fxml").openStream());
        GraphViewController graphViewController = (GraphViewController) fxmlLoader3.getController();
        Stage sampleStage3 = new Stage();
        sampleStage3.setTitle("graphView");
        sampleStage3.setScene(new Scene(graphViewRoot, 300, 275));
        sampleStage3.show();

        // add observers to the model class
        model.addObserver(addViewController);
        model.addObserver(graphViewController);
        model.addObserver(listViewController);

        // test notifier
        model.notifytest();

    }
}
