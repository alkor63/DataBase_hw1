package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void create(Employee employee);

    Employee findById(Integer id);

    List<Employee> findAll();

    void update(Employee employee);

    void deleteEmployee(Employee employee);
}
