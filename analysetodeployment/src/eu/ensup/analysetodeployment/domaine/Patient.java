package eu.ensup.analysetodeployment.domaine;

public class Patient {

	private int idpat;
	private Medecin med;
	private String nom;
	private String prenom;

	public Patient(int idpat, Medecin med, String nom, String prenom) {
		super();
		this.idpat = idpat;
		this.med = med;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getIdpat() {
		return this.idpat;
	}

	public Medecin getMed() {
		return this.med;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setIdpat(int idpat) {
		this.idpat = idpat;
	}

	public void setMed(Medecin med) {
		this.med = med;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
