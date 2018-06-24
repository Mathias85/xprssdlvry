/*
 * This file is generated by jOOQ.
 */
package mathias.vanhack.skip.model.pojos;


import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.11.0"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 947396091;

    private Integer restId;
    private String name;
    private String description;
    private LocalDateTime dateCreated;
    private String street;
    private String city;
    private String state;
    private String country;
    private Integer latitude;
    private Integer longitude;

    public Restaurant() {
    }

    public Restaurant(Restaurant value) {
        this.restId = value.restId;
        this.name = value.name;
        this.description = value.description;
        this.dateCreated = value.dateCreated;
        this.street = value.street;
        this.city = value.city;
        this.state = value.state;
        this.country = value.country;
        this.latitude = value.latitude;
        this.longitude = value.longitude;
    }

    public Restaurant(
            Integer restId,
            String name,
            String description,
            LocalDateTime dateCreated,
            String street,
            String city,
            String state,
            String country,
            Integer latitude,
            Integer longitude
    ) {
        this.restId = restId;
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getRestId() {
        return this.restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Restaurant (");

        sb.append(restId);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(dateCreated);
        sb.append(", ").append(street);
        sb.append(", ").append(city);
        sb.append(", ").append(state);
        sb.append(", ").append(country);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);

        sb.append(")");
        return sb.toString();
    }
}
