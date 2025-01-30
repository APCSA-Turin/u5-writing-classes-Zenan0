package U5T7_StaticMethods1;

public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String scale;

    public Temperature(double high, double low, String scale) {
        highTemp = high;
        lowTemp = low;
        if (scale.equals("C")) {
            this.scale = scale;
        } else {
            this.scale = "F";
        }
    }

    public static double convertCtoF(double temp) {
        return (temp * 9/5) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * (5.0/9);
    }

    public void changeToC() {
        if (!scale.equals("C")) {
            scale = "C";
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
        }
    }

    public void changeToF() {
        if (!scale.equals("F")) {
            scale = "F";
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
        }
    }

    public String tempInfo() {
        String str = "High temperature: " + highTemp + " " + scale + "\n";
        str += "Low temperature: " + lowTemp + " " + scale;
        return str; 
    }
}
