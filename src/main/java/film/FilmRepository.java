package film;

import film.Film;
import film.exception.FilmNotFound;

import java.util.ArrayList;

public class FilmRepository {
    private static final ArrayList<Film> films = importFilms();

    private static ArrayList<Film> importFilms() {
        ArrayList<Film> films = null;

        return films;
    }

    private static void exportFilms(ArrayList<Film> films) {

    }
    
    private Film searchFilmFromTitle(String filmTitle) throws FilmNotFound {
        for (Film film : films) {
            if (film.getTitle().equals(filmTitle)) {
                return film;
            }
        }

        throw new FilmNotFound();
    }

    private void DisplayFilmList(Support filter) {
        for (Film film : films) {
            if (film.getSupport().equals(filter)) {
                System.out.println(film);
            }
        }
    }

    private void addFilm(Film film) {
        films.add(film);
    }
}
