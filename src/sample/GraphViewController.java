package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;

import java.util.List;
import java.util.Observable;

// Observer Pattern
// Proxy Pattern
public class GraphViewController extends ViewController {

    // Proxy Pattern
    private ProxyModel proxy;

    @FXML
    private BarChart barChart;

    public void displayGraphs() {
        return;
    }

    // Observer Pattern
    @Override
    public void update(Observable o, Object model) {

        // Proxy Pattern
        List<Movie> movies = ((ProxyModel) proxy).getMovies();

        // Create a simple "struct"
        class countryStruct {
            public String name;
            public int amount;
        }

        List<countryStruct> countries = new ArrayList<countryStruct>();

        // Generate Data
        for (Movie movie : movies) {
            boolean alreadyInList = false;

            for (countryStruct countryStruct : countries) {
                if (movie.getCountryOfOrigin().equals(countryStruct.name)){
                    countryStruct.amount += 1;
                    alreadyInList = true;
                }
            }
            if (!alreadyInList) {
                countryStruct countryToBeAdded = new countryStruct();
                countryToBeAdded.name = movie.getCountryOfOrigin();
                countryToBeAdded.amount = 1;
                countries.add(countryToBeAdded);
            }
        }


        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        ObservableList<XYChart.Series<String, Number>> barChartData = FXCollections.observableArrayList();

        final BarChart.Series<String, Number> series =  new BarChart.Series<String, Number>();
        for (countryStruct country : countries) {
            series.getData().add(new XYChart.Data<String, Number>(country.name, country.amount));
        }

        // add data to chart
        barChartData.add(series);
        barChart.setData(barChartData);

        System.out.println("updated GraphViewController");
    }

    public void setProxy(ProxyModel proxy) {
        this.proxy = proxy;
    }
}
