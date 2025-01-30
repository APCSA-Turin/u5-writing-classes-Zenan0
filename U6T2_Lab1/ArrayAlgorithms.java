package U6T2_Lab1;

public class ArrayAlgorithms {
    private ArrayAlgorithms() {  }

    /** Returns the average of all values in numList as a double.
     *
     *  PRECONDITION: numList.length > 0
     */
    public static double average(int[] numList) {
        int total = 0;
        for (int i = 0; i < numList.length; i++) {
            total += numList[i];
        }
        return (double) total / numList.length;
    }

    /** Returns the value in numList that represents the minimum
     * value in numList.
     *
     *  PRECONDITION: numList.length > 0
     */
    public static int minimum(int[] numList) {
        int min = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (min > numList[i]) {
                min = numList[i];
            }
        }
        return min;
    }

     /** Returns the number of Strings in strList that contain the target.
     *
     *  PRECONDITION: strList.length > 0
     */
    public static int howManyContain(String[] strList, String target) {
        int count = 0;
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].indexOf(target) != -1) {
                count++;
            }
        }
        return count;
    }

    /** Returns an array containing all characters in myStr, in order.
     *
     *  PRECONDITION: myStr.length() > 0
     */
    public static String[] stringToArray(String myStr) {
        String[] stringList = new String[myStr.length()];
        for (int i = 0; i < myStr.length(); i++) {
            stringList[i] = myStr.substring(i, i + 1);
        }
        return stringList;
    }

      /**  This method checks each Person in the people array, and if they
        *  are an adult (at least 18 years old), they introduce themselves
        *  (i.e. by calling the introduce() method)
        *
        *  PRECONDITION: people.length > 0
        */
    public static void introduceAdults(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= 18) {
                people[i].introduce();
            }
        }
    }

    /** Prints each String in wordList, on its own line, in reverse order;
     *  the characters of each string are also reversed.
     *
     *  PRECONDITION: wordList.length > 0
     */
    public static void reversePrint(String[] wordList) {
        for (int i = wordList.length - 1; i >= 0; i--) {
            String reverseString = "";
            for (int j = wordList[i].length(); j > 0; j--) {
                reverseString += wordList[i].substring(j - 1, j);
            }
            System.out.println(reverseString);
        }
    }

    /** Returns a new array containing all elements from arr1 combined with 
     *  all elements from arr2; arr1's elements should be followed by
     *  arr2's elements
     *
     *  PRECONDITION: arr1.length > 0, arr2.length > 0
     */
    public static int[] combine(int[] arr1, int[] arr2) {
        int totalLength = arr1.length + arr2.length;
        int[] newArr = new int[totalLength];
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < totalLength; i++) {
            newArr[i] = arr2[temp];
            temp++;
        }
        return newArr;
    }

    /** Changes the first and last element of nums to be num
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: nums.length > 0
     */
    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

    /** Multiplies each number in numList by multiplier.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * multiplier;
        }
    }

    /** Returns an array of ints where each element is the product
     *  of the corresponding element in numList and multiplier.
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] newArr = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            newArr[i] = numList[i] * multiplier;
        }
        return newArr;
    }

    /** Adds a "!" to the end of each String in wordList.  However, if a
     *  a string already ends in an exclamation point, do NOT add another.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: wordList.length > 0
     */
    public static void addExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            String currentWord = wordList[i];
            if (!currentWord.substring(currentWord.length() - 1, currentWord.length()).equals("!")) {
                wordList[i] += "!";
            }
        }
    }

    /** Returns an array of booleans where each element reflects whether
     *  the corresponding element in tempList is at or below the freezing
     *  temperature of 32 (true) or not (false).
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: tempList.length > 0
     */
    public static boolean[] isFreezing(int[] tempList) {
        boolean[] isFreezingList = new boolean[tempList.length];
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i] <= 32) {
                isFreezingList[i] = true;
            } else {
                isFreezingList[i] = false;
            }
        }
        return isFreezingList;
    }

    /** Shifts all elements in numList to the LEFT one index
     *
     *  The first element in the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
     *  with the last element wrapping around to the back)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftLeft(int[] numList) {
        int temp = numList[0];
        for (int i = 0; i < numList.length - 1; i++) {
            numList[i] = numList[i + 1];
        }
        numList[numList.length - 1] = temp;
    }

    /** Shifts all elements in numList to the RIGHT one index.
     *
     *  The last element in the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
     *  with the last element wrapping around to the front)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftRight(int[] numList) {
        int temp = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i - 1];
        }
        numList[0] = temp;
    }

    /** Reverses all elements in an array.
     *
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  modifies the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    // public static void reverse(int[] numList) {
    //     int[] newList = new int[numList.length];
    //     int temp = 0;
    //     for (int i = numList.length - 1; i >= 0; i--) {
    //         newList[temp] = numList[i];
    //         temp++;
    //     }
    //     for (int i = 0; i < numList.length; i++) {
    //         numList[i] = newList[i];
    //     }
    // }

    public static void reverse(int[] numList) {
        for (int i = 0; i < numList.length / 2; i++) {
            int temp = numList[numList.length - 1 - i];
            numList[numList.length - 1 - i] = numList[i];
            numList[i] = temp;
        }
    }
}