package client;

public class Client {
    private final Integer id;
    private String name;

    private static Integer count = 1;

    public Client(String name) {
        this.name = name;
        this.id = count;

        count++;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
