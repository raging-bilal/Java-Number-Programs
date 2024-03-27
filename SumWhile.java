// Using Java while Loop
// In the following example, we have replaced the for loop with the while loop. The while loop executes until the condition i <= num do not become false. It calculates the sum of natural numbers up to a specified limit.

// SumOfNaturalNumber2.java

public class SumWhile {
    public static void main(String[] args) {
        int num = 100, i = 1, sum = 0;
        // executes until the condition returns true
        while (i <= num) {
            // adding the value of i into sum variable
            sum = sum + i;
            // increments the value of i by 1
            i++;
        }
        // prints the sum
        System.out.println("Sum of First 100 Natural Numbers is = " + sum);
    }
}