package client;

import client.exception.CantBorrowMoreThanFiveFilms;

import java.util.ArrayList;

public class Client {
    private final Integer id;
    private String lastname;
    private String firstname;
    private String email;
    private ArrayList<Integer> borrowedFilms;

    private static Integer count = 1;

    public Client(String lastname, String firstname, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
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

    public ArrayList<Integer> getBorrowedFilms() {
        return borrowedFilms;
    }

    public void setBorrowedFilms(ArrayList<Integer> borrowedFilms) {
        this.borrowedFilms = borrowedFilms;
    }

    public void addBorrowedFilm(Integer idFilm) throws CantBorrowMoreThanFiveFilms {
        if (this.borrowedFilms.size() <= 5) {
            this.borrowedFilms.add(idFilm);
        }

        throw new CantBorrowMoreThanFiveFilms();
    }
}
