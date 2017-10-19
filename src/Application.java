/*
 * Mini-projet : Boutique de location
 * Auteurs: Aurélio Hardy, Arthur Baron, Yoann Auffredo
 */

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import Location.*;
import articles.*;

public class Application {
	public static List<Article> articles;
	public static List<Location> locations;
	public static List<Client> clients;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		init();
		//Test.testClientTri();
		//Test.testArticlesTri();
		boolean continuer = true;
		
		while(continuer){
	
			System.out.println("Bienvenue sur l'application de la société Aurélio Inc.");
			System.out.println("Choisissez une action à effectuer");
			System.out.println("1-afficher la liste des artciles");
			System.out.println("2-créer une commande");
			System.out.println("3-afficher les locations en cours");
			System.out.println("4-calcul des recettes sur une période");
			System.out.println("5- ***exit***");
			System.out.println("----------------------------------------");

			//demande à l'utilisateur un nombre de 1 à 5
			int choixAction = selectInt(5);
			
			//les entrées sont filtrées donc pas de default case
			switch(choixAction){
			//1-afficher la liste des artciles
			case 1:
				System.out.println("Veuillez sélectionner un mode de tri : "
						+ "1[reference], 2[marque], 3[modele], 4[prix]");
				System.out.println("----------------------------------------");

				int choixTri = selectInt(4);
				switch(choixTri){
				case 1:
					//Le replace sert à sauter les lignes entre chaque élément de la liste
					System.out.println(tri("reference").toString().replaceAll(",", "\n"));
					break;
				case 2:
					System.out.println(tri("marque").toString().replaceAll(",", "\n"));
					break;
				case 3:
					System.out.println(tri("modele").toString().replaceAll(",", "\n"));
					break;
				case 4:
					System.out.println(tri("prix").toString().replaceAll(",", "\n"));
					break;
				}
				break;
			
			//2-créer une commande
			case 2:
				System.out.println("Vous allez saisir votre commande : ");
				System.out.println(clients);
				
				int maxId=0;
				for(Client c: clients){
					maxId =Math.max(maxId, c.getId());
				}
				boolean clientOk = false;
				
				//pour eviter le client not defined
				Client client = null;
				
				while(!clientOk){
					System.out.println("Veuillez rentrer l'id du client");

					int clientId = selectInt(maxId);
					for(Client c: clients){
						if(c.getId() == clientId){
							clientOk=true;
							client = c;
						}
					}
				}

				String date_d;
				do{
					System.out.println("Veuillez rentrer la date de début de location (JJ/MM/AAAA)");
					date_d= sc.nextLine();
				}while(!date_d.matches("^\\d{2}/\\d{2}/\\d{4}$"));
				
				String[] date_dTab = date_d.split("/");
				GregorianCalendar calendarD = new GregorianCalendar(
						Integer.parseInt(date_dTab[2]), Integer.parseInt(date_dTab[1]),
						Integer.parseInt(date_dTab[0]));
				
				//convert to georgian calender
				String date_f;
				do{
					System.out.println("Veuillez rentrer la date de fin de location (JJ/MM/AAAA)");
					 date_f = sc.nextLine();
				}while(!date_f.matches("^\\d{2}/\\d{2}/\\d{4}$"));
				
				String[] date_fTab = date_d.split("/");
				GregorianCalendar calendarF = new GregorianCalendar(
						Integer.parseInt(date_fTab[2]), Integer.parseInt(date_fTab[1]),
						Integer.parseInt(date_fTab[0]));
				Location loc = new Location(client,  calendarD , calendarF);
	
				System.out.println("Liste des articles : \n");
				System.out.println(articles);
				
				String ref ;
				Article art = null;
				do {
					art=null;
					System.out.println("Veuillez ajouter un article à la commande en saisissant sa référence (taper -1 pour finir)");
					ref = sc.nextLine();
					if(ref.equals("-1"))
						break;
					
					System.out.println(ref);
					for(Article a: articles){
						
						if(a.getReference().equals(ref))
							art = a;
					}
					if(art != null){
						boolean artAjoute = loc.ajouterArticle(art);
						if(!artAjoute){
							System.out.println("article non ajouté, stock non disponible");
						} else {
							System.out.println("article ajouté");
						}
					} else
						System.out.println("la référence saisie n'existe pas");
					
				}while(ref != "-1");
				
				if(loc.getArticles().isEmpty()){
					System.out.println("commande sans articles, commande supprimée");
				} else {
					locations.add(loc);
					System.out.println("fin de commande");
				}
				
				break;
				
			//3-afficher les locations en cours
			case 3:
				System.out.println("Veuillez sélectionner un client parmi la liste : ");
				int index = 1;
				for(Client c : clients){
					System.out.println(index+"["+c.getPrenom()+" "+c.getNom()+"]");
					index++;
				}
				System.out.println("----------------------------------------");
				boolean repeat = true;
				while(repeat) {
					int choixClient = selectInt(clients.size());
					List<Location>lstLocationsTrie = getLocationsByClient(choixClient-1);
					if(lstLocationsTrie.size()==0){
						System.out.println("Aucune location trouvée pour l'ID "+choixClient);
					}else{
						System.out.println(lstLocationsTrie.toString().replaceAll(",", "\n"));
						repeat = false;
					}
				}
				break;
				
			//4-calcul des recettes sur une période
			case 4:
				break;
			case 5:
				continuer = false;
				break;
			}
		}
	}
	
	/**
	 * Initialise les listes de clients et d'articles
	 */
	public static void init(){
		articles = new ArrayList<Article>();
		locations = new ArrayList<Location>();
		clients = new ArrayList<Client>();
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
		
		//CREATION LOCATION
		Client c = new Client(1, "Baron", "Arthur", "12 rue du chemin", 673920483);
		clients.add(c);
		Location l = new Location(c, new GregorianCalendar(2017,9,01), new GregorianCalendar(2017,10,01));
		l.ajouterArticle(articles.get(4));
		l.ajouterArticle(articles.get(1));
		locations.add(l);
		
		l = new Location(c, new GregorianCalendar(2017,9,01), new GregorianCalendar(2017,10,01));
		l.ajouterArticle(articles.get(8));
		l.ajouterArticle(articles.get(8));
		locations.add(l);
		
		c = new Client(2, "Auffredo", "Yoann", "13 rue du chemin", 649302812);
		clients.add(c);
		l = new Location(c, new GregorianCalendar(2017,8,18), new GregorianCalendar(2017,10,18));
		l.ajouterArticle(articles.get(2));
		l.ajouterArticle(articles.get(5));
		l.ajouterArticle(articles.get(5));
		locations.add(l);
		
		c = new Client(3, "Hardy", "Aurelio", "14 rue du chemin", 738209839);
		clients.add(c);
		l = new Location(c, new GregorianCalendar(2017,4,04), new GregorianCalendar(2017,8,04));
		l.ajouterArticle(articles.get(6));
		l.ajouterArticle(articles.get(7));
		l.ajouterArticle(articles.get(3));
		locations.add(l);
		//FIN CREATION LOCATION
	}
	
	/**
	 * demande à l'utilisateur de choisir un nombre entre 1 et max
	 * @param max 
	 * @return le choix de l'utilisateur
	 */
	public static int selectInt( int max){
		//sc.next();
		System.out.println("Entrez un nombre entre 1 et "+max);
		int res = -1;
		while (true) {
		    while (!sc.hasNextInt()) {
		        System.out.println("Erreur, entrez un NOMBRE entre 1 et "+max);
		        sc.nextLine(); //si c'est pas un int on va à la ligne l'après
		    }
		    res = sc.nextInt();
		    if (res >= 1 && res <= max) {
		        break;
		    }
		    System.out.println("nombre invalide, entrez un nombre entre 1 et "+max);
		}
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
	
	/**
	 * Filtre les locations pour retrouner uniquement celles qui correspondent à l'id du client envoyé en paramètre
	 * @param id
	 * @return une liste de locations qui correspondent à l'id du client sélectionné
	 */
	public static List<Location> getLocationsByClient(int index){
		int id = clients.get(index).getId();
		List<Location> lstLocationsTrie = new ArrayList<Location>();
		for(Location l : locations){
			if(l.getClient().getId()==id){
				lstLocationsTrie.add(l);
			}
		}
		return lstLocationsTrie;
	}
}
