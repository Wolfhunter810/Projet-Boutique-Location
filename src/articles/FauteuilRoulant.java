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
	 * get the width
	 * @return width
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * set the width
	 * @param width
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	/**
	 * get the weight
	 * @return weight
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * set the weight
	 * @param weight
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}
}
