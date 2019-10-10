package eu.ensup.analysetodeployment.domaine;

public class Patient {

	private int idpat;
	private Medecin med;

	public Patient(int idpat) {
		super();
		this.idpat = idpat;
	}

	public int getIdpat() {
		return this.idpat;
	}

	public Medecin getMed() {
		return this.med;
	}

	public void setIdpat(int idpat) {
		this.idpat = idpat;
	}

	public void setMed(Medecin med) {
		this.med = med;
	}

}
