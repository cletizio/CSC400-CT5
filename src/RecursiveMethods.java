public class RecursiveMethods {
    public static int factorialOne(int n) {
        // Base case: when n is 0 or 1, the factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorialOne(n - 1);
        }
    }

    static long factorialTwo(int n){
        return factorialHelper(n, 1);
    }

    static long factorialHelper(int n, long partialResult){
        if (n == 0){
            return partialResult;
        }
        else {
            return factorialHelper(n-1, n * partialResult);
        }
    }
}
