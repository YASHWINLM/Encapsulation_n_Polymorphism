package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctors= new ArrayList<Doctor>();
	ArrayList<Patient> patients= new ArrayList<Patient>();
	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		doctors.add(generalPractitioner);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		List<Doctor> Doctor= new ArrayList<Doctor>();
		for (int i = 0; i < doctors.size(); i++) {
			Doctor.add(doctors.get(i));
		}
		
		return Doctor;
	}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		doctors.add(surgeon);
		
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
		
	}

	public List<Doctor> getPatients() {
		// TODO Auto-generated method stub
	
		
		return null;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = 0; j < patients.size(); j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					doctors.get(i).assignPatient(patients.get(j));
				}
			}
			
			
		}		
		
	}

}
