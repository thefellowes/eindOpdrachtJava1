package sample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable{
    //Inserting some test data
    private List<Movie> movies = new LinkedList<>(Arrays.asList(
        new Movie("myFirstMovie", 2017, "Somewhere over the rainbow", 100.000),
        new Movie("mySecondMovie", 2016, "Somewhere over the rainbow", 20.000)
    ));

    public void add(Movie movie){
        movies.add(movie);
    }

    public List<Movie> getMovies(){
        return movies;
    }
}
