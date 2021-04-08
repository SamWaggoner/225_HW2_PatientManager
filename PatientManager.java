
public class PatientManager {

	Patient[] patientlist = new Patient[6];
	
	public int AddPatient(Patient patient) {
		for (int i = 0; i <6; i++) {
			if (patientlist[i] == null) {
				patientlist[i] = patient;
				return i;
			}
		}
	
		return -1;
	}
	
	public Patient RemovePatient(int i) {
		Patient removedPatient = patientlist[i];
		patientlist[i] = null;
		return removedPatient;
	}
	
	public void caffeineAbsorption() {
		for (int j = 0; j < 6; j++) {
			if (patientlist[j] != null) {
			patientlist[j].caffeineLevel = patientlist[j].caffeineLevel - 130;
			if (patientlist[j].caffeineLevel <= 0) {
				RemovePatient(j);
			}
		}
		}
	}

	@Override
	public String toString() {
		int numPatients = 0;
		for (int n = 0; n < 6; n++) {
			if (patientlist[n] != null) {
				numPatients ++;
			}
					
		}
		return numPatients + "";
	}
	
	
	
	
	
}
