package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	ArrayList<Patient> AssignedPatients= new ArrayList<Patient>();
	
	public Object performsSurgery() {
	Hospital h = new Hospital();
	Doctor s= new Surgeon();
	if(h.getDoctors().equals(s)) {
		return true;
		
	}
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return null;
	}

	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
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
