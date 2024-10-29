package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     cfg.addAnnotatedClass(Car.class);
	     
	     
	     SessionFactory sf = cfg.buildSessionFactory();
	     Session ss = sf.openSession();
	     Transaction tr = ss.beginTransaction();
	     Car c = new Car();
	     
	     c.setC_name("Toyota");
	     c.setC_company("Toyota Motor Corporation");
	     c.setPrice (1800000);
	    
	    
		ss.save(c);
//	     ss.persist(s);
	     System.out.println("data is inserted successfully");
	     tr.commit();
	     ss.close();

	}



	}


