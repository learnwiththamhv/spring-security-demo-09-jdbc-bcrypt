package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/spring_security_demo_plaintext?useSSL=false&serverTimezone=UTC";
		String user = "springstudent";
		String pass = "springstudent";

		try {
			System.out.println("Connecting to database: " + jdbcUrl);

			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Connection successfull!!!");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
