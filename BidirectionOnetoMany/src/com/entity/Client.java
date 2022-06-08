package com.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Department department= new Department();
		department.setId(1);
		department.setName("C2TC");

		Department department1= new Department();
		department1.setId(2);
		department1.setName("C2C");
		
		Employee employee= new Employee();
		employee.setId(101);
		employee.setName("Lekha");
		employee.setSalary(1000);
		
		Employee employee1= new Employee();
		employee1.setId(102);
		employee1.setName("Damini");
		employee1.setSalary(2000);
		
		Employee employee2= new Employee();
		employee2.setId(103);
		employee2.setName("Vikas");
		employee2.setSalary(3000);
		
		department.addEmployee(employee);
		department.addEmployee(employee1);
		department1.addEmployee(employee2);
		
		manager.persist(department);
		manager.persist(department1);
		
		manager.getTransaction().commit();
		
		System.out.println("Employees and departments are adedd ");
		
		manager.close();
		factory.close();
		
		
		
		
		
	}

}
