package U5T7_StaticMethodsAndVariables;

public class Thing {

    private static String sharedName = "beep!";

    private String name;

    public Thing(String name) {
        this.name = name; 
    }

    public static String getSharedName() {
        return sharedName;
    }

    public static void setSharedName(String newSharedName) {
        sharedName = newSharedName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    // add letters to instance variable and static variable
    public void addLetters(String letters) {
        name += letters;
        sharedName += letters;
    }
}
