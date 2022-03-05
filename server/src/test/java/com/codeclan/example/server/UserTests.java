package com.codeclan.example.server;
import com.codeclan.example.server.models.Genre;
import com.codeclan.example.server.models.Movie;
import com.codeclan.example.server.models.User;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class UserTests {

    User user1;
    Movie movie1;
    Genre action;
    Genre adventure;
    Genre science_fiction;
    List<Genre> genres;

    @Before
    public void before() {
        user1 = new User("FionaG", "Fiona", "Graham", "+447366258836", "fionag.g28@gmail.com", "888");

        action = new Genre(28, "Action");
        adventure = new Genre(12, "Adventure");
        science_fiction = new Genre(878, "Science Fiction");
        genres = Arrays.asList(action, adventure, science_fiction);

        movie1 = new Movie(
                "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "/iQFcwSGbZXMkeyKrxbPnwnRo5fl.jpg",
                "Spider-Man: No Way Home", genres,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                8.3, "2021-12-15", 9805.303,
                634649, "Bh8NeyejykU");
    }

    @Test
    public void hasUserName() {
        assertEquals("FionaG", user1.getUsername());
    }

    @Test
    public void hasFirstName() {
        assertEquals("Fiona", user1.getFirstName());
    }

    @Test
    public void hasLastName() {
        assertEquals("Graham", user1.getLastName());
    }

    @Test
    public void hasPhoneNumber() {
        assertEquals("+447366258836", user1.getPhoneNumber());
    }

    @Test
    public void hasEmail() {
        assertEquals("fiona.g@gmail.com", user1.getEmail());
    }

    @Test
    public void hasPassword() {
        assertEquals("888", user1.getPassword());
    }

    @Test
    public void canAddMovieToFavourites() {
        user1.addMovieToFavourites(movie1);
        assertEquals(1, user1.getMoviesFavourites().size());
    }

}
