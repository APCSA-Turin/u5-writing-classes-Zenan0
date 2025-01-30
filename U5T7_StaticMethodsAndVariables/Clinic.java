package U5T7_StaticMethodsAndVariables;

public class Clinic {
    private int numVaccinated;
    private Person mostRecentPerson;
    private static int clinics = 0;
    private static int totalNumVaccinated = 0;

    public Clinic() {
        numVaccinated = 0;
        clinics++;
    }

    public Boolean vaccinate(Person p) {
        if (p.isVaccinated()) {
            return false;
        } else {
            totalNumVaccinated++;
            numVaccinated++;
            mostRecentPerson = p;
            p.setVaccinationStatus();
            return true;
        }
    }

    public static int getTotalClinics() {
        return clinics;
    }

    public static int getTotalVaccineCount() {
        return totalNumVaccinated;
    }

    public int getClinicVaccineCount() {
        return numVaccinated;
    }

    public Person mostRecentlyVaccinated() {
        return mostRecentPerson;
    }
}
