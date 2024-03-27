// Let's use the ternary operator in a Java program to compare three variables.

// In the following program, we have used two ternary operators to compare three numbers.



import java.util.Scanner;

public class SmallestNoTernary {
    public static void main(String[] args) {
        int a, b, c, smallest, temp;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        // reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        // comparing a and b and storing the smallest number in a temp variable
        temp = a < b ? a : b;
        // comparing the temp variable with c and storing the result in the variable
        // names smallest
        smallest = c < temp ? c : temp;
        // prints the smallest number
        System.out.println("The smallest number is: " + smallest);
        sc.close();
    }
}