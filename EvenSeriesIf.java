// Using nested-if Statement
// The following program is slightly different from the above program because we have defined a method that contains the logic to check even number. Inside the method, we have used nested-if statement.




public class EvenSeriesIf {
    public static void main(String[] args) {
        System.out.println("List of even numbers: ");
        // method calling
        displayEvenNumbers(1, 100);
    }

    // method that checks the number is even or not
    private static void displayEvenNumbers(int number, int end) {
        if (number > end)
            return;
        if (number % 2 == 0) {
            // prints the even numbers
            System.out.print(number + " ");
            // calling the method and increments the number by 2 if the number is even
            displayEvenNumbers(number + 2, end);
        } else {
            // increments the number by 1 if the number is odd
            displayEvenNumbers(number + 1, end);
        }
    }
}