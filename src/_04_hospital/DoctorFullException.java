package _04_hospital;

public class DoctorFullException extends Exception {

	public void full() {
		
		System.out.println("Doctors cannot handle more than 3 patients");
		
	}
	
}
