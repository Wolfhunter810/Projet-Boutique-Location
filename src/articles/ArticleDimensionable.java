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
	 * get la hauteur
	 * @return hauteur en cm
	 */
	public double getHauteur() {
		return hauteur;
	}
	
	/**
	 * set la hauteur
	 * @param hauteur en cm
	 */
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	/**
	 * get la largeur
	 * @return largeur en cm
	 */
	public double getLargeur() {
		return largeur;
	}
	
	/**
	 * set la largeur
	 * @param largeur en cm
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	/**
	 * get la longueur
	 * @return la longueur en cm
	 */
	public double getLongueur() {
		return longueur;
	}
	
	/**
	 * set la longueur
	 * @param longueur en cm
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * get le poids maximum
	 * @return le poids maximum
	 */
	public double getPoidsMax() {
		return poidsMax;
	}

	/**
	 * set le poids maximum
	 * @param le poids maximum en kg
	 */
	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	
	/**
	 * Affiche les attributs des articles dimentionnables
	 */
	public String toString(){
		return (super.toString()+" - Dimention:"+this.longueur+" x "+this.largeur+" x "+this.hauteur +" cm - Poids max: "+this.poidsMax +"kg");
	}
}
