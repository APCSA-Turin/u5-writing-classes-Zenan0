package FRQ_Check;

public class StepTracker {
    private int activeDays;
    private int totalDays;
    private int totalSteps;
    private int minSteps;
  
    public StepTracker(int min) {
      activeDays = 0;
      totalDays = 0;
      totalSteps = 0;
      minSteps = min;
    }
  
    public int activeDays() {
      return activeDays;
    }
  
    public double averageSteps() {
      if (totalSteps == 0) {
        return 0;
      }
      return (double) totalSteps / totalDays;
    }
  
    public void addDailySteps(int steps) {
      totalSteps += steps;
      totalDays++;
      if (steps >= minSteps) {
        activeDays++;
      }
    }
  }
  