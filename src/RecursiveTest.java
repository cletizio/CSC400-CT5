public class RecursiveTest {
    public static void main(String[] args) {
        int number = 12;
        int resultOne = RecursiveMethods.factorialOne(number);
        System.out.println("Factorial of " + number + " is: " + resultOne);

        long resultTwo = RecursiveMethods.factorialTwo(number);
        System.out.println("Factorial of " + number + " is: " + resultTwo);
    }
}
