import dao.CityDAO;
import dao.CityDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {
        // Создаем объект класса ДАО
        CityDAO cityDAO = new CityDAOImpl();
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        //смотрим что получилось
        List<Employee> list = employeeDAO.findAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
//        Employee employee1 = new Employee("Taras", "Bulba", "male", 62, 4);
//        // Создаем объект
//        employeeDAO.create(employee1);
//        // Получаем объект по id
        System.out.println(cityDAO.findByCityId(4));
        // Получаем полный список объектов
        List<City> listC = cityDAO.findAllCity();
        for (City city : listC) {
            System.out.println(city);
        }
//        Employee employee2 = new Employee(18,"Ruslan", "Ludmilin", "male", 33, 4);
        // Изменяем объект
//        employeeDAO.update(employee2);
//        System.out.println(employee2);

//        employee2 = employeeDAO.findById(19);
        // Удаляем объект
//        employeeDAO.deleteEmployee(employee2);

    }
}

