package Aggregation;

//Class representing Employee
class Employee {
 private String name;
 private int id;

 // Constructor
 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Getter methods
 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }
}

//Class representing Department (Aggregation)
class Department {
 private String deptName;
 private Employee[] employees;

 // Constructor
 public Department(String deptName, Employee[] employees) {
     this.deptName = deptName;
     this.employees = employees;
 }

 // Method to display department details
 public void displayDepartmentDetails() {
     System.out.println("Department: " + deptName);
     System.out.println("Employees:");
     for (Employee emp : employees) {
         System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName());
     }
 }
}

//Main Class
public class AggregationExample {
 public static void main(String[] args) {
     // Creating Employee objects
     Employee emp1 = new Employee("Alice", 101);
     Employee emp2 = new Employee("Bob", 102);

     // Creating an array of employees
     Employee[] employees = {emp1, emp2};

     // Creating a Department object with the array of employees
     Department dept = new Department("HR", employees);

     // Displaying details
     dept.displayDepartmentDetails();
 }
}

