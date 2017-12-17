package sample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    //Inserting some test data
    private List<Movie> movies = new LinkedList<>(Arrays.asList(
        new Movie("myFirstMovie", 2017, "Somewhere over the rainbow", 100.000),
        new Movie("mySecondMovie", 2016, "Somewhere over the rainbow", 20.000),
        new Movie("BraveHeart", 1995, "Scotland", 200.000)
    ));

    public void addMovie(String name, int productionYear, String countryOfOrigin, double budget){
        Movie movie = new Movie(name, productionYear, countryOfOrigin, budget);
        movies.add(movie);

        setChanged();
        notifyObservers();
    }

    public List<Movie> getMovies(){
        return movies;
    }

    public Movie searchFilm() {
        return new Movie("dd", 1222,"hell", 999);
    }

    public void notifytest() {
        setChanged();
        notifyObservers(this);
    }
}
