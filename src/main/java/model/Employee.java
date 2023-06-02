package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
private Integer id;
private String first_name;
private String last_name;
private String gender;
private Integer age;
private Integer city_id;

    public Employee(String first_name, String last_name, String gender, Integer age, Integer city_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city_id = city_id;
    }

    public static Employee create(ResultSet resultSet) throws SQLException {
    Employee employee = new Employee();
    employee.setId(resultSet.getInt("id"));
    employee.setFirst_name(resultSet.getString("first_name"));
    employee.setLast_name(resultSet.getString("last_name"));
    employee.setGender(resultSet.getString("gender"));
    employee.setAge(resultSet.getInt("age"));
    employee.setCity_id(resultSet.getInt("city_id"));
    return employee;
}
}
