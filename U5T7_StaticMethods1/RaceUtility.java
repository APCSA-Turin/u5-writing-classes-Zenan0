package U5T7_StaticMethods1;

public class RaceUtility {
    public RaceUtility() {  }
    public static double milesToKm(double miles) {
        return miles * 1.609;
    }

    public static double kmToMiles(double km) {
        return km * 0.621;
    }

    public static String makeProper(String str) {
        String lowerStr = str.toLowerCase();
        String newStr = "";
        newStr += str.substring(0, 1).toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            String currentLetter = lowerStr.substring(i, i + 1);
            if (lowerStr.substring(i - 1, i).equals(" ")) {
                newStr += currentLetter.toUpperCase();
            } else {
                newStr += currentLetter;
            }
        }
        return newStr;
    }
}
