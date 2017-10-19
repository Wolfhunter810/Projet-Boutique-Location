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
	 * get la capacité de levage en kg
	 * @return la capacité de levage
	 */
	public double getCapaciteLevage() {
		return capaciteLevage;
	}

	/**
	 * set la capacité de levage en g
	 * @param la capacité de levage en kg
	 */
	public void setCapaciteLevage(double capaciteLevage) {
		this.capaciteLevage = capaciteLevage;
	}

	/**
	 * get le degre de pivotage
	 * @return le degre de pivotage
	 */
	public double getDegrePivotage() {
		return degrePivotage;
	}

	/**
	 * set le degre de pivotage
	 * @param le degre de pivotage
	 */
	public void setDegrePivotage(double degrePivotage) {
		this.degrePivotage = degrePivotage;
	}
}
