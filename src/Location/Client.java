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
	 * return id client
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set id client 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * get le nom du client
	 * @return nom du client
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Set nom du client
	 * @param nom du client
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * get le prenom du client
	 * @return le prenom du client
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Set le prenom du client
	 * @param le prenom du client
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * get l'adresse du client
	 * @return l'adresse du client
	 */
	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * Set l'adresse du client
	 * @param l'adresse du client
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * get le numero de telephone du client
	 * @return le numero de telephone du client
	 */
	public int getTel() {
		return tel;
	}

	/**
	 * Set le numero de telephone du client
	 * @param le numero de telephone du client
	 */
	public void setTel(int tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
}
