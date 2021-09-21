package com.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnect
{
	
private static String url="jdbc:mysql://localhost:3306/restaurantsystem";
private static String user="root";
private static String pass="root";


	

public static Connection getConnection()
{
	Connection con=null;
	try {
		con=DriverManager.getConnection(url,user,pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
public static void main(String[] args) {
	getConnection();
	
}

}			
			

