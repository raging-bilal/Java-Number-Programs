
// Let's see another program.

// In the following program, we have used the formula to find the sum of natural numbers.

// SumOfNaturalNumber5.java

public class SumFormula {
    // method that returns the sums
    static int sumOfNaturalNumbers(int n) {
        // formula to calculate the sum of natural numbers
        return n * (n + 1) / 2;
    }

    // main method
    public static void main(String args[]) {
        int n = 10;
        // calling the method and printing the sum
        System.out.println("Sum of Natural Numbers is: " + sumOfNaturalNumbers(n));
    }
}