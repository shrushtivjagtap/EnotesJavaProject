package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static  Connection conn;
	public static Connection getConn()
	{
		try {
			
			if(conn==null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");

	            //creating connection with the database
	            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enotes","root","admin");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}
//jdbc:mysql://127.0.0.1:3306/?user=root