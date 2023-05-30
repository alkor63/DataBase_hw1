package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void create(Employee employee) throws SQLException;

    Employee findById(Integer id);

    List<Employee> findAll();

    void deleteById(Integer id);
}
