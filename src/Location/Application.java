package Location;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import articles.*;

public class Application {
	public ArrayList<Article> articles;
	
	public static void main(String[] args){
		
	}
	
	public List<Article> tri(String modeTri){
		List<Article> articlesTrie = this.articles;
		switch(modeTri){
		default:
			System.out.println("Veuillez sélectionner un mode : reference, marque, modele, prix");
			break;
		case "reference":
			articlesTrie.sort((a1, a2) -> a1.getReference().compareTo(a1.getReference()));
			break;
		case "marque":
			articlesTrie.sort((a1, a2) -> a1.getMarque().compareTo(a1.getMarque()));
			break;
		case "modele":
			articlesTrie.sort((a1, a2) -> a1.getModele().compareTo(a1.getModele()));
			break;
		case "prix":
			articlesTrie.sort((a1, a2) -> Double.compare(a1.getPrixLocation(), a1.getPrixLocation()));
			break;
		}
		return articlesTrie;
	}
}
