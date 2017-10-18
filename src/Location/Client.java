package Location;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private int tel;
	
	public Client(int id, String nom, String prenom, String adresse, int tel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
	}
	
	/**
	 * return the client id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the client id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the client's name
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Sets the client's name
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Returns the client's first name
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Sets the client's first name
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Returns the client's address
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * Sets the client's address
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Returns the client's phone number
	 * @return tel
	 */
	public int getTel() {
		return tel;
	}

	/**
	 * Sets the client's phone number
	 * @param tel
	 */
	public void setTel(int tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
}
