package sample;

import java.util.*;

public class Model extends Observable {

    //Inserting some test data
    public List<Movie> movies = new ArrayList<Movie>(Arrays.asList(
        new Movie("myFirstMovie", 2017, "Somewhere over the rainbow", 100.000),
        new Movie("mySecondMovie", 2016, "Somewhere over the rainbow", 20.000),
        new Movie("BraveHeart", 1995, "Scotland", 200.000)
    ));

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
        int i = 1;
        for (Movie m : movies){
            System.out.println(i + ". " + m.getName() + " " + m.getProductionYear() + " " + m.getCountryOfOrigin() + " " + m.getBudget());
            i++;
        }
    }

    public void notifytest() {
        setChanged();
        notifyObservers(this);
    }
}
