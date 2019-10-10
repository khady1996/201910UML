package eu.ensup.analysetodeployment.domaine;

public class Medecin {

	private int idmed;
	private Patient p;

	public Patient getP() {
		return p;
	}

	public void setP(Patient p) {
		this.p = p;
	}

	public Medecin(int idmed) {
		super();
		this.idmed = idmed;
	}

	public String consulterPatient() {

		return "Le patient " + this.p.getIdpat() + " a été consulté par Docteur " + this.idmed + "\n";
	}

	public int getIdmed() {
		return this.idmed;
	}

	public void setIdmed(int idmed) {
		this.idmed = idmed;
	}
}
