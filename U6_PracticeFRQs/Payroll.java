package U6_PracticeFRQs;

public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
        double total = 0;
         for (int i = 0; i < itemsSold.length; i++) {
           total += itemsSold[i];
         }
         int max = itemsSold[0];
         for (int i = 0; i < itemsSold.length; i++) {
           if (max < itemsSold[i]) {
             max = itemsSold[i];
           }
         }
         int min = itemsSold[0];
         for (int i = 0; i < itemsSold.length; i++) {
           if (min > itemsSold[i]) {
             min = itemsSold[i];
           }
         }
         total -= max + min;
         return total / (itemsSold.length - 2);
    }    
   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
        for (int i = 0; i < itemsSold.length; i++) {
           double wage = fixedWage + perItemWage * itemsSold[i];
           if (itemsSold[i] > computeBonusThreshold()) {
             wage *= 1.1;
           }
           wages[i] = wage;
         }
    }    

    public double[] getWages() {
        return wages;
    }    
  }
  