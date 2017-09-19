package articles;

/*
 * Mini-projet : Boutique de location
 * Auteurs: Aurélio Hardy, Arthur Baron, Yoann Auffredo
 */

public abstract class ArticleDimensionable extends Article {
	protected double hauteur;
	protected double largeur;
	protected double longueur;
	protected double poidsMax;
	
	/**
	 * Constructor
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixLocation
	 * @param nbStock
	 * @param hauteur
	 * @param largeur
	 * @param longueur
	 * @param poidsMax
	 */
	public ArticleDimensionable(String reference, String marque, String modele, double prixLocation, int nbStock,
			double hauteur, double largeur, double longueur, double poidsMax) {
		super(reference, marque, modele, prixLocation, nbStock);
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.longueur = longueur;
		this.poidsMax = poidsMax;
	}
	
	/**
	 * get the hight
	 * @return hight in cm
	 */
	public double getHauteur() {
		return hauteur;
	}
	
	/**
	 * set the hight
	 * @param hauteur in cm
	 */
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	/**
	 * get the width
	 * @return width in cm
	 */
	public double getLargeur() {
		return largeur;
	}
	
	/**
	 * set the width
	 * @param largeur in cm
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	/**
	 * get the length
	 * @return the length in cm
	 */
	public double getLongueur() {
		return longueur;
	}
	
	/**
	 * set the length
	 * @param longueur in cm
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * get the maximum weight
	 * @return the maximum weight
	 */
	public double getPoidsMax() {
		return poidsMax;
	}

	/**
	 * set the maximum weight in kg
	 * @param poidsMax
	 */
	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	
	/**
	 * Affiche les attributs des articles dimentionnables
	 */
	public void afficher(){
		super.afficher();
		System.out.println("Dimention :"+this.longueur+" x "+this.largeur+" x "+this.hauteur +" cm");
		System.out.println("Poids maximum toléré : "+this.poidsMax +"kg");
	}
}
