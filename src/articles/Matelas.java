package articles;

public class Matelas extends ArticleDimensionable{
	private double poidsMax;
	private double tempsGonflage;
	public Matelas(String reference, String marque, String modele, double prixLocation, int nbStock, double hauteur,
			double largeur, double longueur, double poidsMax, double tempsGonflage) {
		super(reference, marque, modele, prixLocation, nbStock, hauteur, largeur, longueur);
		this.poidsMax = poidsMax;
		this.tempsGonflage = tempsGonflage;
	}
	
	public double getPoidsMax() {
		return poidsMax;
	}
	
	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	
	public double getTempsGonflage() {
		return tempsGonflage;
	}
	
	public void setTempsGonflage(double tempsGonflage) {
		this.tempsGonflage = tempsGonflage;
	}
}
