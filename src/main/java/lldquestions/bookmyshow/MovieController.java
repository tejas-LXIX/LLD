package lldquestions.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    private Map<City, List<Movie>> cityToMovies;
    private List<Movie> allMovies;

    public MovieController() {
        this.cityToMovies = new HashMap<>();
        this.allMovies = new ArrayList<>();
    }

    void addMovie(Movie movie, City city) {
        allMovies.add(movie);
        List<Movie> movies = cityToMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityToMovies.put(city, movies);
    }

    Movie getMovieByName(String movieName) {
        return allMovies.stream().filter(movie -> movie.getName().equals(movieName)).findFirst().orElse(null);
    }

    List<Movie> getMoviesByCity(City city) {
        return cityToMovies.get(city);
    }

}
