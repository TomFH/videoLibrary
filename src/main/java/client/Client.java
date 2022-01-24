package client;

import client.exception.CantBorrowMoreThanFiveFilms;
import com.opencsv.bean.CsvBindByPosition;
import film.Film;

import java.util.ArrayList;

public class Client {
    private final Integer id;

    @CsvBindByPosition(position = 0)
    private String lastname;
    @CsvBindByPosition(position = 1)
    private String firstname;
    @CsvBindByPosition(position = 2)
    private String email;
    @CsvBindByPosition(position = 3)
    private ArrayList<Film> borrowedFilms;

    private static Integer count = 1;

    public Client(String lastname, String firstname, String email, ArrayList<Film> borrowedFilms) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.borrowedFilms = borrowedFilms;
        this.id = count;

        count++;
    }

    public Integer getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Film> getBorrowedFilms() {
        return borrowedFilms;
    }

    public void setBorrowedFilms(ArrayList<Film> borrowedFilms) {
        this.borrowedFilms = borrowedFilms;
    }

    public void addBorrowedFilm(Film film) throws CantBorrowMoreThanFiveFilms {
        if (this.borrowedFilms.size() <= 5) {
            this.borrowedFilms.add(film);
        }

        throw new CantBorrowMoreThanFiveFilms();
    }
}
