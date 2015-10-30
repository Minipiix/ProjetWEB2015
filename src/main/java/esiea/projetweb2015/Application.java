package esiea.projetweb2015;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import esiea.projetweb2015.dao.BddConnector;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private BddConnector bddConnector;
    
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
	
	@Override
	public void run(String... arg0) throws Exception {
		bddConnector.initDatabaseSchema();
		bddConnector.initDatabaseData();
	}

}
