package articles;

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
	 * @return hight
	 */
	public double getHauteur() {
		return hauteur;
	}
	
	/**
	 * set the hight
	 * @param hauteur
	 */
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	/**
	 * get the width
	 * @return width
	 */
	public double getLargeur() {
		return largeur;
	}
	
	/**
	 * set the width
	 * @param largeur
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	/**
	 * get the length
	 * @return the length
	 */
	public double getLongueur() {
		return longueur;
	}
	
	/**
	 * set the length
	 * @param longueur
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
	 * set the maximum weight
	 * @param poidsMax
	 */
	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	
}
