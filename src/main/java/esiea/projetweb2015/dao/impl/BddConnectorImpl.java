package esiea.projetweb2015.dao.impl;

import static esiea.projetweb2015.model.GameId.DIABLO;
import static esiea.projetweb2015.model.GameId.HS;
import static esiea.projetweb2015.model.GameId.SC;
import static esiea.projetweb2015.model.GameId.WOW;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import esiea.projetweb2015.dao.ArticleDao;
import esiea.projetweb2015.dao.BddConnector;

@Repository
public class BddConnectorImpl implements BddConnector{
	
	private static final Logger log = LoggerFactory.getLogger(BddConnectorImpl.class);	
	
	// SCHEMA SQL LINES
	private static final String DROP_ARTICLE = "DROP TABLE ARTICLE IF EXISTS";
	private static final String CREATE_ARTICLE = "CREATE TABLE ARTICLE ("
			+ "id INT PRIMARY KEY NOT NULL, "
			+ "gameId INT NOT NULL, "
			+ "content text NOT NULL, "
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
    	articleDao.saveArticle(1, DIABLO, "<p>Cela faisait longtemps, Nephalem. Mon maître est plus dangereux que jamais, et hante éternellement la forteresse de Pandémonium, bien au-delà des limites de votre petite campagne. Mais il est distrayant de vous regarder vous débattre contre le chaos et la destruction qui envahissent Sanctuaire. Des horreurs continuent à surgir d’endroits depuis longtemps oubliés, et votre insatiable curiosité vous rapproche sans cesse de la fin. Accordez-moi le plaisir de vous montrer le chemin.</p> ", "<h3>ÊTES-VOUS PRÊT POUR LA 2.3 ?</h3>", "Nevalistis", new Date(2015-1900, 8, 18));
    	articleDao.saveArticle(2, DIABLO, "<p>La mise à jour 2.3.0 approche à grands pas avec nombre d’enthousiasmantes nouveautés pour Diablo III. Alors que vous avez été nombreux à nous faire part de votre impatience de les découvrir, nous avons remarqué des questions fort pertinentes concernant ce qui vous attend avec la saison 4, auxquelles nous allons répondre dans le présent guide.Comme les précédentes, la saison 4 donnera accès à des objets légendaires, récompenses ornementales et effets de transmogrification saisonniers exclusifs. Nous allons en présenter certains ci-dessous, sans oublier la SPLEEENDIDE nouvelle interface de suivi de la saison : le périple. Accrochez-vous bien, voilà ce que vous réserve la saison 4 !</p>", "<h3>APERÇU DE LA SAISON 4</h3>", "Tyvalir ", new Date(2015-1900, 8, 11));
    	articleDao.saveArticle(3, WOW, "<p>La tombe de Sargeras a été rouverte, et les démons de la Légion ardente fondent sur notre monde. Ils concentrent la totalité de leur terrifiante puissance à l’invocation du titan noir en Azeroth… et ils savent déjà où se trouve la clé qui lui permettra de revenir. La Horde et l’Alliance dévastées, vous seul êtes à même de vous emparer des armes les plus prodigieuses de l’univers de Warcraft, d’arpenter les antiques îles Brisées à la recherche de reliques des titans et de défier la Légion avant que le dernier espoir d’Azeroth s’évanouisse. Armez-vous de courage, champion. L’extinction est imminente.</p>", "<h3>La chasse</h3>", "Blizzard", new Date());
    	articleDao.saveArticle(4, WOW, "<p>Dominez vos ennemis en tant que chasseur de démons, un paria parmi les elfes, banni pour avoir osé manier les terribles pouvoirs de la Légion. Dotés d’une mobilité et d’une acuité sensorielle surnaturelles, les chasseurs de démons puisent dans des pouvoirs interdits quand la situation l’exige, adoptant alors de terrifiantes formes corrompues. Suivez la voie de la Dévastation, pour détruire tous ceux qui se dressent en travers de votre chemin à l’aide de brûlantes attaques démoniaques, ou spécialisez-vous en Vengeance et endurez le courroux des plus puissants démons, tandis que leurs attaques alimentent votre haine </p> ", "<h3>Traquez vos proies en tant que chasseur de démons</h3>", "moi", new Date());
    	articleDao.saveArticle(5, HS, "<p>Le temps file comme un cavalier sans tête au galop : le championnat du monde de Hearthstone est à nos portes ! La route fut longue et la pente rude, mais le bout du tunnel se dessine déjà à l'horizon du championnat du monde ! Le premier duel toutes cartes tirées commencera le 28 octobre à 17h00, parmi les festivités de la semaine d'ouverture de la BlizzCon. Seize des meilleurs joueurs mondiaux de Hearthstone, en provenance d'Europe, des États-Unis d'Amérique, de Chine, d'Asie et du Pacifique ont répondu à l'appel de l'aubergiste. Les affrontements seront sans pitié pour monter dans les hauteurs du classement tant convoitées depuis des mois, et la victoire finale à portée de leurs petites mains agiles ! Qui sera couronné champion du monde 2015 au terme de ce tournoi en deux étapes, et pourra prétendre à sa part des 250 000 $ mis en jeu ?</p>", " <h3>Le championnat du monde arrive à sa conclusion</h3>", "Whirthun ", new Date(2015-1900, 10, 22));
    	articleDao.saveArticle(6, SC, "<p> Nous voilà presque arrivés à la fin de la bêta de Legacy of the Void ! Vos commentaires et suggestions ont été extraordinaires, et nous remercions du fond du cœur les nombreux testeurs pour leur participation. Comme la bêta se termine bientôt*, nous allons bientôt fermer les forums qui lui étaient dévolus. Si vous avez encore des commentaires à formuler, nous vous suggérons de rédiger vos derniers messages le plus rapidement possible. Nous vous conseillons de désinstaller la bêta, car la version finale de Legacy of the Void n’utilise pas les mêmes fichiers. Pour cela, choisissez « Bêta : Legacy of the Void » dans le menu déroulant de l’application Battle.net, puis choisissez Options > Désinstaller jeu.</p>", "<h3>La fin de la bêta de Legacy of the Void</h3>", "Blizzard Entertainment", new Date(2015-1900, 10, 26));
	}
	
}
