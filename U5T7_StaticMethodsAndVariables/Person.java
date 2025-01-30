package U5T7_StaticMethodsAndVariables;

public class Person {
    private String name;
    private Boolean isVaccinated;

    public Person(String name) {
        this.name = name;
        isVaccinated = false;
    }

    public String getName() {
        return name;
    }

    public Boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinationStatus() {
        isVaccinated = true;
    }
}
