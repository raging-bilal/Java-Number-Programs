// Using Function
// In the following program, we have found the sum of n natural number using the function.

// SumOfNaturalNumber4.java

public class SumFunction {
    // method that returns the sum of n natural numbers
    static int naturalNumberSum(int n) {
        int sum = 0;
        // executes until the condition becomes false
        for (int i = 1; i <= n; i++)
            // adding the value of i to the sum variable
            sum = sum + i;
        return sum;
    }

    // main method
    public static void main(String args[]) {
        int n = 10;
        // calling method and prints the sum
        System.out.println("Sum of Natural Numbers is: " + naturalNumberSum(n));
    }
}