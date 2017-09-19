package Location;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import articles.*;

public class Application {
	public ArrayList<Article> articles;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenue sur l'application de la société Aurélio Inc.");
		System.out.println("Choisissez une action à effectuer");
		System.out.println("1-afficher la liste des artciles");
		System.out.println("2-créer une commande");
		System.out.println("3-afficher les locations en cours");
		System.out.println("4-calcul des recettes sur une période");
		System.out.println("----------------------------------------");
		
		
		int tmp=0;
		do{
			System.out.println("Vous devez entrer un nombre entre 1 et 4");
			try{
				tmp = sc.nextInt();
			} catch(InputMismatchException e){
				System.out.println("j'ai dit un NOMBRE!!!");
			}
		}while(tmp < 1 || tmp > 4);
			
		
		
			

	
}
		
		/**
		 * afficher les articles triés
		 * 
		 * enregistrer une commande
		 * 
		 * afficher locations en cours
		 * 
		 * archivage(automatique)
		 * 
		 * calcul recette
		 * */
	
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
