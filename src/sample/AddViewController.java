package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

import java.util.Observable;

public class AddViewController extends ViewController {

    private Model model;
    @FXML
    private TextField name;
    @FXML
    private TextField year;
    @FXML
    private TextField country;
    @FXML
    private TextField budget;

    @FXML
    private Text actiontarget;

    @FXML
    protected void handleAddButtonAction(ActionEvent event) {
        System.out.println("name: " + name.getText());
        System.out.println("year: " + year.getText());
        System.out.println("country: " + country.getText());
        System.out.println("budget: " + budget.getText());

        // clean up the input
        String name = this.name.getText().toString();
        int year = Integer.parseInt(this.year.getText().toString());
        String country = this.country.getText();
        double budget = Double.parseDouble(this.name.getText().toString());

        actiontarget.setText("Add button pressed");
        addMovie(name, year, country, budget);

        // update views
//        ((Model) model).notifytest();
    }

    public void addMovie(String name, int year, String countryOfOrigin, double budget) {
        System.out.println("1. name: " + name);
        System.out.println("2. year: " + year);
        System.out.println("3. country: " + countryOfOrigin);
        System.out.println("4. budget: " + budget);
        System.out.println("5. It lives!");
        model.addMovie(name, year, countryOfOrigin, budget);
    }


    @Override
    public void update(Observable o, Object model) {
        this.model = (Model) model;
        System.out.println("notified AddViewController");
        return;
    }

    public void initModel(Model model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
    }

}