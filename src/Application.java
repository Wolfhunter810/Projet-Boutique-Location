

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import articles.*;

public class Application {
	public static List<Article> articles;
	
	public static void main(String[] args){
		init();
		//Test.testArticlesTri();

		
		System.out.println("Bienvenue sur l'application de la société Aurélio Inc.");
		System.out.println("Choisissez une action à effectuer");
		System.out.println("1-afficher la liste des artciles");
		System.out.println("2-créer une commande");
		System.out.println("3-afficher les locations en cours");
		System.out.println("4-calcul des recettes sur une période");
		System.out.println("----------------------------------------");
		
		selectInt(5);
		System.out.println("valid");
					
	}
	
	public static void init(){
		articles = new ArrayList<Article>();
		//CREATION ARTICLES
		//Lits
		articles.add(new Lit("LIT1","MARQUE1","MODELE1",5.99,3,40.0,70.0,200.,150.0));
		articles.add(new Lit("LIT2","MARQUE1","MODELE12",3.99,4,50.0,120.0,300.,250.0));
		//Fauteuils roulants
		articles.add(new FauteuilRoulant("FR1","MARQUE2","MODELE23",1.99,6,50.5,160.0));
		articles.add(new FauteuilRoulant("FR2","MARQUE3","MODELE2",5.99,6,80.5,2000.0));
		articles.add(new FauteuilRoulant("FR3","MARQUE3","MODELE3",0.99,6,40.5,100.0));
		//Matelas
		articles.add(new Matelas("MA1", "MARQUE4", "MODELE-AZ", 10.0, 18, 10.6, 120.7, 240.1, 120.5, 150.85));
		articles.add(new Matelas("MA2", "MARQUE1", "MODELE-AXX-SUPERLARGE", 19.0, 18, 10.6, 320.7, 240.1, 200.5, 150.85));
		//Souleve malade
		articles.add(new SouleveMalade("SM1", "MARQUE5", "MODELE-SX", 24.99, 9, 160.5, 180.0));
		articles.add(new SouleveMalade("SM2", "MARQUE5", "MODELE-SM", 29.99, 9, 160.5, 280.0));
		articles.add(new SouleveMalade("SM3", "MARQUE5", "MODELE-SXL", 34.99, 9, 160.5, 380.0));
		//Table
		articles.add(new Table("TA1", "MARQUE1", "MODELE6-S", 39.99, 20, 120, 100, 3.20, 150));
		articles.add(new Table("TA2", "MARQUE1", "MODELE6-M", 49.99, 20, 120, 100, 3.20, 250));
		articles.add(new Table("TA3", "MARQUE1", "MODELE6-L", 59.99, 20, 120, 100, 3.20, 350));
		articles.add(new Table("TA4", "MARQUE1", "MODELE6-XL", 69.99, 20, 120, 100, 3.20, 450));
		//FIN CREATION ARTICLES
	}
	
	
	public static int selectInt( int max){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entre 1 et "+max);
		int res = -1;
		while (true) {
		    while (!sc.hasNextInt()) {
		        System.out.println("Erreur, entrez un NOMBRE entre 1 et "+max);
		        sc.nextLine(); // Discard junk entries
		    }
		    res = sc.nextInt();
		    if (res >= 1 && res <= max) {
		        break;
		    }
		    System.out.println("nombre invalide, entrez un nombre entre 1 et "+max);
		}
		sc.close();
		return res;
	}
	
	/**
	 * Tri les articles en fonction du paramètre:
	 * reference
	 * marque
	 * modele
	 * prix (décroissant)
	 * @param modeTri
	 * @return une liste d'article trié en fonction du paramètre d'entrée
	 */
	public static List<Article> tri(String modeTri){
		List<Article> articlesTrie = articles;
		switch(modeTri){
		default:
			System.out.println("Veuillez sélectionner un mode : reference, marque, modele, prix");
			break;
		case "reference":
			articlesTrie.sort((a1, a2) -> a1.getReference().compareTo(a2.getReference()));
			break;
		case "marque":
			articlesTrie.sort((a1, a2) -> a1.getMarque().compareTo(a2.getMarque()));
			break;
		case "modele":
			articlesTrie.sort((a1, a2) -> a1.getModele().compareTo(a2.getModele()));
			break;
		case "prix":
			articlesTrie.sort((a1, a2) -> Double.compare(a1.getPrixLocation(), a2.getPrixLocation()));
			break;
		}
		return articlesTrie;
	}
}
