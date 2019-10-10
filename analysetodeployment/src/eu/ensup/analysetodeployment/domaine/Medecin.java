package eu.ensup.analysetodeployment.domaine;

public class Medecin {

	private int idmed;
	private Patient p;
	private String nom;
	private String prenom;

	public Medecin(int idmed, Patient p, String nom, String prenom) {
		super();
		this.idmed = idmed;
		this.p = p;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String consulterPatient() {

		return "Le patient " + this.p.getNom() + " " + this.p.getPrenom() + " a été consulté(e) par Docteur " + this.nom
				+ " " + this.prenom + "\n";
	}

	public int getIdmed() {
		return this.idmed;
	}

	public String getNom() {
		return this.nom;
	}

	public Patient getP() {
		return this.p;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setIdmed(int idmed) {
		this.idmed = idmed;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setP(Patient p) {
		this.p = p;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
