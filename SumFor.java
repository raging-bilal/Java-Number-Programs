// Using Java for Loop
// Using Java for loop is the easiest way to find the sum of natural numbers.

// SumOfNaturalNumber1.java

public class SumFor {
    public static void main(String[] args) {
        int i, num = 10, sum = 0;
        // executes until the condition returns true
        for (i = 1; i <= num; ++i) {
            // adding the value of i into sum variable
            sum = sum + i;
        }
        // prints the sum
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}