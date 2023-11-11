public class ReverseArray {

    static void displayArrayBackward(int[] array, int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            // Display the last entry in the portion first
            System.out.print(array[endIndex] + " ");

            // Make a recursive call for the remaining portion
            displayArrayBackward(array, startIndex, endIndex - 1);
        }
    }
}
