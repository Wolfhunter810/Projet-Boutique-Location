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
		this.prixJour = 10;
	}
	
	/**
	 * ajout d'un article à la commande si le stock le permet
	 * @param article
	 * @return vrai si l'article est ajouté
	 */
	public boolean ajouterArticle(Article article){
		if(article.getNbStock()>0){
			articles.add(article);
			prixJour += article.getPrixLocation();
			article.setNbStock(article.getNbStock()-1);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * si l'article est dans la commande, le retire
	 * @param article
	 * @return vrai si l'article est retiré
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
		File file = new File("files/"+anneeFin+"_"+moisFin+".loc.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Client : "+this.getClient().getNom()+" "+this.getClient().getPrenom());
		bw.flush();
		bw.write("\nRestitution : "+String.valueOf(this.getDate_fin().get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(this.getDate_fin().get(Calendar.MONTH))+"/"+String.valueOf(this.getDate_fin().get(Calendar.YEAR)));
		bw.flush();
		bw.write("\nContenant :");
		for(Article art : this.getArticles()) {
			bw.write("\n	-" + art.getClass().getSimpleName() +" "+ art.getReference());
		}
		bw.close();
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
	
	public String toString(){
		return("Location de "+this.articles.size()+
				" articles à "+this.client.getPrenom()+
				" "+this.client.getNom()+
				" du "+this.date_debut.get(GregorianCalendar.DAY_OF_MONTH)+"/" + 
				this.date_debut.get(GregorianCalendar.MONTH) + "/" + 
				this.date_debut.get(GregorianCalendar.YEAR)+
				" au "+ this.date_fin.get(GregorianCalendar.DAY_OF_MONTH)+"/" + 
				this.date_fin.get(GregorianCalendar.MONTH) + "/" + 
				this.date_fin.get(GregorianCalendar.YEAR)+
				" pour un montant de "+this.prixJour);
	}
	
	public boolean isWithinRange(GregorianCalendar dateDebut, GregorianCalendar dateFin) {
		return (this.date_debut.before(dateFin) && this.date_debut.after(dateDebut));
	}
	
	public int getDuree() {
		return (this.date_fin.get(Calendar.DAY_OF_YEAR) - this.date_debut.get(Calendar.DAY_OF_YEAR));
	}
}
