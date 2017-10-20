/*
 * Mini-projet : Boutique de location
 * Auteurs: AurÃ©lio Hardy, Arthur Baron, Yoann Auffredo
 */

import java.util.List;

import Location.Location;
import articles.*;

public class Test {
	/**
	 * Test les diffÃ©rents modes de tri
	 */
	public static void testArticlesTri(){
		List<Article> lstArticles = Application.articles;
		List<Article> lstArticleTrie = Application.tri("reference");
		System.out.println("============================");
		System.out.println("Tri par rÃ©fÃ©rence");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getReference());
		}
		
		lstArticleTrie = Application.tri("marque");
		System.out.println("============================");
		System.out.println("Tri par marque");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getMarque());
		}
		
		lstArticleTrie = Application.tri("modele");
		System.out.println("============================");
		System.out.println("Tri par modele");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getModele());
		}
		
		lstArticleTrie = Application.tri("prix");
		System.out.println("============================");
		System.out.println("Tri par prix");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getPrixLocation());
		}
	}
	
	/**
	 * Test le tri des locations par client
	 */
	public static void testClientTri(){
		List<Location>lstLocations = Application.locations;
		List<Location>lstLocationsTrie = Application.getLocationsByClient(1);
		for(Location l : lstLocationsTrie){
			System.out.println(l.toString());
		}
		
	}
	
	/**
	 * Test la création et l'édition du fichier relatif aux restitutions de locations
	 */
	public static void testRestitution() {
		List<Location>listLocations = Application.locations;
		Location uneLocation = listLocations.get(2);
		uneLocation.restituer();
	}
}
