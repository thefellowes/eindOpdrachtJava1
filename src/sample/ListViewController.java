package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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

}
