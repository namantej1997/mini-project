package com.mini.proj.spring.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;

import com.mini.proj.spring.model.StockData;


@Component
public class StockDataDAO {

	
	public void stockDataDAOImpl() {
		
		// bhavya work starts..
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	       
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
	      
		StockDataDAO ME = new StockDataDAO();
		StockData e1=new StockData(); 
//	      e1.setFirstName("divesh");
//	      e1.setLastName("jain");
//	      e1.setSalary(1000000000);
	      session.save(e1); 
	      List employees = session.createQuery("FROM StockData").list(); 
	      for (Iterator iterator = employees.iterator(); iterator.hasNext();){
	         StockData employee = (StockData) iterator.next(); 
//	         System.out.print("First Name: " + employee.getFirstName()); 
//	         System.out.print("  Last Name: " + employee.getLastName()); 
//	         System.out.println("  Salary: " + employee.getSalary());
	      }
	      t.commit();  
	      System.out.println("successfully saved");    
	      factory.close();  
	      session.close();
		
	}

}
