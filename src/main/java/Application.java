import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

import java.sql.*;

public class Application {

    public static void main(String[] args) throws SQLException {

        // Создаем переменные с данными для подключения к базе
        final String user = "postgres";
        final String password = "Sql2374";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        // Создаем соединение с базой с помощью Connection
        // Формируем запрос к базе с помощью PreparedStatement
        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")) {

            // Подставляем значение вместо wildcard
            statement.setInt(1, 2);

            // Делаем запрос к базе и результат кладем в ResultSet
            final ResultSet resultSet = statement.executeQuery();

            // Методом next проверяем есть ли следующий элемент в resultSet
            // и одновременно переходим к нему, если таковой есть
            while (resultSet.next()) {

                // С помощью методов getInt и getString получаем данные из resultSet
                // employee (first_name, last_name, gender, age)
                String name1 = "first_name: " + resultSet.getString("first_name");
                String name2 = "last_name: " + resultSet.getString("last_name");
                String m_f = "gender: " + resultSet.getString("gender");
                int age = resultSet.getInt("age");

                // Выводим данные в консоль
                System.out.print(name1 + " " + name2 + "  " + m_f);
                System.out.println(" age = " + age);
            }

            EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl(connection);

            employeeDAO.deleteById(3);
            employeeDAO.addEmployee(new Employee("tema", "ilin", "male", 9, 3));
            employeeDAO.findAll().forEach(System.out::println);
            Employee employee = employeeDAO.findById(5);
            employee.setLast_name("diminson");
            employeeDAO.update(5, employee);
            System.out.println(employeeDAO.findById(5));
        }
    }
}
