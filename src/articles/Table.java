package articles;

/*
 * Mini-projet : Boutique de location
 * Auteurs: Aurélio Hardy, Arthur Baron, Yoann Auffredo
 */

public class Table extends ArticleDimensionable{
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
	public Table(String reference, String marque, String modele, double prixLocation, int nbStock, double hauteur,
			double largeur, double longueur, double poidsMax) {
		super(reference, marque, modele, prixLocation, nbStock, hauteur, largeur, longueur, poidsMax);
	}

	@Override
	/**
	 * Affiche les attributs des tables
	 */
	public String toString() {
		return(super.toString());
	}
}
