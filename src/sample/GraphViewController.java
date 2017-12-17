package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

import java.util.Observable;

public class GraphViewController extends ViewController {

    @FXML protected void handleAddButtonAction(ActionEvent event) {
        return;
    }

    public void displayGraphs() {
        return;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("notified GraphViewController");
        return;
    }

}
