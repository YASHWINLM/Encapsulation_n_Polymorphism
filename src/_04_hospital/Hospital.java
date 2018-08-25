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

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		
		
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int x=-3;
		for (int i = 0; i < doctors.size(); i++) {
			if (x<0) {
				x+=3;
			}
			else if (x==0) {
				x+=3;
			}
			else if (x==3) {
				x+=3;
			}
			for (int j =x; j < patients.size(); j++) {
					try {
						doctors.get(i).assignPatient(patients.get(j));
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						break;
					}
				
			}
			
			
		}		
		
	}

}
