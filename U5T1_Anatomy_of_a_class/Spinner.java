public class Spinner {
    private int sections;
    private int recentSpin;
    private int timesSpun;
    private int totalSpinValue;

    public Spinner(int sections) {
        this.sections = sections;
    }

    public int spin() {
        recentSpin = (int) (Math.random() * sections) + 1;
        timesSpun++;
        totalSpinValue += recentSpin;
        return recentSpin;
    }

    public int getRecentSpin() {
        return recentSpin;
    }

    public int getTimesSpun() {
        return timesSpun;
    }

    public int getTotalSpinValue() {
        return totalSpinValue;
    }

    public double getAverageSpinValue() {
        return (double) totalSpinValue / timesSpun;
    }
}
