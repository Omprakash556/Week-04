package javastream.serialization;

import java.io.*;
import java.util.*;
import java.io.Serializable;

    class Employee implements Serializable {
        private static final long serialVersionUID = 1L;
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee { ID: " + id + ", Name: " + name +
                    ", Department: " + department + ", Salary: " + salary + " }";
        }
    }



    public class SaveRetrieveObject {
        public static void serializeEmployees(List<Employee> employees) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("source.txt"))) {
                oos.writeObject(employees);
                System.out.println("Employees have been serialized successfully.");
            } catch (IOException e) {
                System.out.println("Serialization Error: " + e.getMessage());
            }
        }

        public static List<Employee> deserializeEmployees() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("source.txt"))) {
                return (List<Employee>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Deserialization Error: " + e.getMessage());
                return null;
            }
        }
    }
     class EmployeeMain {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(101, "Kuldeep", "HR", 50000));
            employees.add(new Employee(102, "harsh", "IT", 60000));
            employees.add(new Employee(103, "Naman", "Finance", 55000));

            SaveRetrieveObject.serializeEmployees(employees);

            List<Employee> deserializedEmployees = SaveRetrieveObject.deserializeEmployees();
            if (deserializedEmployees != null) {
                System.out.println("Deserialized Employee List:");
                for (Employee emp : deserializedEmployees) {
                    System.out.println(emp);
                }
}
}

    }
