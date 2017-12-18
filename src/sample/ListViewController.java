package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Observable;

public class ListViewController extends ViewController {

    private Model model;

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
}
