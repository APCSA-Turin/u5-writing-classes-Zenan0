package U5T7_StaticMethodsAndVariables;

public class Nums {
    private int int1;
    private int int2;
    private int numsGenerated;
    private static int totalNumsGenerated = 0;

    public Nums(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
        numsGenerated = 0;
    }

    public int randBetween() {
        numsGenerated++;
        totalNumsGenerated++;
        return (int) (Math.random() * (int2 - int1 + 1)) + int1;
    }

    public int getRandomNumsGenerated() {
        return numsGenerated;
    }

    public static int getTotalRandomNumsGenerated() {
        return totalNumsGenerated;
    }
}
