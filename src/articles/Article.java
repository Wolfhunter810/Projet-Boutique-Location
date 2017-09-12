package articles;

public class Article {
	protected String reference;
	protected String marque;
	protected String modele;
	protected double prixLocation;
	protected int nbStock;
	
	public Article(String reference, String marque, String modele, double prixLocation, int nbStock) {
		super();
		this.reference = reference;
		this.marque = marque;
		this.modele = modele;
		this.prixLocation = prixLocation;
		this.nbStock = nbStock;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getModele() {
		return modele;
	}
	
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public double getPrixLocation() {
		return prixLocation;
	}
	
	public void setPrixLocation(double prixLocation) {
		this.prixLocation = prixLocation;
	}
	
	public int getNbStock() {
		return nbStock;
	}
	
	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}
}
