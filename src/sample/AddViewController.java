package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class AddViewController extends ViewController {

    @FXML private TextField name;
    @FXML private TextField year;
    @FXML private TextField country;
    @FXML private TextField budget;

    @FXML private Text actiontarget;

    @FXML protected void handleAddButtonAction(ActionEvent event) {
        System.out.println("name: " + name.getText());
        System.out.println("year: " + year.getText());
        System.out.println("country: " + country.getText());
        System.out.println("budget: " + budget.getText());

        actiontarget.setText("Add button pressed");
    }


}
