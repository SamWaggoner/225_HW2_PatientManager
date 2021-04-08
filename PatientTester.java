// Collaborated with Alex Bourgoin, alexander.bourgoin@maine.edu

public class PatientTester {

	public static void main(String[] args) {
	
		PatientManager pManager = new PatientManager();
		System.out.println(pManager);
		for (int k = 1; k < 5; k++) 
			pManager.AddPatient(new Patient(k,100*k));
		System.out.println(pManager);
		pManager.caffeineAbsorption();
		System.out.println(pManager);
		double highestCaffeineLVL = 0;
		int highestCaffeineIndex = -1;
		for (int m = 0; m < 6; m++) {
			if (pManager.patientlist[m] != null) {
				if (pManager.patientlist[m].caffeineLevel > highestCaffeineLVL) {
					highestCaffeineLVL = pManager.patientlist[m].caffeineLevel;
					highestCaffeineIndex = m;
				}
			}
		}
		pManager.RemovePatient(highestCaffeineIndex);
		System.out.println(pManager);
	}

}
