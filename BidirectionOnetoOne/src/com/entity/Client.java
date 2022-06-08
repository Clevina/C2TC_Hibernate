package com.entity;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Student student= new Student();
		student.setName("Clevina");
		
		Address homeaddress= new Address();
		homeaddress.setStreet("MG ROAD");
		homeaddress.setCity("Mangalore");
		homeaddress.setState("Karanataka");
		homeaddress.setZipcode("574 142");
		
		
		
		//inject address to student table
		student.setAddress(homeaddress);
		
		//create
		manager.persist(student);
		
		manager.getTransaction().commit();
		System.out.println("Data is successfully added");
	
		manager.close();
		factory.close();
		
		
		
		
		}

}
