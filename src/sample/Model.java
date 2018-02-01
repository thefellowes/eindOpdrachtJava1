package sample;

import java.util.*;
import java.util.stream.Collectors;

// Observer Pattern
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

        // Observer Pattern
        setChanged();
        notifyObservers(this);
    }

    public void removeMovie(Movie toDelete) {
        System.out.println("[Debug] rm: " + toDelete.getName());
        List<Movie> localMovies = getMovies();

        // stream + lambda
        movies = localMovies
                .stream()
                .filter(M -> !(M.getName().equals(toDelete.getName()) && M.getCountryOfOrigin().equals(toDelete.getCountryOfOrigin())) )
                .collect(Collectors.toList());

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
