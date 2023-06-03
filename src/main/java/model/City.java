package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class City {
    private Integer city_id;
    private String city_name;

    public City() {
    }

    public City(String city_name) {
        this.city_name = city_name;
    }

    public City(Integer city_id, String city_name) {
        this.city_id = city_id;
        this.city_name = city_name;
    }
}
