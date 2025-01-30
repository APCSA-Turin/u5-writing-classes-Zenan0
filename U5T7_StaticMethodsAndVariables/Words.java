package U5T7_StaticMethodsAndVariables;

public class Words {
    private Words () {  }

    public static Boolean doesContain(String first, String second) {
        if (second.indexOf(first) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void printReverse(String str) {
        String reverse = "";
        for (int i = str.length(); i > 0; i--) {
            reverse += str.substring(i - 1, i) + " ";
        }
        System.out.println(reverse);
    }
}
