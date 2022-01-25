package film;

import client.Client;
import com.opencsv.bean.CsvBindByPosition;
import film.exception.CantSetBorrowerIfFilmIsNotBorrowed;

public class Film {
    private final Integer id;

    @CsvBindByPosition(position = 0)
    private String title;
    @CsvBindByPosition(position = 1)
    private String actor;
    @CsvBindByPosition(position = 2)
    private String release;
    @CsvBindByPosition(position = 3)
    private String producer;
    @CsvBindByPosition(position = 4)
    private Support support;

    @CsvBindByPosition(position = 5)
    private boolean status = false;
    @CsvBindByPosition(position = 6)
    private Client borrower = null;
    
    private static Integer count = 1;

    public Film(
            String title,
            String actor,
            String release,
            String producer,
            Support support,
            boolean status,
            Client borrower
    ) {
        this.title = title;
        this.actor = actor;
        this.release = release;
        this.producer = producer;
        this.support = support;
        this.id = count;

        count++;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public Client getBorrower() {
        return borrower;
    }

    public void setBorrower(Client borrower) throws CantSetBorrowerIfFilmIsNotBorrowed {
        if (status || borrower == null) {
            this.borrower = borrower;
        }

        throw new CantSetBorrowerIfFilmIsNotBorrowed();
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) throws CantSetBorrowerIfFilmIsNotBorrowed {
        if (!status) {
            setBorrower(null);
        }
        this.status = status;
    }
}
