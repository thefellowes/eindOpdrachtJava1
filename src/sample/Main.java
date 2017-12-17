package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
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
        //        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();

    //        System.out.println("Start method gets ran second");
    //        FlowPane rootNode = new FlowPane();
    //        Scene primaryScene = new Scene(rootNode, 350, 350);
    //        Label demoLabel = new Label("kys world!");
    //
    //        // Now we add label as a child to the rootNode
    //        rootNode.getChildren().add(demoLabel);
    //
    //        // Now we add the scene to the stage
    //        primaryStage.setScene(primaryScene);
    //
    //        // And we make the stage visible
    //        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
