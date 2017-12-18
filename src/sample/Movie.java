package sample;


import javafx.beans.property.SimpleStringProperty;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private int productionYear;
    private String countryOfOrigin;
    private double budget;

    public Movie(String name, int productionYear, String countryOfOrigin, double budget) {
        this.name = name;
        this.productionYear = productionYear;
        this.countryOfOrigin = countryOfOrigin;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getBudget() {
        return budget;
    }
}
