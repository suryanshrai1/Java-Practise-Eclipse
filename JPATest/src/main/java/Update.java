import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp1");
		EntityManager entityManager = factory.createEntityManager();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Employee ID to update: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter new name: ");
		String newName = scanner.nextLine();

		entityManager.getTransaction().begin();

		// Fetch the employee entity that needs to be updated
		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {
			employee.setName(newName);
			entityManager.getTransaction().commit();
			System.out.println("Employee updated successfully.");
		} else {
			System.out.println("Employee not found.");
			entityManager.getTransaction().rollback();
		}

		scanner.close();
		entityManager.close();
		factory.close();
	}
}
