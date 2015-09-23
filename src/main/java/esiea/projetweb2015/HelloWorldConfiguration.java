package esiea.projetweb2015;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldConfiguration {
    
	public static void main(String[] args) {
        //SpringApplication.run(HelloWorldConfiguration.class, args);
        
        ResultSet result = null;
        String requete = "SELECT * FROM BDD";
        try {
        Connection con = bddConnector.getConnection();
        Statement stmt = con.createStatement();
        result = stmt.executeQuery(requete);
        System.out.println(result);
        } catch (SQLException e) {
        //traitement de l'exception
        	e.printStackTrace();
        }
        
    }

}
