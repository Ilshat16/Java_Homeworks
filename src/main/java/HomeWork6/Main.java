package HomeWork6;

public class Main {
    public static void main(String[] args) {
        int age = 33;
        String firstName = "Ilshat";
        String lastName = "Shaydullin";
        Employee employee = new Employee(age, firstName, lastName);
        Employee newEmployee = new Employee(33, "Ilshat", "Shaydullin");
        Employee employee1 = new Employee(45, "Ivan", "Ivanov");
        System.out.println(employee.equals(newEmployee));
        System.out.println(employee.equals(employee1));
//        System.out.println(employee);
        System.out.println(employee.getFullName());

        System.out.println(employee.olderThan(employee1));
        employee.upgrade(50);
        System.out.println(employee.getSalary());
    }
}
