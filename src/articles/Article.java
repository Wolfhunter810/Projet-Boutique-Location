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
	 * get la reference
	 * @return la reference
	 */
	public String getReference() {
		return reference;
	}
	
	/**
	 * set la reference
	 * @param la reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	/**
	 * get la marque
	 * @return la marque
	 */
	public String getMarque() {
		return marque;
	}
	
	/**
	 * set la marque
	 * @param la marque
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	/**
	 * get le modele
	 * @return le modele
	 */
	public String getModele() {
		return modele;
	}
	
	/**
	 * set le modele
	 * @param le modele
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	/**
	 * get le prix de location
	 * @return le prix de location en euro
	 */
	public double getPrixLocation() {
		return prixLocation;
	}
	
	/**
	 * set le prix de location
	 * @param le prix de location Euro
	 */
	public void setPrixLocation(double prixLocation) {
		this.prixLocation = prixLocation;
	}
	
	/**
	 * get le stock
	 * @return le stock
	 */
	public int getNbStock() {
		return nbStock;
	}
	
	/**
	 * set le stock
	 * @param le Stock
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
