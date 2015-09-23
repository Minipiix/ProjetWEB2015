package esiea.projetweb2015;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

	private static final String template = "Voici %s !";
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Article changeTitle(@RequestParam(value="name", required=false, defaultValue="un article") String name){
		return new Article(0,0,String.format(template, name));
	}
}
