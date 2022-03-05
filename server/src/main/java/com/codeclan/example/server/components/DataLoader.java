package com.codeclan.example.server.components;
import com.codeclan.example.server.models.Genre;
import com.codeclan.example.server.models.MovieUserRating;
import com.codeclan.example.server.models.User;
import com.codeclan.example.server.repositories.GenreRepository;
import com.codeclan.example.server.repositories.MovieUserRatingRepository;
import com.codeclan.example.server.repositories.UserRepository;
import com.codeclan.example.server.models.Movie;
import com.codeclan.example.server.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;


@Component
public class DataLoader implements ApplicationRunner  {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    GenreRepository genreRepository;

    @Autowired
    MovieUserRatingRepository movieUserRatingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        // Genres
        Genre action = new Genre(28, "Action");
        genreRepository.save(action);

        Genre adventure = new Genre(12, "Adventure");
        genreRepository.save(adventure);

        Genre animation = new Genre(16, "Animation");
        genreRepository.save(animation);

        Genre comedy = new Genre(35, "Comedy");
        genreRepository.save(comedy);

        Genre crime = new Genre(80, "Crime");
        genreRepository.save(crime);

        Genre documentary = new Genre(99, "Documentary");
        genreRepository.save(documentary);

        Genre drama = new Genre(18, "Drama");
        genreRepository.save(drama);

        Genre family = new Genre(10751, "Family");
        genreRepository.save(family);

        Genre fantasy = new Genre(14, "Fantasy");
        genreRepository.save(fantasy);

        Genre history = new Genre(36, "History");
        genreRepository.save(history);

        Genre horror = new Genre(27, "Horror");
        genreRepository.save(horror);

        Genre music = new Genre(10402, "Music");
        genreRepository.save(music);

        Genre mystery = new Genre(9648, "Mystery");
        genreRepository.save(mystery);

        Genre romance = new Genre(10749, "Romance");
        genreRepository.save(romance);

        Genre science_fiction = new Genre(878, "Science Fiction");
        genreRepository.save(science_fiction);

        Genre tv_movie = new Genre(10770, "TV Movie");
        genreRepository.save(tv_movie);

        Genre thriller = new Genre(53, "Thriller");
        genreRepository.save(thriller);

        Genre war = new Genre(10752, "War");
        genreRepository.save(war);

        Genre western = new Genre(37, "Western");
        genreRepository.save(western);



        // Movies
        List<Genre> genres_movie1 = Arrays.asList(action, adventure, science_fiction);
        Movie movie1 = new Movie(
                "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "/iQFcwSGbZXMkeyKrxbPnwnRo5fl.jpg",
                "Spider-Man: No Way Home", genres_movie1,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                8.3, "2021-12-15", 9805.303,
                634649, "Bh8NeyejykU");
        movieRepository.save(movie1);

        List<Genre> genres_movie2 = Arrays.asList(action, adventure, fantasy, science_fiction);
        Movie movie2 = new Movie(
                "/bcCBq9N1EMo3daNIjWJ8kYvrQm6.jpg",
                "/c6H7Z4u73ir3cIoCteuhJh7UCAR.jpg",
                "Eternals", genres_movie2,
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                7.2, "2021-11-03", 2838.001,
                524434, "video");
        movieRepository.save(movie2);

        List<Genre> genres_movie3 = Arrays.asList(action, comedy, crime, thriller);
        Movie movie3 = new Movie(
                "/wdE6ewaKZHr62bLqCn7A2DiGShm.jpg",
                "/dK12GIdhGP6NPGFssK2Fh265jyr.jpg",
                "Red Notice", genres_movie3,
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                6.8, "2021-11-04", 2022.397,
                512195, "video");
        movieRepository.save(movie3);

//        action.addMovie(movie1);
//        genreRepository.save(action);
//        adventure.addMovie(movie1);
//        genreRepository.save(adventure);
//        science_fiction.addMovie(movie1);
//        genreRepository.save(science_fiction);


        // Users
        User user1 = new User("FionaG", "Fiona", "Graham", "+447366258836", "example@example.com", "888");
        user1.addMovieToFavourites(movie1);

        user1.addMovieToFavourites(movie2);

        user1.addMovieToWatchlist(movie3);

        userRepository.save(user1);
        movieRepository.save(movie1);
        movieRepository.save(movie2);
        movieRepository.save(movie3);


        MovieUserRating rating = new MovieUserRating(movie1, user1, 10);
        movieUserRatingRepository.save(rating);



//        movieRepository.save(movie1);
//        userRepository.save(user1);
    }

}
