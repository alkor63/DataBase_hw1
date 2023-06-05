package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "city_id")
    private Integer cityId;
    @Column(name = "city_name")
    private String cityName;

    public City() {
    }

    public City(String city_name) {
        this.cityName = cityName;
    }

    public City(Integer cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }
}
