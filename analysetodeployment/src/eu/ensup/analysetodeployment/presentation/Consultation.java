package eu.ensup.analysetodeployment.presentation;

import eu.ensup.analysetodeployment.domaine.Medecin;
import eu.ensup.analysetodeployment.domaine.Patient;
import eu.ensup.analysetodeployment.service.MedecinService;

public class Consultation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient patient = new Patient(1, null, "NDIAYE", "KHADY");
		Medecin medecin = new Medecin(1, patient, "Oberlo", "François");
		patient.setMed(medecin);

		MedecinService medserv = new MedecinService(medecin);
		System.out.println(medserv.consulterPatient());
	}

}
