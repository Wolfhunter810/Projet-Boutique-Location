package articles;

public class Matelas extends ArticleDimensionable{
	private double tempsGonflage;
	
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
	 * @param tempsGonflage
	 */
	public Matelas(String reference, String marque, String modele, double prixLocation, int nbStock, double hauteur,
			double largeur, double longueur, double poidsMax, double tempsGonflage) {
		super(reference, marque, modele, prixLocation, nbStock, hauteur, largeur, longueur, poidsMax);
		this.tempsGonflage = tempsGonflage;
	}
	
	/**
	 * get the inflation time
	 * @return the inflation time
	 */
	public double getTempsGonflage() {
		return tempsGonflage;
	}
	
	/**
	 * set the inflation time
	 * @param tempsGonflage
	 */
	public void setTempsGonflage(double tempsGonflage) {
		this.tempsGonflage = tempsGonflage;
	}

	@Override
	/**
	 * Affiche les attributs des matelas
	 */
	public void afficher() {
		super.afficher();
		System.out.println("Temps de gonflage : "+this.tempsGonflage);
	}
}
