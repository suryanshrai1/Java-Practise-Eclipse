import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Display {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp1");
		EntityManager entityManager = factory.createEntityManager();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Employee ID to display: ");
		int id = scanner.nextInt();

		// Fetch the employee entity
		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {
			System.out.println("Employee ID: " + employee.getId());
			System.out.println("Employee Name: " + employee.getName());
		} else {
			System.out.println("Employee not found.");
		}

		scanner.close();
		entityManager.close();
		factory.close();
	}
}
