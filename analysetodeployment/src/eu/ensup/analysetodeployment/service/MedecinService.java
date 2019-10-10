package eu.ensup.analysetodeployment.service;

import eu.ensup.analysetodeployment.domaine.Medecin;

public class MedecinService {

	private Medecin medecin;

	public MedecinService() {
		super();
	}

	public MedecinService(Medecin medecin) {
		super();
		this.medecin = medecin;
	}

	public String consulterPatient() {

		return "Le patient " + this.medecin.getP().getNom() + " " + this.medecin.getP().getPrenom()
				+ " a été consulté(e) par Docteur " + this.medecin.getNom() + " " + this.medecin.getPrenom() + "\n";
	}

}
