package sample;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private int productionYear;
    private String countryOfOrigin;
    private double budget;

    public List<Movie> movies = new ArrayList<>();

    public Movie(String name, int productionYear, String countryOfOrigin, double budget) {
        this.name = name;
        this.productionYear = productionYear;
        this.countryOfOrigin = countryOfOrigin;
        this.budget = budget;
        movies.add(new Movie(name, productionYear, countryOfOrigin, budget));
    }

//    public List<Movie> getMovies(){
//        return movies;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getCountryOfOrigin() {
//        return countryOfOrigin;
//    }
//
//    public double getBudget() {
//        return budget;
//    }
}
