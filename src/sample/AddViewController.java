package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

import java.util.Observable;

// Observer Pattern
// Adapter pattern
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
        String name = this.name.getText();
        int year = Integer.parseInt(this.year.getText());
        String country = this.country.getText();
        double budget = Double.parseDouble(this.budget.getText());

        addMovie(name, year, country, budget);

        //Cleaning up after ourselves
        this.name.clear();
        this.year.clear();
        this.country.clear();
        this.budget.clear();
    }

    public void addMovie(String name, int year, String countryOfOrigin, double budget) {
        model.addMovie(name, year, countryOfOrigin, budget);
        actiontarget.setText("Added the movie");
    }


    // Observer Pattern
    @Override
    public void update(Observable o, Object model) {
        this.model = (Model) model;
        System.out.println("updated AddViewController");
        return;
    }
}