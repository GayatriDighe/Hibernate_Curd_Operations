package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrecord")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int c_id; 

	    private String c_name;
	    private String c_company;
	    private int price;
	    
	    public Car() {
	    	
	    }

		public Car(int c_id, String c_name, String c_company, int price) {
			super();
			this.c_id = c_id;
			this.c_name = c_name;
			this.c_company = c_company;
			this.price = price;
		}

		public int getC_id() {
			return c_id;
		}

		public void setC_id(int c_id) {
			this.c_id = c_id;
		}

		public String getC_name() {
			return c_name;
		}

		public void setC_name(String c_name) {
			this.c_name = c_name;
		}

		public String getC_company() {
			return c_company;
		}

		public void setC_company(String c_company) {
			this.c_company = c_company;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Car [c_id=" + c_id + ", c_name=" + c_name + ", c_company=" + c_company + ", price=" + price + "]";
		}
	    
}

