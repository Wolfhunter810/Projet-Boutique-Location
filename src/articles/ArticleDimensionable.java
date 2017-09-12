package articles;

public class ArticleDimensionable extends Article {
	protected double hauteur;
	protected double largeur;
	protected double longueur;
	
	public ArticleDimensionable(String reference, String marque, String modele, double prixLocation, int nbStock,
			double hauteur, double largeur, double longueur) {
		super(reference, marque, modele, prixLocation, nbStock);
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public double getHauteur() {
		return hauteur;
	}
	
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public double getLargeur() {
		return largeur;
	}
	
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public double getLongueur() {
		return longueur;
	}
	
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
}
