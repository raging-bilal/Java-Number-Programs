// Sum of n Natural Numbers
// The following program finds the sum of n natural numbers. In this program, we have used the same while loop, as we have used in the above program. We have also taken two inputs from the user i.e. i and num. The variable i is the starting number and the variable num is the end number. For example, if we want to find the sum of natural numbers from 20 (i) to 100 (num).

// SumOfNaturalNumber3.java

import java.util.Scanner;

public class SumWhileLimit {
    public static void main(String[] args) {
        int num, i, sum = 0;
        // object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum from: ");
        // takes an integer as input
        i = sc.nextInt();
        System.out.print("Sum up to: ");
        // takes an integer as input
        num = sc.nextInt();
        while (i <= num) {
            // adding the value of i into sum variable
            sum = sum + i;
            // increments the value of i by 1
            i++;
        }
        // prints the sum
        System.out.println("Sum of Natural Numbers = " + sum);

        sc.close();
    }
}