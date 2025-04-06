package lldquestions.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//to get all theatres in a city.
public class TheatreController {

    private Map<City, List<Theatre>> cityToTheatres;
    private List<Theatre> allTheatres;

    public TheatreController() {
        this.cityToTheatres = new HashMap<>();
        this.allTheatres = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city) {
        allTheatres.add(theatre);
        List<Theatre> cityTheatres = cityToTheatres.getOrDefault(city, new ArrayList<>());
        cityTheatres.add(theatre);
        cityToTheatres.put(city, cityTheatres);
    }

    Map<Theatre, List<Show>> getAllShows(final Movie movie, City city) {
        Map<Theatre, List<Show>> result = new HashMap<>();
        
        List<Theatre> theatres = cityToTheatres.get(city);

        theatres.forEach(theatre -> result.put(theatre, getAllMovieShowsForTheatre(movie,theatre)));

        return result;
    }

    private List<Show> getAllMovieShowsForTheatre(Movie movie, Theatre theatre) {
        return theatre.getShows().stream().filter(show -> show.getMovie().getId() == movie.getId()).collect(Collectors.toList());
    }


}
