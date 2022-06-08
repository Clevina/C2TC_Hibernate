package com.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedTableInheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//create one employee
		Employee employee= new Employee();
		employee.setName("Clevina");
		employee.setSalary(50000);
		em.persist(employee);
		
		//create one manager
		Manager manager= new Manager();
		manager.setName("Vikas");
		manager.setSalary(6000);
		manager.setDepartmentName("Technical Training");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("Added one employee and one manager data");
		em.close();
		factory.close();
	}

}
