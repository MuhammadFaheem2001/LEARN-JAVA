package Inheritance;

import java.util.Date;

public class TestProgram {
    public static void main(String[] args) {

        Person person = new Person("Ahmed Khan", "123 Main St", "555-555-5555", "ahmed@example.com");
        Student student = new Student("Aisha Ali", "456 Oak St", "555-555-5556", "aisha@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Bilal Ahmed", "789 Pine St", "555-555-5557", "bilal@example.com", "Room 101", 50000, new Date());
        Faculty faculty = new Faculty("Dr. Asma Iqbal", "101 Maple St", "555-555-5558", "asma@example.com", "Room 102", 60000, new Date(), "9-5", "Professor");
        Staff staff = new Staff("Faraz Siddiqui", "202 Birch St", "555-555-5559", "faraz@example.com", "Room 103", 40000, new Date(), "Manager");

      
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
