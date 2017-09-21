package articles;

/*
 * Mini-projet : Boutique de location
 * Auteurs: Aurélio Hardy, Arthur Baron, Yoann Auffredo
 */

public abstract class Article {
	protected String reference;
	protected String marque;
	protected String modele;
	protected double prixLocation;
	protected int nbStock;
	
	/**
	 * Constructor
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixLocation
	 * @param nbStock
	 */
	public Article(String reference, String marque, String modele, double prixLocation, int nbStock) {
		super();
		this.reference = reference;
		this.marque = marque;
		this.modele = modele;
		this.prixLocation = prixLocation;
		this.nbStock = nbStock;
	}
	
	/**
	 * get the reference
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	
	/**
	 * set the reference
	 * @param reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	/**
	 * get the marque
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}
	
	/**
	 * set the marque
	 * @param marque
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	/**
	 * get the modele
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}
	
	/**
	 * set the modele
	 * @param modele
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	/**
	 * get the location price
	 * @return the location price in Euro
	 */
	public double getPrixLocation() {
		return prixLocation;
	}
	
	/**
	 * set the location price
	 * @param prixLocation in Euro
	 */
	public void setPrixLocation(double prixLocation) {
		this.prixLocation = prixLocation;
	}
	
	/**
	 * get the stock
	 * @return stock
	 */
	public int getNbStock() {
		return nbStock;
	}
	
	/**
	 * set the stock
	 * @param nbStock
	 */
	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}
	
	/**
	 * Affiche les attributs des articles
	 */
	public String toString(){
		return "ref: "+ this.reference+" - Marque : "+this.marque +" - Modele : "+this.modele+" - Prix: "+this.prixLocation+"€/jour - Stock : "+this.nbStock;
	}
}
