package esiea.projetweb2015.dao.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import esiea.projetweb2015.dao.ArticleDao;
import esiea.projetweb2015.dao.BddConnector;
import esiea.projetweb2015.model.Article;

@Repository
public class BddConnectorImpl implements BddConnector{
	
	private static final Logger log = LoggerFactory.getLogger(BddConnectorImpl.class);	
	
	// SCHEMA SQL LINES
	private static final String DROP_ARTICLE = "DROP TABLE ARTICLE IF EXISTS";
	private static final String CREATE_ARTICLE = "CREATE TABLE ARTICLE ("
			+ "id INT PRIMARY KEY NOT NULL, "
			+ "gameId INT NOT NULL, "
			+ "content VARCHAR(255) NOT NULL, "
			+ "title VARCHAR(255) NOT NULL, "
			+ "writter VARCHAR(255) NOT NULL, "
			+ "date DATE NOT NULL)";
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private ArticleDao articleDao;
	
    @Override
	public void initDatabaseSchema() {
		
		log.info("Create database schema");
		
		// Remove existing table if needed
		jdbcTemplate.execute(DROP_ARTICLE);
		
		// Create Article table
		jdbcTemplate.execute(CREATE_ARTICLE);
		log.info("Table ARTICLE created");
		
	}
	
    @Override
	public void initDatabaseData() {
    	articleDao.saveArticle(new Article(0, "Content test", "title", "moi", new Date()));
    	articleDao.saveArticle(new Article(0, "Content test", "title", "moi", new Date()));
    	articleDao.saveArticle(new Article(0, "Content test", "title", "moi", new Date()));
    	articleDao.saveArticle(new Article(1, "Content test 1", "title", "moi", new Date()));
    	articleDao.saveArticle(new Article(1, "Content test 2", "title", "moi", new Date()));
    	articleDao.saveArticle(new Article(1, "Content test 3", "title", "moi", new Date()));
	}
	
}
