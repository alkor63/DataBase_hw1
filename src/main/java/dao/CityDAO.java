package dao;

import model.City;

import java.util.List;

public interface CityDAO {

    void createCity(City city);

    City findByCityId(Integer id);

    List<City> findAllCity();

    void updateCity(City city);

    void deleteCity(City city);

}
