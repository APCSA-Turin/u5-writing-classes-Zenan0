package U5T7_StaticVariables;

public class Student {
    private String firstName;
    private int points;
    private static int totalPoints = 0;
    private static int greatestPoints = 0;

    public Student(String first) {
        firstName = first;
        points = 0;
    }

    public String studentInfo() {
        String str = "Student: " + firstName + "\n";
        str += "Student's Points: " + points;
        return str;
    }

    public void addPoints(int p) {
        points += p;
        totalPoints += p;
        if (points > greatestPoints) {
            greatestPoints = points;
        }
    }

    public static int getTotalPointsEarned() {
        return totalPoints;
    }

    public static int getGreatestPoints() {
        return greatestPoints;
    }

    public static String classInfo() {
        String str = "Total points earned by all students: " + totalPoints + "\n";
        str += "Most points earned by any student: " + greatestPoints;
        return str;
    }
}
