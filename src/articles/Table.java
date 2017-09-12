package articles;

public class Table extends ArticleDimensionable{
	private double poidsMax;

	public Table(String reference, String marque, String modele, double prixLocation, int nbStock, double hauteur,
			double largeur, double longueur, double poidsMax) {
		super(reference, marque, modele, prixLocation, nbStock, hauteur, largeur, longueur);
		this.poidsMax = poidsMax;
	}

	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	
}
