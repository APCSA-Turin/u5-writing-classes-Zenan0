package U5T7_StaticMethods1;

public class Main {
    public static void main(String[] args) {
        // --- test milesToKm method ---
        // 1. use static milesToKm method to convert 13.85
        //    miles to kilometers; print the converted result
        System.out.println(RaceUtility.milesToKm(13.85));

        // 2. use static milesToKm method to convert 26.42
        //    miles to kilometers; print the converted result
        System.out.println(RaceUtility.milesToKm(26.42));

        // --- test kmToMiles method ---
        // 3. use static kmToMiles method to convert 40 km
        //    to miles; print the converted result
        System.out.println(RaceUtility.kmToMiles(40));

        // 4. use static kmToMiles method to convert 3.5 km
        //    to miles; print the converted result
        System.out.println(RaceUtility.kmToMiles(3.5));

        // --- test makeProper method ---
        // 5. use static makeProper method to make the string
        // "welcome to the marathon!" proper; print the result
        String title = "welcome to the marathon!";
        System.out.println(RaceUtility.makeProper(title));

        // 6. use static makeProper method to make the string
        // "It's TIME for THE 5k!" proper; print the result
        String title2 = "It's TIME for THE 5k!";
        System.out.println(RaceUtility.makeProper(title2));
    }
}
