package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	ArrayList<Patient> AssignedPatients= new ArrayList<Patient>();
	
	public boolean performsSurgery() {

		int x=0;
		if (this instanceof Surgeon) {
			x+=1;
		}
		if (x>0) {
			return true;
		}
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		int x=0;
		if (this instanceof GeneralPractitioner) {
			x+=1;
		}
		if (x>0) {
			return true;
		}
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (this.getPatients().size()>=3) {
			throw new DoctorFullException();
		}
		AssignedPatients.add(patient);
		
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		
		return AssignedPatients;
	}

	public void doMedicine() {
		for (int i = 0; i < AssignedPatients.size(); i++) {
			this.getPatients().get(i).caredForInt+=1;
		}
		
	}

}
