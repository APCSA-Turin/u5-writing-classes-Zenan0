package U5T7_StaticVariables;

public class Employee {
    private String firstName;
    private String lastName;
    private int idNum;
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
        mostRecentEmployeeID = idNum;
        idNum++;
        totalEmployeesCreated++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return idNum;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        String str = "--------------------------" + "\n";
        str += "Employee full name: " + getFullName() + "\n";
        str += "Employee ID: " + getID() + "\n";
        str += "Most recent ID assigned: " + getMostRecentEmployeeID() + "\n";
        str += "Total employees hired: " + getTotalEmployeesCreated() + "\n";
        str += "--------------------------";
        return str;
    }
}
