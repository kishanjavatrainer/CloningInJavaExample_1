package com.infotech.client;

import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		System.out.println("Original Employee object:::");
		Employee employee1 = new Employee(1001, "KK", 30, "kishan.javatrainer@gmail.com", "pass@123");
		System.out.println(employee1);
		
		try {
			Object object = employee1.clone();
			Employee employee2 =(Employee)object;
			System.out.println("Cloned Employee object:::");
			System.out.println(employee2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
