package com.simpli.config;

import java.sql.*;

//import com.mysql.jdbc.Connection;

public class Connectivity {
	public static void main(String[] args) {
		
	
	
	 String driver = "com.mysql.cj.jdbc.Driver";
     String url = "jdbc:mysql://localhost:3306/simplilearn";
     String username = "root";
     String password = "12345678";
     
     try {
         //load driver
         Class.forName(driver);
         //get connection and store it in con object
         Connection con= DriverManager.getConnection(url,username,password);
         //check if the connection is not null
         if(con!=null)
             System.out.println("Connection Established");
         else
             System.out.println("Error while connecting with database");
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
	
	
	
//public static void main(String[] args) {
//        
//        String driver="com.mysql.cj.jdbc.driver";
//        String url="jdbc:mysql//localhost:3306/simplilearn";
//        String username="root";
//        String password="";
//        
//        try {
//            //load driver
//            Class.forName(driver);
//            //get connection and store it in con object
//            Connection con= DriverManager.getConnection(url,username,password);
//            //check if the connection is not null
//            if(con!=null)
//                System.out.println("Connection Established");
//            else
//                System.out.println("Error while connecting with database");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
	
//	public static void main(String[] args) {
//		String driver = "com.mysql.jdbc.driver";
//		String url = "jdbc:mysql//localhost:3306/simplilearn";
//		String username = "root";
//		String password = "12345678";
//		
//		try {
//			Class.forName(driver);
//			Connection con = DriverManager.getConnection(url,username,password);
//			if(con!=null)
//				System.out.println("Connection Established");
//			else
//				System.out.println("Error while connecting DB");
//			
//		}
	}

