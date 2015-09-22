package esiea.projetweb2015;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/title")
public class TitleController {
	private static final String template = "Toute l'actus de %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Greeting changeTitle(@RequestParam(value="name", required=false, defaultValue="Blizzard") String name){
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
