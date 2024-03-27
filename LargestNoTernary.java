// Let's use the ternary operator in a Java program to compare three variables.

// // In the following program, we have used two ternary operators to compare three numbers.


import java.util.Scanner;

public class LargestNoTernary {
    public static void main(String[] args) {
        int a, b, c, largest, temp;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        // reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        // comparing a and b and storing the largest number in a temp variable
        temp = a > b ? a : b;
        // comparing the temp variable with c and storing the result in the variable
        largest = c > temp ? c : temp;
        // prints the largest number
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}