package esiea.projetweb2015.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import esiea.projetweb2015.dao.ArticleDao;
import esiea.projetweb2015.model.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	
	private static final Logger log = LoggerFactory.getLogger(ArticleDaoImpl.class);
	
	// SAVE QUERY
	private static final String SAVE_ARTICLE = "INSERT INTO ARTICLE "
			+ "(id, gameId, content, title, writter, date) VALUES (?,?,?,?,?,?)";
	
	// SELECT QUERY
	private static final String GET_ALL_ARTICLES = "SELECT * FROM ARTICLE";
	private static final String GET_GAME_ARTICLES = "SELECT * FROM ARTICLE WHERE gameId = ?";

	private Integer idSequence;
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @PostConstruct
    private void initIdSequence () {
    	idSequence = 1;
    }
    
	@Override
	public void saveArticle(Article article) {
		log.info("insert article " + idSequence);
		jdbcTemplate.update(SAVE_ARTICLE, idSequence, article.getGameId(), article.getContent(), article.getTitle(), article.getWritter(), article.getDate());
		idSequence ++;
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
	
	public class ArticleRowMapper implements RowMapper<Article>
	{
		@Override
		public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
			Article article = new Article();
			article.setId(rs.getInt("id"));
			article.setGameId(rs.getInt("gameId"));
			article.setContent(rs.getString("content"));
			article.setTitle(rs.getString("title"));
			article.setWritter(rs.getString("writter"));
			article.setDate(rs.getDate("date"));
			return article;
		}
		
	}

}
