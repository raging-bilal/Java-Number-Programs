// Using Java while Loop
// In the following example, we have used while loop to test the condition. The loop executes until the condition n1!=n2 becomes false.



public class GcdWhile {
    public static void main(String[] args) {
        int n1 = 50, n2 = 60;
        while (n1 != n2) {
            if (n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
        System.out.printf("GCD of n1 and n2 is: " + n2);
    }
}