package _04_hospital;

public class Patient {

	 int caredForInt= 0;
	
	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		if (caredForInt>0) {
			return true;
		}
		
		return false;
	}

	public void checkPulse() {
		caredForInt+=1;
		
	}

}
