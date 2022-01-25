package film;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import film.Film;
import film.exception.FilmNotFound;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class FilmRepository {
    private static final ArrayList<Film> films = importFilms();

    private static ArrayList<Film> importFilms() {
        ArrayList<Film> films = null;

        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        try(CSVReader reader = new CSVReaderBuilder(
                new FileReader(nom, prenom, email, films))
                .withCSVParser(csvParser)   // custom CSV parser
                .withSkipLines(1)           // skip the first line, header info
                .build()){
            // Listlastname[string]; firstname[string]; email[string]; borrowedFilms[ArrayList<Film>] r = reader.readAll();
            reader.forEach(x -> System.out.println(Arrays.toString(x)));
        }
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
