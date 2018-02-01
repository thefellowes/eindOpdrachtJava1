package sample;

import java.util.*;

// Observer Patter
public class Model extends Observable {

    private List<Movie> movies;

    //Dependancy injection
    public Model(List<Movie> movies){
        this.movies = movies;
    }

    public void addMovie(String name, int productionYear, String countryOfOrigin, double budget){
        Movie movie = new Movie(name, productionYear, countryOfOrigin, budget);
        movies.add(movie);

        // for debug purposes
        printMovies();

        setChanged();
        notifyObservers(this);
    }

    public List<Movie> getMovies(){
        return movies;
    }

    public Movie searchFilm() {
        return new Movie("dd", 1222,"hell", 999);
    }

    private void printMovies() {

        // stream + lambda
        movies
                .stream()
                .forEach(M -> System.out.println(M.getName() + " " + M.getProductionYear() + " " + M.getCountryOfOrigin() + " " + M.getBudget()));
    }

    public void notifyInit() {
        setChanged();
        notifyObservers(this);
    }
}
