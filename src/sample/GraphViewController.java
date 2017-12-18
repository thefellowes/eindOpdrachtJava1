package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.util.Observable;

public class GraphViewController extends ViewController {

    private Model model;

    @FXML
    private BarChart barChart;

    public GraphViewController() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
    }

    public void displayGraphs() {
        return;
    }


    @Override
    public void update(Observable o, Object model) {
        this.model = (Model) model;
        System.out.println("updated GraphViewController");
        return;
    }

}
