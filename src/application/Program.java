package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		Seller sel = new Seller(
			    2, 
			    "Manoel", 
			    "manoel_neto@outlook.com", 
			    new Date(),       // birthDate
			    50000.0,          // baseSalary
			    obj               // Department
			);
		System.out.println(obj);
		System.out.println(sel);

	}

}
