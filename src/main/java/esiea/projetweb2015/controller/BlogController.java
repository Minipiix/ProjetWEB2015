package esiea.projetweb2015.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import esiea.projetweb2015.dao.ArticleDao;
import esiea.projetweb2015.model.Article;
import esiea.projetweb2015.model.Greeting;

@RestController
@RequestMapping("/hello-world")
public class BlogController {
	
	@Autowired
	private ArticleDao articleDao;
	
	private static final String template = "Hello %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name){
		toRemove();
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	private void toRemove() {
		List<Article> articles = articleDao.getAllArticles();
		System.out.println("All articles " + articles.size());
		for (Article article : articles) {
			System.out.println(article);
		}
		
		articles = articleDao.getArticlesByGame(1);
		System.out.println("Game 1 articles " + articles.size());
		for (Article article : articles) {
			System.out.println(article);
		}
	}
	
}

