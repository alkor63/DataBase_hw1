package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;

    private String gender;

    private int age;
    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    public Employee(String firstName, String lastName, String gender, int age, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, String gender, int age, City city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Имя: '" + firstName + '\'' +
                ", Фамилия: '" + lastName + '\'' +
                ", пол: '" + gender + '\'' +
                ", возраст: " + age +
                " лет, city: " + city.getCityId()+" - "+city.getCityName() +
                '}';
    }
}
