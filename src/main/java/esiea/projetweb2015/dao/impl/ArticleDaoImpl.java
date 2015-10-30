package esiea.projetweb2015.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import esiea.projetweb2015.dao.ArticleDao;
import esiea.projetweb2015.model.Article;
import esiea.projetweb2015.model.GameId;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	
	private static final Logger log = LoggerFactory.getLogger(ArticleDaoImpl.class);
	
	// SAVE QUERY
	private static final String SAVE_ARTICLE = "INSERT INTO ARTICLE "
			+ "(id, gameId, content, title, writter, date) VALUES (?,?,?,?,?,?)";
	
	// SELECT QUERY
	private static final String GET_ALL_ARTICLES = "SELECT * FROM ARTICLE";
	private static final String GET_GAME_ARTICLES = "SELECT * FROM ARTICLE WHERE gameId = ?";
	private static final String GET_LAST_ARTICLE = "SELECT * FROM ARTICLE WHERE date =(SELECT MAX(date) FROM ARTICLE)";
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
	@Override
	public void saveArticle(Integer id, GameId gameId, String content, String title, String writter, Date date) {
		log.info("insert article " + id);
		jdbcTemplate.update(SAVE_ARTICLE, id, gameId.getGameId(), content, title, writter, date);
	}
	
	@Override
	public List<Article> getAllArticles() {
		List<Article> articles = jdbcTemplate.query(GET_ALL_ARTICLES, new ArticleRowMapper());
		return articles;
	}
	
	@Override
	public List<Article> getArticlesByGame(Integer gameId) {
		List<Article> articles = jdbcTemplate.query(GET_GAME_ARTICLES, new Object[]{gameId}, new ArticleRowMapper());
		return articles;
	}
	
	@Override
	public List<Article> getLastArticle(){
		List<Article> articles = jdbcTemplate.query(GET_LAST_ARTICLE, new ArticleRowMapper());
		return articles;
	}
	
	public class ArticleRowMapper implements RowMapper<Article>
	{
		@Override
		public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
			String content = rs.getString("content");
			String title = rs.getString("title");
			String writter = rs.getString("writter");
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String date = sdf.format(rs.getDate("date"));
			
			return new Article(content, title, writter, date);
		}
		
	}

}
