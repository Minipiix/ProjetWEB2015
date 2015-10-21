package esiea.projetweb2015;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bddConnector{
	
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	    String DBurl = "jdbc:h2:./../ProjetWeb2015/src/main/resources/static/test";
	    Connection con = DriverManager.getConnection(DBurl,"sa","");
		return con;
	    
	}
}
