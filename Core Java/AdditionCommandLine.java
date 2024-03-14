public class AdditionCommandLine {
    public static void main(String[] args) {
        
        // Parse command-line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Perform addition
            int sum = num1 + num2;

            // Display the result
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
