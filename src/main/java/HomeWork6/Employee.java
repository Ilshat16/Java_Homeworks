package HomeWork6;

import java.util.Objects;

public class Employee {

    int age;
    String firstName;
    String lastName;
    Double salary;

    public Employee(int age, String firstname, String lastName, Double salary) {
            this.age = age;
            this.firstName = firstname;
            this.lastName = lastName;
            this.salary = salary;
    }

    public  Employee(int age, String firstName, String lastName) {
        this(age, firstName, lastName, 50.0);
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee employee) {
            return age == employee.age &&
                    firstName.equals(employee.firstName) &&
                    lastName.equals(employee.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName);
    }

    private String getInfo() {
        return "Возраст: " + age + "\n" +
                "Имя: " + firstName + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Зарплата: " + salary;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean olderThan(Employee employee) {
        return this.age > employee.age;
    }

    public void upgrade(double salary) {
        this.salary += salary;
    }
}
