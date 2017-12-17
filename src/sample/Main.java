package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Controller controller;

    public static void main(String[] args){
        Model model = new Model();
        addMovie addMovieDisplay = new addMovie();

        controller = new Controller(model, addMovieDisplay);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

    }
}
