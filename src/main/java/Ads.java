import java.io.Serializable;

//Ads Java bean
public class Ads implements Serializable {
    //Serializable allows string representation

    private long id;

    private String title;

    private long priceInCents;

    private String description;

    //zero-argument constructor ; preserving space in memory
    public Ads(){}

    //getters & setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(long priceInCents) {
        this.priceInCents = priceInCents;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
