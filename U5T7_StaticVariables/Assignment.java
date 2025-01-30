package U5T7_StaticVariables;

public class Assignment {
    /* STATIC VARIABLE */
    public static final int DEFAULT_POINTS = 100;
    private static int totalAssignmentsCreated = 0;
 
    /* INSTANCE VARIABLES */
    private String title;
    private int pointValue;
 
    public Assignment(String title, int pointValue) {
        this.title = title;
        this.pointValue = pointValue;
 
        // increment totalAssignmentsCreated (static variable)
        // by 1 each time a new Assignment object is created
        totalAssignmentsCreated++;
    }
 
    public Assignment(String title) {
        this.title = title;
        pointValue = DEFAULT_POINTS;
        totalAssignmentsCreated++;
    }
 
    /* STATIC METHODS  */
 
    // static getter method - used to get a private static variable
    public static int getTotalAssignmentsCreated() {
        return totalAssignmentsCreated;
    }
 
    /* INSTANCE METHODS (non-static) */
 
    // increments point value on the assignment by 1 point
    public void incrementValue() {
        pointValue++;
    }
 
    // info string
    public String info() {
        String str = "\nTitle: " + title;  // using instance variable
        str += "\nPoint Value: " + pointValue;  // using instance variable
        str += "\nTotal Assignments Created: " + totalAssignmentsCreated;  // using STATIC variable
        return str;
    }
 }
 