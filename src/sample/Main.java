package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Controller controller;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Model model = new Model();
        AddViewController addViewController = new AddViewController();
        GraphViewController graphViewController = new GraphViewController();
        ListViewController listViewController = new ListViewController();

        model.addObserver(addViewController);
        model.addObserver(graphViewController);
        model.addObserver(listViewController);

        model.notif();

        Parent listViewRoot = FXMLLoader.load(getClass().getResource("listView.fxml"));
        Stage listViewStage = new Stage();
        listViewStage.setTitle("listView");
        listViewStage.setScene(new Scene(listViewRoot, 300, 275));
        listViewStage.show();

        Parent sampleRoot2 = FXMLLoader.load(getClass().getResource("addView.fxml"));
        Stage sampleStage2 = new Stage();
        sampleStage2.setTitle("addView");
        sampleStage2.setScene(new Scene(sampleRoot2, 300, 275));
        sampleStage2.show();

        Parent sampleRoot3 = FXMLLoader.load(getClass().getResource("graphView.fxml"));
        Stage sampleStage3 = new Stage();
        sampleStage3.setTitle("graphView");
        sampleStage3.setScene(new Scene(sampleRoot3, 300, 275));
        sampleStage3.show();
    }
}
