package film;

public class Film {
    private final Integer id;
    private String title;
    private String actor;
    private String release;
    private String producer;
    private Support support;
    
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

    public static Integer getCount() {
        return count;
    }

    public static void setCount(Integer count) {
        Film.count = count;
    }
}
