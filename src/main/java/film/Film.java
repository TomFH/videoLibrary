package film;

import film.exception.CantSetBorrowerIfFilmIsNotBorrowed;

public class Film {
    private final Integer id;
    private String title;
    private String actor;
    private String release;
    private String producer;
    private Support support;

    private boolean status = false;
    private String borrower = null;
    
    private static Integer count = 1;

    public Film(String title, String actor, String release, String producer, Support support) {
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

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) throws CantSetBorrowerIfFilmIsNotBorrowed {
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
