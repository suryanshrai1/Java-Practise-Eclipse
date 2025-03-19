import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp1");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee=new Employee();
		//employee.setId(50);
		employee.setName("Vedant");
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
		
		
	}

}