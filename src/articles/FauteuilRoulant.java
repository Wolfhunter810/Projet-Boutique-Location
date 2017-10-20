package articles;

/*
 * Mini-projet : Boutique de location
 * Auteurs: Aurélio Hardy, Arthur Baron, Yoann Auffredo
 */

public class FauteuilRoulant extends Article {

	/**
	 * attribute largeur : the width
	 */
	private double largeur;
	
	/**
	 * attribute poids : the weight 
	 */
	private double poids;
	
	/**
	 * Constructor
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixLocation
	 * @param nbStock
	 * @param largeur
	 * @param poids
	 */
	public FauteuilRoulant(String reference, String marque, String modele,
			double prixLocation, int nbStock, double largeur, double poids) {
		super(reference, marque, modele, prixLocation, nbStock);
		this.largeur = largeur;
		this.poids = poids;
	}

	/**
	 * get la largeur
	 * @return largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * set la largeur
	 * @param largeur
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	/**
	 * get le poids
	 * @return poids
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * set le poids
	 * @param poids
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}
}
