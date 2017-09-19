package Location;

/*
 * Mini-projet : Boutique de location
 * Auteurs: Aurélio Hardy, Arthur Baron, Yoann Auffredo
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import articles.Article;

public class Location {

	private ArrayList<Article> articles;
	private GregorianCalendar date_debut;
	private GregorianCalendar date_fin;
	private double prixJour;
	private Client client;
	
	public Location(Client client, GregorianCalendar date_debut ,GregorianCalendar date_fin){
		this.client = client;
		this.articles = new ArrayList<Article>();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.prixJour = 0;
	}
	
	/**
	 * Add the article to the leasing
	 * @param article
	 */
	public void ajouterArticle(Article article){
		articles.add(article);
		prixJour += article.getPrixLocation();
		article.setNbStock(article.getNbStock()-1);
	}
	
	/**
	 * If the article is in the leasing remove it and return true, 
	 * else do nothing and return false
	 * @param article
	 * @return true if the article was removed, else false
	 */
	public boolean retirerArticle(Article article){
		if(articles.remove(article)){
			prixJour -= article.getPrixLocation();
			article.setNbStock(article.getNbStock()+1);
			return true;
		} else {
			return false;
		}	
	}

	/**
	 * 
	 * 
	 */
	public void restituer(){
		try {
		String anneeFin = String.valueOf(this.getDate_fin().get(Calendar.YEAR));
		String moisFin = String.valueOf(this.getDate_fin().get(Calendar.MONTH));
		File file = new File(anneeFin+moisFin+".txt");
		file.createNewFile();
	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*Getters-Setters*/
	
	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	public GregorianCalendar getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(GregorianCalendar date_debut) {
		this.date_debut = date_debut;
	}

	public GregorianCalendar getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(GregorianCalendar date_fin) {
		this.date_fin = date_fin;
	}

	public double getPrixJour() {
		return prixJour;
	}

	public void setPrixJour(double prixJour) {
		this.prixJour = prixJour;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
