package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;



public class DeleteData {


	public static void main(String[] args) {
		
			
				Configuration cfg =new Configuration();
				cfg.configure("hibernate.cfg.xml");
			    cfg.addAnnotatedClass(Car.class);
			    
			    SessionFactory sf = cfg.buildSessionFactory();
			    Session ss = sf.openSession();
			    Transaction tr = ss.beginTransaction();
			    
			    
			    int c_id=6;
			    Car c=ss.get(Car.class,c_id);
			    ss.remove(c);
			    ss.delete(c);
			    
			    System.out.println("data is deleted successfully");
			    tr.commit();
			    ss.close();
			    
			}
			}
	


