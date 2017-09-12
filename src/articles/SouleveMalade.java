package articles;

/*
 * Mini-projet : Boutique de location
 * Auteurs: Aurélio Hardy, Arthur Baron, Yoann Auffredo
 */

public class SouleveMalade extends Article {

	/**
	 * attribute capaciteLevage: maximum weight you can lift
	 */
	private double capaciteLevage;
	
	/**
	 * attribute degrePivotage: angle of rotation
	 */
	private double degrePivotage;
	
	/**
	 * Constructor
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixLocation
	 * @param nbStock
	 * @param capaciteLevage
	 * @param degrePivotage
	 */
	public SouleveMalade(String reference, String marque, String modele,
			double prixLocation, int nbStock, double capaciteLevage, double degrePivotage){
		super(reference, marque, modele, prixLocation, nbStock);
		this.capaciteLevage = capaciteLevage;
		this.degrePivotage = degrePivotage;
	}

	/**
	 * get maximum weight you can lift
	 * @return maximum weight you can lift in kg
	 */
	public double getCapaciteLevage() {
		return capaciteLevage;
	}

	/**
	 * set maximum weight you can lift
	 * @param maximum weight you can lift in kg
	 */
	public void setCapaciteLevage(double capaciteLevage) {
		this.capaciteLevage = capaciteLevage;
	}

	/**
	 * get angle of rotation
	 * @return angle of rotation in degree
	 */
	public double getDegrePivotage() {
		return degrePivotage;
	}

	/**
	 * set angle of rotation
	 * @param angle of rotation in degree
	 */
	public void setDegrePivotage(double degrePivotage) {
		this.degrePivotage = degrePivotage;
	}
}
